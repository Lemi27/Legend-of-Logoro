/********************************************************
@author(s)          Shreekavin Umasankar
@date               30-April-2024
@teacher            Andrew Carreiro
@file               WaterQuest2.java
@description        Second side quest in the water world.
********************************************************/

package src.Worlds.SideQuests;

import src.Worlds.MainCharacter;
import src.Worlds.Functionalities.Utilities;

public class WaterQuest2 extends SideQuests {

    //Constructor
    public WaterQuest2()
    {
        super();
    }
 
    /*******************
    execute(MainCharacter character)
    @param          character
    @return         void
    @description    This method runs the side quest program for WaterQuest2
    *******************/

    public void execute(MainCharacter character)
    {
        if (!this.isComplete()) //Checks if the side quest has been completed already
        {
            //Variable Decleration and Initialization
            int answer = 0; //Answer to the riddle
            int input; //Users guess
            int chances = 2; //Chances the user has to guess correctly


            //Initial output
            Utilities.slowPrint("Navigating a realm where shimmering lakes mirrored the sky and waterfalls sang ancient melodies, you found yourself standing before the Water Guardian—a majestic figure sculpted from flowing rivers and misty streams.\n"+
            "\"Traveler of the aquatic expanse,\" it murmured, its voice a soothing ripple, \"to journey further into these aqueous lands, unravel my enigmatic riddle and reveal your insight.\"\n"+
            "It presented its cryptic challenge: \" If you multiply the number of legs on a crab by the number of bones on a shark, you get me.\"", 20);


            //Processing
            do
            {
                input = utilities.inputInt("What number shall I be?", -10000, 100000); //Assure input

                //Check if answer is correct
                if (answer != input && chances == 2)
                {
                    Utilities.slowPrint("The Water Guardian's watery gaze dimmed momentarily. \"Incorrect,\" it intoned softly. 1 guess remains.\"", 10);
                    chances--;

                }else if (answer != input && chances == 1)
                {
                    Utilities.slowPrint("\"Incorrect again,\" said the Guardian. \"I shall remove 2 health and let you rethink the depths of the puzzle.", 10);
                    chances--;

                    //Remove Character HP
                    character.setHP(character.getHP() - 2);

                }
            } while (answer != input); //Force user to try again if they guess incorrectly


            //Give the user their answer reward
            if (chances > 0)
            {
                Utilities.slowPrint("The Water Guardian's watery gaze shimmered with approval. \"Correct,\" it echoed melodically. \"Forge ahead on your aquatic quest, and take these 10 coins.\"\n"+
                "With a graceful gesture, the guardian parted the waters, unveiling a pathway deeper into the enchanting water world. Fueled by success, you ventured forth, eager to discover the submerged secrets awaiting you.", 10);

                //Gives the user currency once they guess correctly.
                character.setCurrency(character.getCurrency() + 10);

                //Update game progress
                character.updateProgress(2, 1);
            }
            

        }else //Else in case the side quest has been completed
        {
            Utilities.slowPrint("This Side Quest has been completed", 10);
        }
        
    } //End of Method

}//End of class
