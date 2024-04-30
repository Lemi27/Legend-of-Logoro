/********************************************************
@author(s)          Shreekavin Umasankar
@date               30-April-2024
@teacher            Andrew Carreiro
@file               LandQuest2.java
@description        Second side quest in the land world.
********************************************************/

package worlds.sidequests;

import worlds.MainCharacter;
import worlds.functionalities.Utilities;

public class LandQuest2 extends SideQuests {

    //Constructor
    public LandQuest2()
    {
        super();
    }

    /*******************
    execute(MainCharacter character)
    @param          character
    @return         void
    @description    This method runs the side quest program for LandQuest2
    *******************/
    @Override
    public void execute(MainCharacter character)
    {
        if (!character.getProgress()[1][1]) //Checks if the side quest has been completed already
        {
            //Variable Decleration and Initialization
            int answer = 7; //Answer to the riddle
            int input; //Users guess
            int chances = 2; //Chances the user has to guess correctly


            //Initial output
            System.out.println("========================================================");
            Utilities.slowPrint("In a land where valleys whispered tales and forests guarded ancient secrets, you stood before the Earth Sentinel, a massive being of roots and boulders.\n"+
            "\"Traveler,\" it rumbled, its voice resonating like shifting tectonic plates, \"to traverse this sacred maze, unravel my riddle's cryptic haze.\"\n"+
            "It presented its puzzling challenge: \"I am an odd number. If you take away one of the letters from my name, I become even.\" ", 20);

            
            //Processing
            do
            {
                input = Utilities.inputInt("What number shall I be? ");
                System.out.println("========================================================");

                //Check if answer is correct
                if (answer != input && chances == 2)
                {
                    Utilities.slowPrint("The Earth Sentinel's stone features remained stern. \"Incorrect, you have 1 more chance,\" it intoned gravely. ", 10);
                    chances--;

                }else if (answer != input && chances == 1)
                {
                    Utilities.slowPrint("You fall again and now must face the consequences by taking 2 damage.", 10);
                    chances--;

                    //Remove Character HP
                    character.setHP(character.getHP() - 2);
                    
                }
            } while (answer != input); //Force user to try again if they guess incorrectly


            //Give the user their reward
            if (chances > 0)
            {
                Utilities.slowPrint("The Earth Sentinel's stone features softened. \"Correct,\" it intoned with approval. \"Proceed on your path, and take these 10 coins.\"\n"+
                "With a gentle shift, the sentinel opened a hidden passage, guiding you deeper into the labyrinthine world. Filled with determination, you ventured forth, ready to explore the mysteries that lay ahead.", 10);

                //Gives the user currency once they guess correctly.
                character.setCurrency(character.getCurrency() + 10);
                
                //Update game progress
                character.updateProgress(1, 1);
            }

            Utilities.freeze(2000);
            

        }else //Else in case the side quest has been completed
        {
            System.out.println("========================================================"); 
            Utilities.slowPrint("This Side Quest has been completed\n", 10);
        }

    } //End of Method
        
}//End of class
