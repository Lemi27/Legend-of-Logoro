/********************************************************
@author(s)          Shreekavin Umasankar
@date               19-April-2024
@teacher            Andrew Carreiro
@file               MasterQuest2.java
@description        Second side quest in the master world.
********************************************************/

package src.Worlds.SideQuests;

import src.Worlds.MainCharacter;
import src.Worlds.Functionalities.Utilities;

public class MasterQuest2 extends SideQuests {

    public MasterQuest2()
    {
        super();
    }

    public void execute(MainCharacter character)
    {
        if (!this.isComplete())
        {
            //Variable Decleration and Initialization
            int answer = 85; //Answer to the riddle
            int input; //Users guess

            //Initial output
            Utilities.slowPrint("In a realm where elements converged and ancient energies pulsed, you stood before the Elemental Master—a formidable entity woven from earth, air, fire, and water."+
            "\"Seeker of the elemental balance,\" the Master intoned, its voice harmonizing with the world's energies, \"to continue on your path to Logoro of this realm, unravel my riddle's intricate weave.\""+
            "It presented its cryptic challenge: (20+10)x2-(30÷3)+(40-5).", 20);

            //Processing
            do
            {
                input = utilities.inputInt("What cosmic truth shall you uncover?", -10000, 100000);

                if (answer != input)
                {
                    Utilities.slowPrint("The Elemental Master's aura flickered, its energies dimming briefly. \"Incorrect,\" it intoned, its voice carrying a subtle disappointment. \"You've lost 2 HP. Refine your understanding, or be lost amidst the complexities of the elemental enigma.\"", 10);
                    scanner.nextLine();

                    //ADD DAMAGE REMOVAL

                }
            } while (answer != input); //Force user to try again if they guess incorrectly


            Utilities.slowPrint("The Elemental Master's aura shimmered brightly, reflecting all the elements. \"Correct,\" it echoed, its voice a harmonious blend. \"Forge ahead on your quest to understand the universe's balance.\""+
            "With a graceful gesture, the Master opened a portal of swirling energies, revealing a path deeper into the elemental world. Empowered by your success, you ventured forth, eager to explore the interconnected mysteries that awaited you.", 10);

            //ADD COIN INCREMENTER
            
        }else //Else in case the side quest has been completed
        {
            Utilities.slowPrint("This Side Quest has been completed", 10);
        }
    } //End of Method
        

    
}
