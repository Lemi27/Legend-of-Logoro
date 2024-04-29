/********************************************************
@author(s)          Shreekavin Umasankar
@date               30-April-2024
@teacher            Andrew Carreiro
@file               WaterQuest1.java
@description        First side quest in the water world.
********************************************************/

package worlds.sidequests;

import worlds.MainCharacter;
import worlds.functionalities.Utilities;

public class WaterQuest1 extends SideQuests {

    //Constructor
    public WaterQuest1()
    {
        super();
    }

    /*******************
    execute(MainCharacter character)
    @param          character
    @return         void
    @description    This method runs the side quest program for WaterQuest1
    *******************/
    @Override
    public void execute(MainCharacter character) 
    {
        if (!character.getProgress()[2][0]) //Checks if the side quest has been completed already
        {
            //Variable Decleration and Initialization
            int answer = 50; //Answer to the riddle
            int input; //Users guess
            int chances = 2; //Chances the user has to guess correctly


            //Initial output
            System.out.println("========================================================");
            Utilities.slowPrint("Submerged in a world where oceans whispered secrets and waves painted tales, you encountered the Water Oracle—a luminescent figure formed of cascading waterfalls and shimmering pools.\n"+
            "\"Seeker of the depths,\" it murmured, its voice a gentle cascade, \"to navigate these aqueous realms, solve my riddle and prove your aquatic prowess.\"\n"+
            "It posed its cryptic challenge: \"Within the tides of ten and the waves of five, multiply the current's flow.\"\n", 20);


            //Processing
            do
            {
                input = Utilities.inputInt("What truth shall arise? "); //Assure input
                System.out.println("========================================================");

                //Check if guess is correct
                if (answer != input && chances == 2)
                {
                    Utilities.slowPrint("The Water Oracle's luminous form dimmed slightly. \"Incorrect, I must take 1 of your chances, 1 remains.\" it intoned softly.\n", 10);
                    chances--;


                }else if (answer != input && chances == 1)
                {

                    Utilities.slowPrint("You guess wrong again and remain adrift in this realm's mysteries.\"You loose 1 health in the process\n", 10);
                    chances--;

                    //Remove Character HP
                    character.setHP(character.getHP() - 1);

                }
            } while (answer != input && chances != 0); //Force user to try again if they guess incorrectly


            //Give the user their reward
            if (chances > 0)
            {
                Utilities.slowPrint("The Water Oracle's luminous form brightened, casting a radiant glow. \"Correct,\" it echoed melodiously. \"Continue your journey through the watery depths, and take these 10 coins.\"\n"+
                "With a graceful swirl, the oracle parted the waters, revealing a path deeper into the mystical aquatic world. Emboldened, you venture forth, eager to unravel the secrets that the water realm held beneath its surface.\n", 10);
            
                //Gives the user currency once they guess correctly.
                character.setCurrency(character.getCurrency() + 10);

                //Update game progress
                character.updateProgress(2, 0);
            }
            

        }else //Else in case the side quest has been completed
        {
            Utilities.slowPrint("This Side Quest has been completed\n", 10);
        }
        
    } //End of Method
        
}//End of class
