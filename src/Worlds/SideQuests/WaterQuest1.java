/********************************************************
@author(s)          Shreekavin Umasankar
@date               19-April-2024
@teacher            Andrew Carreiro
@file               WaterQuest1.java
@description        First side quest in the water world.
********************************************************/

package src.Worlds.SideQuests;

import src.Worlds.MainCharacter;
import src.Worlds.Functionalities.Utilities;

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

    public void execute(MainCharacter character) 
    {
        if (!this.isComplete()) //Checks if the side quest has been completed already
        {
            //Variable Decleration and Initialization
            int answer = 50; //Answer to the riddle
            int input; //Users guess
            int chances = 2; //Chances the user has to guess correctly


            //Initial output
            Utilities.slowPrint("Submerged in a world where oceans whispered secrets and waves painted tales, you encountered the Water Oracle—a luminescent figure formed of cascading waterfalls and shimmering pools."+
            "\"Seeker of the depths,\" it murmured, its voice a gentle cascade, \"to navigate these aqueous realms, solve my riddle and prove your aquatic prowess.\""+
            "It posed its cryptic challenge: \"Within the tides of ten and the waves of five, multiply the current's flow.\"", 20);


            //Processing
            do
            {
                input = utilities.inputInt("What truth shall arise?", -10000, 100000); //Assure input

                //Check if guess is correct
                if (answer != input && chances == 2)
                {
                    Utilities.slowPrint("The Water Oracle's luminous form dimmed slightly. \"Incorrect, I must take 1 of your chances, 1 remains.\" it intoned softly.", 10);
                    chances--;


                }if (answer != input && chances == 1)
                {

                    Utilities.slowPrint("You guess wrong again and remain adrift in this realm's mysteries.\"You loose 1 health in the process", 10);
                    chances--;

                    //Remove Character HP
                    character.setHP(character.getHP() - 1);

                }
            } while (answer != input); //Force user to try again if they guess incorrectly


            //Give the user their reward
            if (chances > 0)
            {
                Utilities.slowPrint("The Water Oracle's luminous form brightened, casting a radiant glow. \"Correct,\" it echoed melodiously. \"Continue your journey through the watery depths, and take these 5 coins.\""+
                "With a graceful swirl, the oracle parted the waters, revealing a path deeper into the mystical aquatic world. Emboldened, you venture forth, eager to unravel the secrets that the water realm held beneath its surface.", 10);
            
                //Gives the user currency once they guess correctly.
                character.setCurrency(character.getCurrency() + 5);
            }
            

        }else //Else in case the side quest has been completed
        {
            Utilities.slowPrint("This Side Quest has been completed", 10);
        }
        
    } //End of Method
        
}//End of class
