/********************************************************
@author(s)          Shreekavin Umasankar
@date               30-April-2024
@teacher            Andrew Carreiro
@file               MasterQuest1.java
@description        First side quest in the master world.
********************************************************/

package worlds.SideQuests;

import worlds.MainCharacter;
import worlds.functionalities.Utilities;

public class MasterQuest1 extends SideQuests {

    //Constructor
    public MasterQuest1()
    {
        super();
    }
     
    /*******************
    execute(MainCharacter character)
    @param          character
    @return         void
    @description    This method runs the side quests for MasterQuest1
    *******************/
    @Override
    public void execute(MainCharacter character)
    {
        if (!character.getProgress()[4][0]) //Checks if the side quest has been completed already
        {
            //Variable Decleration and Initialization
            int answer = 70; //Answer to the riddle
            int input; //Users guess
            int chances = 2; //Chances the user has to guess correctly


            //Initial output
            System.out.println("========================================================");
            Utilities.slowPrint("In the realm of the Master Elementals, where magic intertwines with the very fabric of reality, you find yourself standing before the Gatekeeper of Equations.\n"+ 
            "This ancient being, a fusion of fire, water, earth, and air, guards the path to untold knowledge.\"You seek passage?\" The Gatekeeper's voice booms like thunder, each syllable vibrating with elemental power.\n"+
            "Before you lies a shimmering portal, its arcane symbols pulsing with energy. To unlock its secrets, you must solve the riddle posed by the Gatekeeper.\n"+
            "\"In this realm, magic and logic dance in harmony. Answer me this, mortal:((60x2)÷4)+40\"\n", 20);


            //Processing
            do
            {
                input = Utilities.inputInt(" What is the result of the equation? "); //Assure input
                System.out.println("========================================================");

                //Check if the users guess is correct
                if (answer != input && chances == 2)
                {
                    Utilities.slowPrint("\"Ah, incorrect, try once more\" the spirit intones, its voice tinged with regret.\n", 10);
                    chances--;

                }else if (answer != input && chances == 1)
                {
                    Utilities.slowPrint("\"You feel a sharp sting as if a gust of icy wind has grazed your skin. Your vision blurs momentarily, and you sense a loss of vitality. You've lost 1 HP from the elemental backlash of your incorrect answer.\"\n", 10);
                    chances--;

                    //Remove Character HP
                    character.setHP(character.getHP() - 1);

                }
            } while (answer != input && chances != 0); //Force user to try again if they guess incorrectly


            //Gives the user their coins if they guess correctly
            if (chances > 0)
            {
                Utilities.slowPrint("A moment of silence stretches out, the air thick with anticipation. Then, the gatekeepers spirit's form shimmers and fades, replaced by a radiant glow that envelops the Gate of Elements indicating you have guessed correctly.\nWith a melodic hum, a pile of 22 coins appears in front of you, and you continue to passage into the heart of the master world ready to face anything that comes in your way.\n", 10);
                
                //Gives the user currency once they guess correctly.
                character.setCurrency(character.getCurrency() + 22);

                //Update game progress
                character.updateProgress(4, 0);
            }
            
        }else //Else in case the side quest has been completed
        {
            Utilities.slowPrint("This Side Quest has been completed\n", 10);
        }
        
    } //End of Method
        
}//End of class
