/********************************************************
@author(s)          Fawaaz Kamali Siddiqui
@date               25 April 2024
@teacher            Andrew Carreiro
@file               MasterWorld.java
@description        *insert class description here
********************************************************/

package worlds;

import worlds.bosses.MasterBoss;
import worlds.functionalities.Utilities;
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
        setName("Master World (Operationaria)");

        // set boss for this world
        setBoss(new MasterBoss());
        setIsWorldComplete(getBoss().isDefeated());
    }


    // storyline for this world
    @Override
    public void beginningStoryline(MainCharacter character)
    {
        Utilities.slowPrint("Finally, you reach the mysterious planet of Operationaria, where equations and magic blend and intertwine in a complex dance of mathematical operations, changing the fabric of reality.", 50);
        System.out.println(); // newline
        Utilities.slowPrint(character.getFirstName() + ", you have done a wonderful job so far. Here, you confront mathematical gatekeepers and masters, forged from air, land, water, and fire—the ultimate test of mathematical prowess.", 50);
        System.out.println(); 
        Utilities.slowPrint("Onimus the Operation Overlord, the strongest and most influential ruler of any planet you've faced so far, is frustarted with how you've overthrown his vassal planets.", 50);
        System.out.println(); // newline
        Utilities.slowPrint("He seeks to put an end to your fame and continue spreading chaos, so he invites you to a public duel. Your duel will be so catastrophic that it will seen in the skies of other planets.", 50);
        System.out.println();
        Utilities.slowPrint("Defeat Onimus to acquire the final fragment of the prizm, and to save Logoro, restoring balance to the galaxy.", 50);
        System.out.println(); 
        Utilities.freeze(1000); // give user reading time
    }
}
