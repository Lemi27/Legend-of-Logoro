/********************************************************
@author(s)          Shreekavin Umasankar
@date               30-April-2024
@teacher            Andrew Carreiro
@file               SideQuests.java
@description        Parent class for all side quests.
*******************************************************S*/

package worlds.sidequests;

import java.util.Scanner;

import worlds.MainCharacter;



public class SideQuests {

    private boolean isComplete;
    public Scanner scanner;

    public SideQuests()
    {
        isComplete = false;
        scanner = new Scanner(System.in);
    }

    public void begin() {

    }

    public boolean isComplete()
    {
        return this.isComplete;
    }

    public void execute(MainCharacter character)
    {
        // do nothing, will be overriden in other files
    }

}
