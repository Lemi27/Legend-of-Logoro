/********************************************************
@author(s)          Fawaaz Kamali Siddiqui
@date               25 April 2024
@teacher            Andrew Carreiro
@file               WaterWorld.java
@description        WaterWorld is a child class of the class
                    Worlds, setting up the attributes and behaviours
                    of the water world.
********************************************************/

package worlds;

import worlds.bosses.WaterBoss;
import worlds.functionalities.Utilities;
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


    // storyline for this world
    @Override
    public void beginningStoryline(MainCharacter character)
    {
        System.out.println("===========================================================================");
        System.out.println("*Professor Puzzler Speaking:*");
        Utilities.slowPrint("Multiplya awaits, and you navigate a realm of multiplying marvels and expansive arrays, knowledge hidden in the world's oceans.", 50);
        System.out.println(); // newline
        Utilities.slowPrint(character.getFirstName() + ", your exploration might take a turn when you encounter water oracles and guardians that test your knowledge on multiplication.", 50);
        System.out.println(); 
        Utilities.slowPrint("You must break into the castle of Maritima the Wet Whirler to end her chaotic rule over Multiplya and acquire the third fragment of the prism.", 50);
        System.out.println(); // newline
        Utilities.freeze(1000); // give user reading time
    }


}
