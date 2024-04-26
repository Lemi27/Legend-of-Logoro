/********************************************************
@author(s)          Shreekavin Umasankar
@date               19-April-2024
@teacher            Andrew Carreiro
@file               AirQuest2.java
@description        Second side quest in the air world.
********************************************************/

package src.Worlds.SideQuests;

import src.Worlds.MainCharacter;
import src.Worlds.Functionalities.Utilities;

public class AirQuest2 extends SideQuests {

    //Constructor
    public AirQuest2()
    {
        super();
    }

    /*******************
    execute(MainCharacter character)
    @param          character
    @return         void
    @description    This method runs the side quest program for AirQuest2
    *******************/

    public void execute(MainCharacter character)
    {
        if (!this.isComplete()) //Checks if the side quest has been completed already
        {
            //Variable Decleration and Initialization
            int answer = 12; //Answer to the riddle
            int input; //Users guess
            int chances = 2; //Chances the user has to guess correctly


            //Initial output
            Utilities.slowPrint("In the heart of a fog-shrouded forest, you feel a chill unlike any other. From the mist emerged an air monster, its form swirling with dark clouds and lightning.\n"+
            "\"Human,\" it rumbled, its voice echoing like thunder, \"to pass, unravel this cipher.\"It posed its cryptic riddle: \"I am an even number. If you add half of me to a third of me, you get 10.\"", 20);


            //Processing
            do
            {
                input = utilities.inputInt("What number shall prevail?", -10000, 100000); //Assure input

                //Check if the user has guessed correctly
                if (answer != input && chances == 2)
                {
                    Utilities.slowPrint("Sorry, that's not correct,\"the monster's voice boomed with disgrace. You have 1 chance remaining.", 10);
                    chances--;

                }else if (answer != input && chances == 1)
                {
                    Utilities.slowPrint("The monster responds with disappointment. You face the consequences of losing 2 HP.\"Try again if you wish.\"", 10);
                    chances--;

                    //Remove Character HP
                    character.setHP(character.getHP() - 2);

                }
            } while (answer != input); //Force user to try again if they guess incorrectly
            

            if (chances > 0) //Ensure the user gets their reward if they guess correctly
            {
                Utilities.slowPrint("The air monster's stormy eyes narrowed, then softened. \"Correct,\" it grumbled approvingly. \"You may proceed.\n\""+
                "With a thunderous clap, the monster dissipated into the mist, unveiling the hidden prize. Emboldened, you ventured forth.", 10);

                //Gives the user currency once they guess correctly.
                character.setCurrency(character.getCurrency() + 10);

                //Update game progress
                character.updateProgress(0, 1);
            }


        }else //Else in case the side quest has been completed
        {
            Utilities.slowPrint("This Side Quest has been completed", 10);
        }
        
    } //End of Method

}//End of class

