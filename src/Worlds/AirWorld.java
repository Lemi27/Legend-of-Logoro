/********************************************************
@author(s)          Fawaaz Kamali Siddiqui
@date               25 April 2024
@teacher            Andrew Carreiro
@file               AirWorld.java
@description        *insert class description here
********************************************************/

package worlds;

import worlds.sidequests.*;
import worlds.bosses.*;

public class AirWorld extends Worlds
{

    // constructor
    public AirWorld()
    {
        super();

        // set side quests for this world
        setSideQuest1(new AirQuest1());
        setSideQuest2(new AirQuest2());

        // set boss for this world
        setBoss(new AirBoss());
        setIsWorldComplete(getBoss().isDefeated());
    }

    

}
