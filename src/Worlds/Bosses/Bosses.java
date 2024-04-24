/********************************************************
@author(s)          Fawaaz Kamali Siddiqui and Lemi Miyu
@date               24 April 2024
@teacher            Andrew Carreiro
@file               Bosses.java
@description        Parent class for the Bosses, creating 
                    necessary attributes for bosses.
********************************************************/
package src.Worlds.Bosses;
import src.Worlds.MainCharacter;
import src.Worlds.Wand.*;
import src.*;
import java.util.Scanner;


public class Bosses 
{

    // CLASS VARIABLES
    private String bossName;
    private double hp;
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


    // constructor method
    public Bosses()
    {
        
        bossName = "";
        hp = 0;
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
        scanner = new Scanner(System.in);

    }

    // GETTERS

    public String getBossName() 
    {
        return this.bossName;
    }

    public double getHp() {

        return this.hp;
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
    public void fight()
    {
        MainCharacter character = new Main.character; // error on this line
        boolean defenseMode = true; // user always starts from defense mode
        Scanner scanner = new Scanner(System.in);
        double userHP = character.getHP();
        double bossHP = this.getHp();
        double bossDefense = this.getDefense();
        double bossAttack = this.getOffense();
        double userDefense = character.getDefense();
        double userAttack = character.getOffense();
        double userOffense = character.getOffense();
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
            System.out.printf("User HP: %d%n", userHP);
            System.out.printf("Boss HP: %d%n", bossHP);
        }

        // if user has defeated the boss
        if (userHP > 0)
        {
            System.out.println("Congratulations. You have defeated the boss.");
        }
    }

}
