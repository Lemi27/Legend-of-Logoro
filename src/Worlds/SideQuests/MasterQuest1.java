/********************************************************
@author(s)          Shreekavin Umasankar
@date               19-April-2024
@teacher            Andrew Carreiro
@file               MasterQuest1.java
@description        First side quest in the master world.
********************************************************/

package src.Worlds.SideQuests;

import src.Worlds.MainCharacter;
import src.Worlds.Functionalities.Utilities;

public class MasterQuest1 extends SideQuests {

    public MasterQuest1()
    {
        super();
    }
     
    public void execute(MainCharacter character)
    {
        if (!this.isComplete())
        {
            //Variable Decleration and Initialization
            int answer = 70; //Answer to the riddle
            int input; //Users guess

            //Initial output
            Utilities.slowPrint("In the realm of the Master Elementals, where magic intertwines with the very fabric of reality, you find yourself standing before the Gatekeeper of Equations."+ 
            "This ancient being, a fusion of fire, water, earth, and air, guards the path to untold knowledge.\"You seek passage?\" The Gatekeeper's voice booms like thunder, each syllable vibrating with elemental power."+
            "Before you lies a shimmering portal, its arcane symbols pulsing with energy. To unlock its secrets, you must solve the riddle posed by the Gatekeeper."+
            "\"In this realm, magic and logic dance in harmony. Answer me this, mortal:((60x2)÷4)+40\"", 20);

            //Processing
            do
            {
                input = utilities.inputInt(" What is the result of the equation?", -10000, 100000);

                if (answer != input)
                {
                    Utilities.slowPrint("\"Ah, incorrect,\" the spirit intones, its voice tinged with regret.You feel a sharp sting as if a gust of icy wind has grazed your skin. Your vision blurs momentarily, and you sense a loss of vitality. You've lost 1 HP from the elemental backlash of your incorrect answer.\"", 10);
                    scanner.nextLine();

                    //ADD DAMAGE REMOVAL

                }
            } while (answer != input); //Force user to try again if they guess incorrectly


            Utilities.slowPrint("A moment of silence stretches out, the air thick with anticipation. Then, the gatekeepers spirit's form shimmers and fades, replaced by a radiant glow that envelops the Gate of Elements indicating you have guessed correctly. With a melodic hum, you passage into the heart of the master world ready to face anything that comes in your way.", 10);

            //ADD COIN INCREMENTER
            
        }else //Else in case the side quest has been completed
        {
            Utilities.slowPrint("This Side Quest has been completed", 10);
        }
    } //End of Method
        


}
