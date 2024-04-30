/********************************************************
@author(s)          Fawaaz Kamali Siddiqui
@date               25 April 2024
@teacher            Andrew Carreiro
@file               FireWorld.java
@description        FireWorld is a child class of the class
                    Worlds, setting up the attributes and behaviours
                    of the fire world.
********************************************************/

package worlds;

import worlds.bosses.FireBoss;
import worlds.functionalities.Utilities;
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
        setName("Fire World (Dividia)");

        // set boss for this world
        setBoss(new FireBoss());
        setIsWorldComplete(getBoss().isDefeated());
    }


    // storyline for this world
    @Override
    public void beginningStoryline(MainCharacter character)
    {
        System.out.println("===========================================================================");
        System.out.println("*Professor Puzzler Speaking:*");
        Utilities.slowPrint("Welcome to Dividia, a realm of molten landscapes and lava rivers.", 50);
        System.out.println(); // newline
        Utilities.slowPrint(character.getFirstName() + ", you will be forced to solve fraction problems and division dilemmas by the entities born of fire and chaos.", 50);
        System.out.println(); 
        Utilities.slowPrint("Eventually, Ignitia the Flame Fractionator, an intelligent and scheming mage who is the de-facto lord of the planet, must be confronted. ", 50);
        System.out.println(); // newline
        Utilities.slowPrint("He is known for deceiving and exploiting his subjects. He may give you a hard time. Try your best to acquire the fourth piece of the prism.", 50);
        System.out.println();
        Utilities.freeze(1000); // give user reading time
    }

}
