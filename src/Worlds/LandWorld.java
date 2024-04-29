/********************************************************
@author(s)          Fawaaz Kamali Siddiqui
@date               25 April 2024
@teacher            Andrew Carreiro
@file               LandWorld.java
@description        *insert class description here
********************************************************/

package worlds;

import worlds.bosses.LandBoss;
import worlds.functionalities.Utilities;
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


    // storyline for this world
    @Override
    public void beginningStoryline(MainCharacter character)
    {
        Utilities.slowPrint("Welcome to Subtractus, a planet where mountains touch the sky and rivers sing ancient songs.", 50);
        System.out.println(); // newline
        Utilities.slowPrint(character.getFirstName() + ", you will find yourself challenged by land monsters, collosal figures formed of millenia-old boulders and vegetation.", 50);
        System.out.println(); 
        Utilities.slowPrint("You must bring down Terraformer the Land Lacerator, who has been ruling over the people of Subtractus with an iron fist.", 50);
        System.out.println(); // newline
        Utilities.freeze(1000); // give user reading time
    }


}
