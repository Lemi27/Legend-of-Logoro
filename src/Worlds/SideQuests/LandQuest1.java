/********************************************************
@author(s)          Shreekavin Umasankar
@date               30-April-2024
@teacher            Andrew Carreiro
@file               LandQuest1.java
@description        First side quest in the land world.
********************************************************/

package src.Worlds.SideQuests;

import src.Worlds.MainCharacter;
import src.Worlds.Functionalities.Utilities;

public class LandQuest1 extends SideQuests {

    //Constructor
    public LandQuest1 ()
    {
        super();
    }

    /*******************
    execute(MainCharacter character)
    @param          character
    @return         void
    @description    This method runs the side quest program for LandQuest1
    *******************/

    public void execute(MainCharacter character)
    {
        if (!this.isComplete()) //Checks if the side quest has been completed already
        {
            //Variable Decleration and Initialization
            int answer = 7; //Answer to the riddle
            int input; //Users guess
            int chances = 2; //Chances the user has to guess correctly


            //Initial output
            Utilities.slowPrint("In a realm where mountains touched the sky and rivers sang ancient songs, you find yourself facing the Earth Guardian—a colossal figure of stone and moss.\n"+
            "\"Seeker,\" it intoned, its voice deep as rumbling earth, \"to pass this sacred ground, solve my riddle and prove your worth.\"\n"+
            "It posed its cryptic challenge: \"Ten glowworms illuminate a dark cave. A hungry badger snatches three for a midnight snack.\"", 20);


            //Processing
            do
            {
                input = utilities.inputInt("How many glowworms remain to light the cave?", -10000, 100000); //Assure input

                //Check if the user has guessed correctly
                if (answer != input && chances == 2)
                {
                    Utilities.slowPrint("Sorry, that's not correct,\" the Guardian's voice roared. You have 1 chance remaning.", 10);
                    chances--;

                }else if (answer != input && chances == 1)
                {
                    Utilities.slowPrint("After guessing incorrectly, you face the consequences by taking 1 damage.", 10);
                    chances--;

                    //Remove Character HP
                    character.setHP(character.getHP() - 1);

                }
            } while (answer != input); //Force user to try again if they guess incorrectly


            //Ensure the user gets their reward
            if (chances > 0)
            {
            
                Utilities.slowPrint("The Earth Guardian's stony visage cracked into a smile. \"Correct,\" it boomed approvingly and gave 5 coins. \"You may continue your journey.\"\n"+
                "With a gentle tremor, the guardian stepped aside and went deep into the mystical land. Inspired, you moved forward, eager to uncover the world's secrets.", 10);

                //Gives the user currency once they guess correctly.
                character.setCurrency(character.getCurrency() + 5);

                //Update game progress
                character.updateProgress(1, 0);
            }
            
            
        }else //Else in case the side quest has been completed
        {
            Utilities.slowPrint("This Side Quest has been completed", 10);
        }

    } //End of Method

}//End of class
