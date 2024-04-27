/********************************************************
@author(s)          Fawaaz Kamali Siddiqui and Lemi Miyu
@date               24 April 2024
@teacher            Andrew Carreiro
@file               Bosses.java
@description        Parent class for the Bosses, creating 
                    necessary attributes for bosses.
********************************************************/
package worlds.bosses;
import java.util.Scanner;

import worlds.MainCharacter;
import worlds.functionalities.Utilities;
import worlds.wand.Wand;


public class Bosses 
{

    // CLASS VARIABLES
    private String bossName;
    private double hp;
    private double maxHP;
    private double offense;
    private double defense;
    Wand bossWand = new Wand();
    int level;
    private int minAttack;
    private int minDefense;
    private int maxAttack;
    private int maxDefense;
    private boolean isDefeated;
    private Scanner scanner;

    public Utilities utilities;


    // constructor method
    public Bosses()
    {
        // default boss name
        bossName = "";
        hp = 0;
        maxHP = 10;
        offense = 0;
        defense = 0;
        bossWand.setName("Boss Wand");
        bossWand.setDefense(0);
        bossWand.setOffense(0);
        minAttack = 0;
        minDefense = 0;
        maxAttack = 0;
        maxDefense = 0; 
        isDefeated = false;
        level = 0;
        scanner = new Scanner(System.in);

        utilities = new Utilities();

    }

    // GETTERS

    public String getBossName() 
    {
        return this.bossName;
    }

    public double getHp() {

        return this.hp;
    }

    public double getMaxHP()
    {
        return this.maxHP;
    }

    public double getOffense() 
    {
        return this.offense;
    }

    public double getDefense()
    {
        return this.defense;
    }

    public int level() 
    {
        return this.level;
    }

    public int getMinAttack() 
    {
        return this.minAttack;
    }

    public int getMinDefense() 
    {
        return this.minDefense;
    }

    public int getMaxAttack() 
    {
        return this.maxAttack;
    }

    public int getMaxDefense() 
    {
        return this.maxDefense;
    }

    public boolean isDefeated()
    {
        return this.isDefeated;
    }

    public Wand getWand()
    {
        return this.bossWand;
    }

    // SETTERS

    public void setBossName(String bossName) 
    {
        this.bossName = bossName;
    }

    public void setHp(double hp) 
    {
        this.hp = hp;
    }

    public void setMaxHP(double hp)
    {
        this.maxHP = hp;
    }

    public void setOffense(double offense) 
    {
        this.offense = offense;
    }

    public void setDefense(double defense)
    {
        this.defense = defense;
    }

    public void setLevel(int level) 
    {
        this.level = level;
    }

    public void setMinAttack(int minAttack) 
    {
        this.minAttack = minAttack;
    }

    public void setMinDefense(int minDefense) 
    {
        this.minDefense = minDefense;
    }

    public void setMaxAttack(int maxAttack) 
    {
        this.maxAttack = maxAttack;
    }

    public void setMaxDefense(int maxDefense) 
    {
        this.maxDefense = maxDefense;
    }


    /*******************
    fight()
    @return         void
    @description    Method used by each boss to 
    *******************/
    public void fight(MainCharacter character)
    {
        // MainCharacter character = new Main.character; // error on this line
        boolean defenseMode = true; // user always starts from defense mode
        double userHP = character.getHP();
        double bossHP = this.getHp();
        double bossDefense = this.getDefense();
        double bossAttack = this.getOffense();
        double userDefense = character.getDefense();
        double userAttack = character.getOffense();
        double userWandDefense = character.getCurrentWand().getDefense();
        double userWandAttack = character.getCurrentWand().getOffense();
        double bossWandDefense = this.getWand().getDefense();
        double bossWandAttack = this.getWand().getOffense();
        int bossNum; 
        int userNum;
        int n = 1;
        double damage;

        while ((int)(userHP) > 0 && (int)(bossHP) > 0)
        {
            if (defenseMode)
            {   
                System.out.println("Defense Mode");
                // input section for number guess
                System.out.printf("Enter a number between %d and %d: ", minDefense, maxDefense);
                userNum = scanner.nextInt();
                bossNum = (int)(Math.random()*maxDefense + minDefense);
                System.out.println("Boss guessed " + bossNum);

                // if user guesses number
                if (userNum == bossNum)
                {
                    defenseMode = false;
                    n = 1;
                }
                else // if boss keeps attacking
                {
                    damage = (userDefense * userWandDefense)-((bossAttack * bossWandAttack) + (n*0.5));
                    if (damage <= 0)
                    {
                        userHP = (int)(userHP + damage); // casting to drop decimal
                    }
                    n++;
                }
            }
            else // attack mode for user
            {
                System.out.println("Offense mode");
                // input section for number guess
                System.out.printf("Enter a number between %d and %d: ", minAttack, maxAttack);
                userNum = scanner.nextInt();
                bossNum = (int)(Math.random()*maxAttack + minAttack);
                System.out.println("Boss guessed " + bossNum);

                // if boss guesses number
                if (userNum == bossNum)
                {
                    defenseMode = true;
                    n = 1;
                }
                else // if user keeps attacking
                {
                    damage = (bossDefense * bossWandDefense)-((userAttack * userWandAttack) + (n*0.5));
                    if (damage <= 0)
                    {   
                        bossHP = (int)(bossHP + damage); // casting to drop decimal
                    }
                    n++;
                }
            }

            // display each user's HP after a round
            System.out.printf("User HP: %d  ", userHP);
            // visual health bar
            Utilities.visualHealthBar((int)userHP, (int)character.getMaxHP());
            System.out.printf("Boss HP: %d  ", bossHP);
            Utilities.visualHealthBar((int)bossHP, (int)this.getMaxHP());
        }

        // if user has defeated the boss
        if (userHP > 0)
        {
            Utilities.slowPrint("Congratulations. You have defeated " + this.getBossName() + ".", 20);
            character.setCurrency(character.getCurrency()+3);
            this.isDefeated = true;
            this.updateProgress(character);
            character.setCurrentWorld(character.getCurrentWorld()+1); // character advances to next world
        }
        else // if user has lost to the boss
        {
            Utilities.slowPrint("You have lost a life. " + this.getBossName() + "remains undefeated.", 20);
            character.setLivesRemaining(character.getLivesRemaining()-1); // removing a life remaining
        }
    }

    // method for updating user progress once boss has been defeated
    public void updateProgress(MainCharacter character)
    {
        if (this.isDefeated)
        {
            character.updateProgress(level-1, 2); // index 2 of an array is always the boss fight
        }
    }

}
