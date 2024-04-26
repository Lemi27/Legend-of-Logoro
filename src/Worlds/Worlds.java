/********************************************************
@author(s)          Sinan Shana, Fawaaz Kamali Siddiqui
@date               *insert here
@teacher            Andrew Carreiro
@file               Worlds.java
@description        *insert class description here
********************************************************/
package src.Worlds;
import java.util.Scanner;

import src.Worlds.Bosses.*;
import src.Worlds.SideQuests.*;
import src.Worlds.Wand.*;
import src.Worlds.Functionalities.*;


public class Worlds
{

    // side quests and bosses declaration
    private SideQuests sidequest1;
    private SideQuests sidequest2;

    private Bosses boss;
    
    public Scanner scanner;
    public Utilities utilities;
    private boolean isWorldComplete;

    

    public Worlds()
    {
        // default side quests and bosses
        sidequest1 = new AirQuest1();
        sidequest2 = new AirQuest2();

        
        boss = new AirBoss();
        isWorldComplete = boss.isDefeated();

        scanner = new Scanner(System.in);
        utilities = new Utilities();
    }

    // GETTERS
    public SideQuests getSideQuest1()
    {
        return this.sidequest1;
    }

    public SideQuests getSideQuest2()
    {
        return this.sidequest2;
    }

    public Bosses getBoss()
    {
        return this.boss;
    }

    public boolean isWorldComplete()
    {
        return this.isWorldComplete;
    }

    // SETTERS
    public void setSideQuest1(SideQuests sideQuest)
    {
        this.sidequest1 = sideQuest;
    }

    public void setSideQuest2(SideQuests sideQuest)
    {
        this.sidequest2 = sideQuest;
    }

    public void setBoss(Bosses boss)
    {
        this.boss = boss;
    }

    public void setIsWorldComplete(boolean completion)
    {
        this.isWorldComplete = completion;
    }


    public void menu(MainCharacter character)
    {
        character.setHP(character.getMaxHP()); // setting max hp everytime a world is entered
        int menu = 0;
        // switch current wand 
        // do first sidequest
        // do second sidequest
        // access inventory

        // System.out.println("1: To access inventory. %n2: To do first sidequest. %n3: To do second sidequest. %n4: Fight Boss. %n5: Access Shop");
        do
        {
            menu = utilities.inputInt("Enter any of the menu options:%n1. Side Quest 1%n2. Side Quest 2%n3. Boss Fight%n4. Access Shop %n5. Access inventory (switch Current Wand)", 1, 5);
            switch(menu)
            {
                case 1:
                    sidequest1.execute();
                    break;
                case 2:
                    sidequest2.execute();
                    break;
                case 3:
                    boss.fight(character);
                    break;
                case 4:
                    this.accessShop(character);
                    break;
                case 5:
                    this.inventory(character);
                    break;
                default:
                    System.out.println("No such option found.");
            }
        } while(!boss.isDefeated() && character.getLivesRemaining() > 0);

    }

    public void inventory(MainCharacter character) // for switching wands
    {
        // System.out.println("What Wand do you want to switch to?")
        // Scanner uI = new Scanner(System.in);

        // String [] inventoryString = {"Whisperwind Willow","Sapphire Sprig", "Ember Pinecrest" ,"Guardian Oakhear" ,"Silverleaf Maplestar" ,"Tranquil Magnoliaspire","Ironbark Sentinel" , "Shadowed Ebonyreach", "Celestial Cypressglen", "Cherry Scepter", "Birch Scythe"};
        // // boolean [] inventory = {false, false, false, false, false, false, false, false, false, false, false};
        
        // if (uI.next().equals("Whisperwind Willow"))
        // {
        //     MainCharacter.setCurrentWand(Willow);
        // }
        // if (uI.next().equals("Sapphire Sprig")) 
        // {
        
        // }
        // if (uI.next().equals("Ember Pinecrest")) 
        // {
        // inventory[3] = true;
        // }
        // if (uI.next().equals("Guardian Oakhear")) 
        // {
        // inventory[4] = true;
        // }
        // if (uI.next().equals("Silverleaf Maplestar")) 
        // {
        // inventory[5] = true;
        // }
        // if (uI.next().equals("Tranquil Magnoliaspire")) 
        // {
        // inventory[6] = true;
        // }
        // if (uI.next().equals("Ironbark Sentinel")) 
        // {
        // inventory[7] = true;
        // }
        // if (uI.next().equals("Shadowed Ebonyreach")) 
        // {
        // inventory[8] = true;
        // }
        // if (uI.next().equals( "Celestial Cypressglen")){

        // }

        System.out.printf("");
        Wand[] wands = character.getInventory();
        int menu = 0;

        // display wands
        System.out.printf("%-20s %-10s %-10s %-10s", "Name", "Defense", "Offense", "Price");
        for (int i = 0; i < wands.length; i++)
        {
            System.out.print(i+1);
            wands[i].displayStatistics();
        }

        System.out.println(); // newline
        // display current wand
        System.out.print("Current Wand: ");
        character.getCurrentWand().displayStatistics();

        menu = utilities.inputInt("Enter wand that should be switched to: ", 1, wands.length);
        character.setCurrentWand(wands[menu-1]);
    }

    public void accessShop(MainCharacter character)
    {
        // all possible wands
        Wand[] wands = 
        {
            new Birch(), 
            new Cherry(), 
            new Cypress(),
            new Ebony(), 
            new IronWood(), 
            new Magnolia(), 
            new Maple(), 
            new Oak(), 
            new Pine(), 
            new Spruce(),
            new Willow() 
        };

        // array of wands that are not bought
        Wand[] availableWands = new Wand[0];

        for (int i = 0; i < wands.length; i++)
        {
            if (!wands[i].getIsBought())
            {
                availableWands = addWand(availableWands, wands[i]);
            }
        }

        // Displaying available wands
        System.out.println("Wands");
        System.out.printf("%-20s %-10s %-10s %-10s", "Name", "Defense", "Offense", "Price");
        for (int i = 0; i < availableWands.length; i++)
        {
            System.out.print(i+1);
            availableWands[i].displayStatistics();
        }

        // HP Increase
        System.out.println("HP Increase");
        System.out.printf("%s %-25s %-20s", availableWands.length+1, "Increase HP by 1 point", "2 coins");

        System.out.println(); // newline

        // input section
        int menu = 0;
        menu = utilities.inputInt("What do you want to buy(enter number): ", 1, availableWands.length+1);

        // if user wanted to boost HP
        if (menu == availableWands.length + 1)
        {
            if (character.getCurrency() > 2)
            {
                if ((int)character.getHP() < (int)character.getMaxHP())
                {
                    character.setHP(character.getHP() + 1);
                    character.setCurrency(character.getCurrency() - 2);
                }
                else 
                {
                    System.out.println("Character already has Maximum HP.");
                }
            }
            else 
            {
                System.out.println("Character does not have enough coins.");
            }
        }

        // if user wants another wand
        else if (menu >= 1 && menu <= availableWands.length)
        {
            Wand toBuy = availableWands[menu-1];
            if (character.getCurrency() >= toBuy.getPrice())
            {
                character.addWand(toBuy);
            }
            else 
            {
                System.out.println("Character does not have enough currency.");
            }
        }

        
    }

    private Wand[] addWand(Wand[] wands, Wand wand)
    {
        // copy array
        Wand[] nA = new Wand[wands.length+1];
        for (int i = 0; i < wands.length; i++)
        {
            nA[i] = wands[i];
        }
        nA[wands.length] = wand;
        return nA;
    }

}
