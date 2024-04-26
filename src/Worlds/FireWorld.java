package src.Worlds;
/********************************************************
@author(s)          Fawaaz Kamali Siddiqui
@date               25 April 2024
@teacher            Andrew Carreiro
@file               FireWorld.java
@description        *insert class description here
********************************************************/
import src.Worlds.SideQuests.*;
import src.Worlds.Bosses.*;

public class FireWorld extends Worlds
{

    // constructor
    public FireWorld()
    {
        super();

        // set side quests for this world
        setSideQuest1(new FireQuest1());
        setSideQuest2(new FireQuest2());

        // set boss for this world
        setBoss(new FireBoss());
        setIsWorldComplete(getBoss().isDefeated());
    }

}
