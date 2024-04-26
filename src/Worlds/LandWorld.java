package src.Worlds;
/********************************************************
@author(s)          Fawaaz Kamali Siddiqui
@date               25 April 2024
@teacher            Andrew Carreiro
@file               LandWorld.java
@description        *insert class description here
********************************************************/
import src.Worlds.SideQuests.*;
import src.Worlds.Bosses.*;

public class LandWorld extends Worlds
{

    // constructor
    public LandWorld()
    {
        super();

        // set side quests for this world
        setSideQuest1(new LandQuest1());
        setSideQuest2(new LandQuest2());

        // set boss for this world
        setBoss(new LandBoss());
        setIsWorldComplete(getBoss().isDefeated());
    }

}
