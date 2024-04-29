/********************************************************
@author(s)          Fawaaz Kamali Siddiqui
@date               25 April 2024
@teacher            Andrew Carreiro
@file               LandWorld.java
@description        *insert class description here
********************************************************/

package worlds;

import worlds.bosses.LandBoss;
import worlds.sidequests.LandQuest1;
import worlds.sidequests.LandQuest2;



public class LandWorld extends Worlds
{

    // constructor
    public LandWorld()
    {
        super();

        // set side quests for this world
        setSideQuest1(new LandQuest1());
        setSideQuest2(new LandQuest2());
        setName("Land World (Subtractus)");

        // set boss for this world
        setBoss(new LandBoss());
        setIsWorldComplete(getBoss().isDefeated());
    }

}
