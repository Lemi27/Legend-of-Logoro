/********************************************************
@author(s)          Fawaaz Kamali Siddiqui, Matthew Kostuch
@date               22 April 2024
@teacher            Andrew Carreiro
@file               MainCharacter.java
@description        *insert class description here
********************************************************/

package worlds;

import worlds.wand.Wand;
import worlds.functionalities.*;



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
    private boolean hasQuit;

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
        inventory = new Wand[1];
        inventory[0] = currentWand;
        livesRemaining = 3;
        currency = 2;
        hasQuit = false;
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

    public boolean hasQuit()
    {
        return this.hasQuit;
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
        // copy array
        Wand[] nA = new Wand[this.getInventory().length+1];
        for (int i = 0; i < this.getInventory().length; i++)
        {
            nA[i] = this.getInventory()[i];
        }
        nA[this.getInventory().length] = wand;
        
        // copy nA to inventory
        this.inventory = new Wand[nA.length];
        for (int i = 0; i < nA.length; i++)
        {
            this.inventory[i] = nA[i];
        }
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

    // methods to travel to different worlds


    /*******************
    world()
    @param          character
    @param          level
    @return         void
    @description    *insert here
    *******************/
    public void world(MainCharacter character, int level)
    {
        Worlds world = new Worlds();
        switch (level)
        {
            case 1:
                world = new AirWorld();
                break;
            case 2:
                world = new LandWorld();
                break;
            case 3:
                world = new WaterWorld();
                break;
            case 4:
                world = new FireWorld();
                break;
            case 5:
                world = new MasterWorld();
                break;
            default:
        }

        // storyline for world 1 displayed here

        world.beginningStoryline();

        while (!world.getBoss().isDefeated() && character.getLivesRemaining() > 0)
        {
            world.menu(character);
        }

        // if user defeats boss and advances to next round
        if (world.getBoss().isDefeated())
        {
            // storyline here
            world.endStoryline();
        }
        else 
        {
            // user has lost all lives
            Utilities.slowPrint("Game Over", 25);
            Utilities.slowPrint("You have lost all lives. Enter 'q' to quit.", 25);
            String[] options = {"Q", "q"};
            String menu = Utilities.inputString("> ", options);

            if (menu.toLowerCase().equals("q"))
            {
                this.hasQuit = true;
            }
        }


    }

}