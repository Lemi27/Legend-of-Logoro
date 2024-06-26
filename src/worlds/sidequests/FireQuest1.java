/********************************************************
@author(s)          Shreekavin Umasankar
@date               30-April-2024
@teacher            Andrew Carreiro
@file               FireQuest1.java
@description        First side quest in the fire world.
********************************************************/

package worlds.sidequests;

import worlds.MainCharacter;
import worlds.functionalities.Utilities;

public class FireQuest1 extends SideQuests {

    //Constructor
    public FireQuest1()
    {
        super();
    }

    /*******************
    execute(MainCharacter character)
    @param          character
    @return         void
    @description    This method runs the side quest program for FireQuest1
    *******************/
    @Override
    public void execute(MainCharacter character)
    {
        if (!character.getProgress()[3][0]) //Checks if the side quest has been completed already
        {
            //Variable Decleration and Initialization
            int answer = 36; //Answer to the riddle
            int input; //Users guess
            int chances = 2; //Chances the user has to guess correctly


            //Initial output
            System.out.println("========================================================");
            Utilities.slowPrint("In a realm ablaze with fiery hues and molten landscapes, you found yourself standing before the Fire Seer, a formidable entity forged from flickering flames and glowing embers.\n"+
            "\"Adventurer of the scorching expanse,\" it intoned, its voice crackling like a roaring fire, \"to pass through this infernal domain, decipher my riddle's burning refrain.\"\n"+
            "It posed its cryptic challenge: \"I am a number. If you divide me by 4, I become 9.\"\n", 20);


            //Processing
            do
            {
                input = Utilities.inputInt("What number am I? "); //Assure input
                System.out.println("========================================================");

                //Check for correct answer
                if (answer != input && chances == 2)
                {
                    Utilities.slowPrint("The Fire Seer's flames dimmed slightly, its gaze cooling with a hint of concern. \"Incorrect, try again!\"\n", 10);
                    chances--;

                }else if (answer != input && chances == 1)
                {
                    Utilities.slowPrint("Its voice tinged with smoky disappointment, hinting at an incorrect answer. \"You've lost 1 HP. Rekindle your thoughts, or be consumed by the fiery conundrum of this realm.\"\n", 10);
                    chances--;

                    //Remove Character HP
                    character.setHP(character.getHP() - 1);
                }
            } while (answer != input && chances != 0); //Force user to try again if they guess incorrectly


            //Give the user their reward
            if (chances > 0)
            {
                Utilities.slowPrint("The Fire Seer's flames flickered brighter, casting a radiant glow. \"Correct, take these 15 coins\" it rumbled approvingly. \"Forge ahead through the fiery trials that await.\"\n"+
                "With a sweeping gesture, the seer parted the flames, revealing a pathway deeper into the scorching world. Ignited by triumph, you pressed on, ready to confront the blazing mysteries that lay ahead.\n", 20);
                
                //Gives the user currency once they guess correctly.
                character.setCurrency(character.getCurrency() + 15);

                //Update game progress
                character.updateProgress(3, 0);
            }

            Utilities.freeze(2000);
            
        }else //Else in case the side quest has been completed
        {
            System.out.println("========================================================"); 
            Utilities.slowPrint("This Side Quest has been completed\n", 10);
        }
        
    } //End of Method

} //End of class
