/********************************************************
@author(s)          Fawaaz Kamali Siddiqui
@date               24 April 2024
@teacher            Andrew Carreiro
@file               Bosses.java
@description        *insert class description here
********************************************************/
package Worlds.Bosses;

public class Bosses
{

    // default boss settings
    private double hp;
    private double offense;
    private Wand wand;
    private MainCharacter character;

    private boolean isDefeated;

    public Bosses(MainCharacter character)
    {
        hp = 20;
        offense = 20;
        wand = new Wand();
        this.character = character;

        // guess ranges for duelling
        int minAttack, minDefense = 1;
        int maxDefense = 4; // biggest number that user must guess to repel boss attack
        int maxAttack = 6; // biggest number boss must guess to repel user attack

        isDefeated = false;
    }

    /*******************
    fight()
    @return         void
    @description    *insert here
    *******************/
    public static void fight()
    {
        boolean defenseMode = true; // user starts off by defending in the duel
        int bossNum;
        int userNum;


    }

    /*******************
    updateProgress(int i, int j)
    @param          i
    @param          j
    @return         void
    @description    Used to update user's 2x2 progress 
                    array every time a boss is defeated
    *******************/
    public static void updateProgress(int x, int y)
    {
        if (isDefeated)
        {   
            
        }
    }

}
