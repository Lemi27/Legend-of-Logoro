/********************************************************
@author(s)          Sinan Shana, Fawaaz Kamali Siddiqui
@date               *insert here
@teacher            Andrew Carreiro
@file               Worlds.java
@description        *insert class description here
********************************************************/
package worlds;
import java.util.Scanner;

import worlds.bosses.AirBoss;
import worlds.bosses.Bosses;
import worlds.functionalities.Utilities;
import worlds.sidequests.AirQuest1;
import worlds.sidequests.AirQuest2;
import worlds.sidequests.SideQuests;
import worlds.wand.Birch;
import worlds.wand.Cherry;
import worlds.wand.Cypress;
import worlds.wand.Ebony;
import worlds.wand.IronWood;
import worlds.wand.Magnolia;
import worlds.wand.Maple;
import worlds.wand.Oak;
import worlds.wand.Pine;
import worlds.wand.Spruce;
import worlds.wand.Wand;
import worlds.wand.Willow;


public class Worlds
{

    // side quests and bosses declaration
    private SideQuests sidequest1;
    private SideQuests sidequest2;
    private String name;

    private Bosses boss;
    
    public Scanner scanner;
    private boolean isWorldComplete;

    

    public Worlds()
    {
        // default side quests and bosses
        sidequest1 = new AirQuest1();
        sidequest2 = new AirQuest2();
        name = "Default World";

        
        boss = new AirBoss();
        isWorldComplete = boss.isDefeated();

        scanner = new Scanner(System.in);
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

    public String getName()
    {
        return this.name;
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

    public void setName(String name)
    {
        this.name = name;
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
            System.out.println("\n\n"); // 3 newlines
            System.out.println("========================================================");
            System.out.printf("Level %s: %s%n", character.getCurrentWorld(), this.getName());
            System.out.printf("Currency: %s coins.%n", character.getCurrency());
            System.out.printf("Current HP: %s    ", character.getHP());
            Utilities.visualHealthBar((int)character.getHP(), (int)character.getMaxHP());
            System.out.printf("Lives Remaining: %s.%n", character.getLivesRemaining());
            System.out.printf("Current Wand: \n    %s.\n    Offense %s, Defense %s%n", character.getCurrentWand().getName(), character.getCurrentWand().getOffense(), character.getCurrentWand().getDefense());
            System.out.printf("Base Attack: %s. Base Defense: %s.%n", character.getOffense(), character.getDefense());
            System.out.println("========================================================");

            if (character.getHP() <= 0)
            {
                character.setLivesRemaining(character.getLivesRemaining()-1);
            }

            // menu = utilities.inputInt("Enter any of the menu options:%n1. Side Quest 1%n2. Side Quest 2%n3. Boss Fight%n4. Access Shop %n5. Access inventory (switch Current Wand)", 1, 5);
            System.out.println("Enter any of the menu options:");
            System.out.println("1. Side Quest 1");
            System.out.println("2. Side Quest 2");
            System.out.printf("3. Boss Fight w/ %s%n", this.getBoss().getBossName());
            System.out.printf("           (Base Defense %s, Base Offense %s), Wand Defense %s, Wand Offense %s%n", this.getBoss().getDefense(), this.getBoss().getOffense(), this.getBoss().getWand().getDefense(), this.getBoss().getWand().getOffense());
            System.out.println("4. Access Shop");
            System.out.println("5. Access Inventory (switch current wand)");
            menu = Utilities.inputInt("> ", 1, 5);

            System.out.println("\n\n"); // 3 newlines
            switch(menu)
            {
                case 1:
                    sidequest1.execute(character);
                    break;
                case 2:
                    sidequest2.execute(character);
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
        System.out.printf("%-10s%-30s%-10s%-10s%-10s%n", "No.",  "Name", "Defense", "Offense", "Price");
        for (int i = 0; i < wands.length; i++)
        {
            System.out.printf("%-10s", i+1);
            wands[i].displayStatistics();
        }

        System.out.println(); // newline
        // display current wand
        System.out.println("Current Wand: ");
        character.getCurrentWand().displayStatistics();

        menu = Utilities.inputInt("Enter wand that should be switched to, 0 to quit inventory: ", 0, wands.length);
        if (menu != 0)
        {
            character.setCurrentWand(wands[menu-1]);
        }
    }

    public void accessShop(MainCharacter character)
    {
        Wand birch = new Birch();
        Wand cherry = new Cherry(); 
        Wand cypress = new Cypress();
        Wand ebony = new Ebony();
        Wand ironwood = new IronWood(); 
        Wand magnolia = new Magnolia(); 
        Wand maple = new Maple(); 
        Wand oak = new Oak();
        Wand pine = new Pine(); 
        Wand spruce = new Spruce();
        Wand willow = new Willow(); 
        // all possible wands
        Wand[] wands = 
        {
            birch, cherry, cypress, ebony, ironwood, magnolia, maple, oak, pine, spruce, willow
        };

        // array of wands that are not bought
        Wand[] availableWands = new Wand[0];

        for (int i = 0; i < wands.length; i++)
        {
            if (countWands(character.getInventory(), wands[i]) == 0)
            {
                availableWands = addWand(availableWands, wands[i]);
            }
        }

        System.out.println("===========================================================================");
        System.out.printf("Money: %s coins%n", character.getCurrency());
        System.out.println("===========================================================================");
        // Displaying available wands
        System.out.println("Wands");
        System.out.printf("%-10s%-30s%-10s%-10s%-10s%n", "No.",  "Name", "Defense", "Offense", "Price");
        for (int i = 0; i < availableWands.length; i++)
        {
            System.out.printf("%-10s", i+1);
            availableWands[i].displayStatistics();
        }

        // HP Increase
        System.out.println("   HP Increase");
        System.out.printf("%s %-25s %-20s", availableWands.length+1, "Increase HP by 1 point", "2 coins");

        System.out.println(); // newline

        // input section
        int menu = 0;
        menu = Utilities.inputInt("Enter number to buy wand, 0 to leave the shop: ", 0, availableWands.length+1);

        // if user wanted to boost HP
        if (menu == availableWands.length + 1)
        {
            if (character.getCurrency()>= 2)
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
                character.setCurrency(character.getCurrency() - toBuy.getPrice());
            }
            else 
            {
                System.out.println("Character does not have enough currency.");
            }
        }

        
    }

    public void beginningStoryline(MainCharacter character)
    {
        // will be overriden in child classes
    }

    public void endStoryline()
    {
        // will be overriden in child classes
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

    // count the number of occurences a wand has in an array
    private static int countWands(Wand[] wands, Wand wand)
    {   
        int count = 0;
        for (int i = 0; i < wands.length; i++)
        {
            if (wands[i].getName().equals(wand.getName()))
            {
                count ++;
            }
        }
        return count;
    }

}
