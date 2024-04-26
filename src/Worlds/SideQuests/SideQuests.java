/********************************************************
@author(s)          Lemi Miyu, Shreekavin Umasankar
@date               19-April-2024
@teacher            Andrew Carreiro
@file               SideQuests.java
@description        Parent class for all side quests.
*******************************************************S*/

package src.Worlds.SideQuests;

import java.util.Scanner;
import src.Worlds.Functionalities.*;

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

}
