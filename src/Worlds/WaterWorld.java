package src.Worlds;
/********************************************************
@author(s)          Fawaaz Kamali Siddiqui
@date               25 April 2024
@teacher            Andrew Carreiro
@file               WaterWorld.java
@description        *insert class description here
********************************************************/
import src.Worlds.SideQuests.*;
import src.Worlds.Bosses.*;

public class WaterWorld extends Worlds
{

    // constructor
    public WaterWorld()
    {
        super();

        // set side quests for this world
        setSideQuest1(new WaterQuest1());
        setSideQuest2(new WaterQuest2());

        // set boss for this world
        setBoss(new WaterBoss());
        setIsWorldComplete(getBoss().isDefeated());
    }

}
