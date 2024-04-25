/********************************************************
@author(s)          Fawaaz Kamali Siddiqui, Matthew Kostuch
@date               22 April 2024
@teacher            Andrew Carreiro
@file               MainCharacter.java
@description        The pourpse of this class is to repersent the character in the game, the charcter has a set number of lives,
                    an invintory for wands (wands are purachsed with in-game currency) and a way to store progress between diffrent
                    worlds.
********************************************************/
package src.Worlds;

import src.Worlds.Wand.Wand;



public class MainCharacter
{

    // variables declaration
    private double hp;
    private double defense;
    private double offense;
    private Wand[] inventory;
    private int currentWorld;
    private boolean[][] progress = {
        // side quest 1, side quest 2, final boss
        {false, false, false}, 
        {false, false, false}, 
        {false, false, false}, 
        {false, false, false}, 
        {false, false, false}
    };
    private Wand currentWand;
    private int livesRemaining;
    private double maxHP; 
    private int currency;

    private String firstName;
    private String lastName;


    // constructor method
    public MainCharacter(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;

        // default values when main character is created
        hp = 20;
        maxHP = 20;
        offense = 1;
        defense = 1;
        currentWorld = 1;
        currentWand = new Wand();
        inventory[0] = currentWand;
        livesRemaining = 3;
        currency = 2;
    }

    // getter methods
    public double getHP()
    {
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

    public Wand[] getInventory()
    {
        return this.inventory;
    }

    public int getCurrentWorld()
    {
        return this.currentWorld;
    }

    public boolean[][] getProgress()
    {
        return this.progress;
    }

    public Wand getCurrentWand()
    {
        return this.currentWand;
    }

    public int getLivesRemaining()
    {
        return this.livesRemaining;
    }

    public int getCurrency()
    {
        return this.currency;
    }

    public String getFirstName()
    {
        return this.firstName;
    }

    public String getLastName()
    {
        return this.lastName;
    }

    // setter methods
    public void setHP(double hp)
    {
        this.hp = hp;
    }

    public void setMaxHP(double maxHP)
    {
        this.maxHP = maxHP;
    }

    public void setOffense(double offense)
    {
        this.offense = offense;
    }

    public void setDefense(double defense)
    {
        this.defense = defense;
    }

    public void addWand(Wand wand)
    {
        // code to add wand to inventory by adding 
        // another list element
    }

    public void setCurrentWorld(int world)
    {
        this.currentWorld = world;
    }

    public void updateProgress(int i, int j) // only used to change false values to true
    {
        this.progress[i][j] = true;
    }

    public void setCurrentWand(Wand wand)
    {
        this.currentWand = wand;
    }

    public void setLivesRemaining(int lives)
    {
        this.livesRemaining = lives;
    }

    public void setCurrency(int currency)
    {
        this.currency = currency;
    }

}