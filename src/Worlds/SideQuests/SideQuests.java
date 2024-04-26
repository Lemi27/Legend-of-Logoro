/********************************************************
@author(s)          Shreekavin Umasankar
@date               30-April-2024
@teacher            Andrew Carreiro
@file               SideQuests.java
@description        Parent class for all side quests.
*******************************************************S*/

package src.Worlds.SideQuests;

import java.util.Scanner;
import src.Worlds.Functionalities.*;
import src.Worlds.MainCharacter;

public class SideQuests {

    private boolean isComplete;
    public Scanner scanner;
    public Utilities utilities;

    public SideQuests()
    {
        isComplete = false;
        scanner = new Scanner(System.in);
        utilities = new Utilities();
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
