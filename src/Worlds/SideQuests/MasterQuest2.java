/********************************************************
@author(s)          Shreekavin Umasankar
@date               19-April-2024
@teacher            Andrew Carreiro
@file               MasterQuest2.java
@description        Second side quest in the master world.
********************************************************/

package worlds.sidequests;

import worlds.MainCharacter;
import worlds.functionalities.Utilities;

public class MasterQuest2 extends SideQuests {

    //Constructor
    public MasterQuest2()
    {
        super();
    }

    /*******************
    execute(MainCharacter character)
    @param          character
    @return         void
    @description    This method runs the side quests for MasterQuest2
    *******************/
    @Override
    public void execute(MainCharacter character)
    {
        if (!character.getProgress()[4][1]) //Checks if the side quest has been completed already
        {
            //Variable Decleration and Initialization
            int answer = 85; //Answer to the riddle
            int input; //Users guess
            int chances = 2; //Chances the user has to guess correctly


            //Initial output
            System.out.println("========================================================");
            Utilities.slowPrint("In a realm where elements converged and ancient energies pulsed, you stood before the Elemental Master—a formidable entity woven from earth, air, fire, and water.\n"+
            "\"Seeker of the elemental balance,\" the Master intoned, its voice harmonizing with the world's energies, \"to continue on your path to Logoro of this realm,\nunravel my riddle's intricate weave.\""+
            "It presented its cryptic challenge: (20+10)x2-(30÷3)+(40-5).\n", 20);


            //Processing
            do
            {
                input = Utilities.inputInt("What cosmic truth shall you uncover? "); //Assure input
                System.out.println("========================================================");

                //Check for correct answer
                if (answer != input && chances == 2)
                {
                    Utilities.slowPrint("The Elemental Master's aura flickered, its energies dimming briefly. \"Incorrect, try once more.\"\n", 10);
                    chances--;

                }else if (answer != input && chances == 2)
                {
                    Utilities.slowPrint("Its voice carried a subtle disappointment. \"You've lost 2 HP. Refine your understanding, or be lost amidst the complexities of the elemental enigma.\"\n", 10);
                    chances--;

                    //Remove Character HP
                    character.setHP(character.getHP() - 1);

                }
            } while (answer != input && chances != 0); //Force user to try again if they guess incorrectly


            //Give the user their reward if they guess rightly
            if (chances > 0)
            {
                Utilities.slowPrint("The Elemental Master's aura shimmered brightly, reflecting all the elements. \"Correct,\" it echoed, its voice a harmonious blend. \"Forge ahead on your quest to understand the universe's balance. Take these 28 coins aswell.\"\n"+
                "With a graceful gesture, the Master opened a portal of swirling energies, revealing a path deeper into the elemental world. Empowered by your success, you ventured forth, eager to explore the interconnected mysteries that awaited you.\n", 10);
                
                //Gives the user currency once they guess correctly.
                character.setCurrency(character.getCurrency() + 28);

                //Update game progress
                character.updateProgress(4, 1);
            }
            
        }else //Else in case the side quest has been completed
        {
            System.out.println("========================================================"); 
            Utilities.slowPrint("This Side Quest has been completed\n", 10);
        }
        
    } //End of Method

}//End of Class
