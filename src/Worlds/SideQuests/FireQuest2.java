/********************************************************
@author(s)          Shreekavin Umasankar
@date               30-April-2024
@teacher            Andrew Carreiro
@file               FireQuest2.java
@description        Second side quest in the fire world.
********************************************************/

package src.Worlds.SideQuests;

import src.Worlds.MainCharacter;
import src.Worlds.Functionalities.Utilities;

public class FireQuest2 extends SideQuests {

    //Constructor
    public FireQuest2()
    {
        super();
    }

    /*******************
    execute(MainCharacter character)
    @param          character
    @return         void
    @description    This method runs the side quest program for FireQuest2
    *******************/
    @Override
    public void execute(MainCharacter character)
    {
        if (!this.isComplete()) //Checks if the side quest has been completed already
        {
            //Variable Decleration and Initialization
            int answer = 90; //Answer to the riddle
            int input; //Users guess
            int chances = 2; //Chances the user has to guess correctly
            

            //Initial output
            Utilities.slowPrint("In a land where flames painted the skies and lava rivers flowed, you found yourself facing the Ember Sage—a majestic figure crafted from dancing flames and glowing embers.\n"+
            "\"Traveler of the fiery expanse,\" it intoned, its voice echoing like crackling logs, \"to journey through this scalding realm, unravel my riddle's burning test.\"\n"+
            "It posed its cryptic challenge: \"Legend has it that the igenous jewels multiply when divided equally among the brave. If there are 720 jewels and they must be divided equally among 8 warriors.\"", 20);
            

            //Processing
            do
            {
                input = Utilities.inputInt("What number am I?", -10000, 100000); //Assure input

                //Check for correct answer
                if (answer != input && chances == 2)
                {
                    Utilities.slowPrint("The Ember Sage's flames wavered, its luminosity fading momentarily. \"Incorrect, try again\" it intoned.", 10);
                    chances--;

                }else if (answer != input && chances == 1)
                {
                    Utilities.slowPrint("Its voice carrying a hint of disappointment.\"You've lost 2 HP. Refocus your thoughts, or risk being ensnared by the fiery enigma of this realm.\"", 10);
                    chances--;

                    //Remove Character HP
                    character.setHP(character.getHP() - 2);

                }
            } while (answer != input); //Force user to try again if they guess incorrectly
    

            //Gives the user their reward if their guess is correct
            if (chances > 0)
            {
                Utilities.slowPrint("The Ember Sage's flames brightened, casting a warm glow. \"Correct,\" it affirmed. \"Forge ahead through the blazing challenges that await using these 10 coins.\"\n"+
                "With a sweeping gesture, the sage cleared a path through the flames, revealing a way deeper into the scorching world. Inspired by your success, you moved forward, ready to face the burning secrets ahead.", 10);
        
                //Gives the user currency once they guess correctly.
                character.setCurrency(character.getCurrency() + 10);

                //Update game progress
                character.updateProgress(3, 1);
            }


        }else //Else in case the side quest has been completed
        {
            Utilities.slowPrint("This Side Quest has been completed", 10);
        }
    
    } //End of Method 

}//End of class
