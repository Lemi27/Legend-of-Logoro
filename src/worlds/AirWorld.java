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
import worlds.functionalities.Utilities;

public class AirWorld extends Worlds
{

    // constructor
    public AirWorld()
    {
        super();

        // set side quests for this world
        setSideQuest1(new AirQuest1());
        setSideQuest2(new AirQuest2());
        setName("Air World (Mathania)");

        // set boss for this world
        setBoss(new AirBoss());
        setIsWorldComplete(getBoss().isDefeated());
    }


    // storyline for this world
    @Override
    public void beginningStoryline(MainCharacter character)
    {
        System.out.println("===========================================================================");
        System.out.println("*Professor Puzzler Speaking:*");
        Utilities.slowPrint("Your journey begins on Mathania, a planet where equations flourish with enchanted arrays of addition.", 50);
        System.out.println(); // newline
        Utilities.slowPrint(character.getFirstName() + ", you will encounter evil air sprits and monsters who plague you with solving addition puzzles.", 50);
        System.out.println(); 
        Utilities.slowPrint("Finally, you must locate and destroy Aeritha the Summator, a tyrannical bully, to acquire the first piece of the prism.", 50);
        System.out.println(); // newline
        Utilities.freeze(1000); // give user reading time
    }

    

}
