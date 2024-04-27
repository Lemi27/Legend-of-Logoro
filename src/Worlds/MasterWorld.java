/********************************************************
@author(s)          Fawaaz Kamali Siddiqui
@date               25 April 2024
@teacher            Andrew Carreiro
@file               MasterWorld.java
@description        *insert class description here
********************************************************/

package worlds;

import worlds.bosses.MasterBoss;
import worlds.sidequests.MasterQuest1;
import worlds.sidequests.MasterQuest2;


public class MasterWorld extends Worlds
{

    // constructor
    public MasterWorld()
    {
        super();

        // set side quests for this world
        setSideQuest1(new MasterQuest1());
        setSideQuest2(new MasterQuest2());

        // set boss for this world
        setBoss(new MasterBoss());
        setIsWorldComplete(getBoss().isDefeated());
    }

}
