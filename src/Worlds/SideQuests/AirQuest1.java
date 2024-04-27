/********************************************************
@author(s)          Shreekavin Umasankar
@date               30-April-2024
@teacher            Andrew Carreiro
@file               AirQuest1.java
@description        First side quest in the air world.
********************************************************/

package worlds.sidequests;

import worlds.MainCharacter;
import worlds.functionalities.Utilities;

public class AirQuest1 extends SideQuests 
{
    //Contructor
    public AirQuest1()
    {
        super();
    }

    /*******************
    execute(MainCharacter character)
    @param          character
    @return         void
    @description    This method runs the side quest program for AirQuest1
    *******************/

    @Override
    public void execute(MainCharacter character)
    {
        if (!this.isComplete()) //Checks if the side quest has been completed already
        {

            //Variable Decleration and Initialization
            int answer = 112; //Answer to the riddle
            int input; //Users guess
            int chances = 2; //Chances the user has to guess correctly


            //Initial output
            Utilities.slowPrint("Deep within the mystical air world, you encounter an ethereal air spirit, its form shimmering like a gentle breeze."+
            "\"Traveler,\" it whispers,\n\"answer my riddle in two guesses to proceed.\"It presents the riddle: \"Dancing among clouds, a dozen fowl fly high in the sky, add a centuries leap, and you shall find the the prize.\"", 20);


            //Processing
            do
            {
                input = Utilities.inputInt("What number am I? ", -10000, 100000); //Assure input

                //Check if the user has guess correctly
                if (answer != input && chances == 2) //First Guess
                {
                    Utilities.slowPrint("As you ponder the next step, a sudden gust of wind catches you off guard,"+ 
                    "stealing your balance momentarily.\nYou have 1 chance remaining.", 10);
                    chances--;

                }else if (answer != input && chances == 1) //Second guess
                {
                    Utilities.slowPrint("You lose your footing and stumble, taking 1 point of damage. The spirit then exits your domain", 10);
                    chances--;

                    //Remove Character HP
                    character.setHP(character.getHP() - 1);

                }
            } while (answer != input && chances != 0); //Force user to try again if they guess incorrectly


            if (chances > 0){ //Ensure the user gets their reward if they guess correctly

                Utilities.slowPrint("The spirit's eyes sparkle. \"Correct! You have claimed the prize of 5 coins.\"\nWith a graceful swirl, the spirit vanishes. Encouraged, you continue, eager to uncover the world's secrets.", 10);

                //Gives the user currency once they guess correctly.
                character.setCurrency(character.getCurrency() + 5);

                //Update game progress
                character.updateProgress(0, 0);
            }
            

        }else //Else in case the side quest has been completed
        {
            Utilities.slowPrint("This Side Quest has been completed", 10);
        }

    } //End of Method

} //End of class
