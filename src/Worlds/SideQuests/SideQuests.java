/********************************************************
@author(s)          Lemi Miyu
@date               19-April-2024
@teacher            Andrew Carreiro
@file               SideQuests.java
@description        Parent class for all side quests.
********************************************************/

package src.Worlds.SideQuests;

public class SideQuests {

    private boolean isComplete;

    public SideQuests()
    {
        isComplete = false;
    }

    public void begin() {

        

    }

    public boolean isComplete()
    {
        return this.isComplete;
    }

}
