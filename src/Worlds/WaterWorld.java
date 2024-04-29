/********************************************************
@author(s)          Fawaaz Kamali Siddiqui
@date               25 April 2024
@teacher            Andrew Carreiro
@file               WaterWorld.java
@description        *insert class description here
********************************************************/

package worlds;

import worlds.bosses.WaterBoss;
import worlds.sidequests.WaterQuest1;
import worlds.sidequests.WaterQuest2;


public class WaterWorld extends Worlds
{

    // constructor
    public WaterWorld()
    {
        super();

        // set side quests for this world
        setSideQuest1(new WaterQuest1());
        setSideQuest2(new WaterQuest2());
        setName("Water World (Multiplya)");

        // set boss for this world
        setBoss(new WaterBoss());
        setIsWorldComplete(getBoss().isDefeated());
    }

}
