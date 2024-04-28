/********************************************************
@author(s)          Fawaaz Kamali Siddiqui
@date               25 April 2024
@teacher            Andrew Carreiro
@file               FireWorld.java
@description        *insert class description here
********************************************************/

package worlds;

import worlds.bosses.FireBoss;
import worlds.sidequests.FireQuest1;
import worlds.sidequests.FireQuest2;



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
