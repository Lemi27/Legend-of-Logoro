/********************************************************
@author(s)          Shreekavin Umasankar
@date               19-April-2024
@teacher            Andrew Carreiro
@file               FireQuest2.java
@description        Second side quest in the fire world.
********************************************************/

package src.Worlds.SideQuests;

import src.Worlds.MainCharacter;
import src.Worlds.Functionalities.Utilities;

public class FireQuest2 extends SideQuests {

    public FireQuest2()
    {
        super();
    }

    public void execute(MainCharacter character)
    {
        if (!this.isComplete())
        {
            //Variable Decleration and Initialization
            int answer = 90; //Answer to the riddle
            int input; //Users guess
            
            //Initial output
            Utilities.slowPrint("In a land where flames painted the skies and lava rivers flowed, you found yourself facing the Ember Sage—a majestic figure crafted from dancing flames and glowing embers."+
            "\"Traveler of the fiery expanse,\" it intoned, its voice echoing like crackling logs, \"to journey through this scalding realm, unravel my riddle's burning test.\""+
            "It posed its cryptic challenge: \"Legend has it that the igenous jewels multiply when divided equally among the brave. If there are 720 jewels and they must be divided equally among 8 warriors.\"", 20);
            
            //Processing
            do
            {
                input = utilities.inputInt("What number am I?", -10000, 100000);

                if (answer != input)
                {
                    Utilities.slowPrint("The Ember Sage's flames wavered, its luminosity fading momentarily. \"Incorrect,\" it intoned, its voice carrying a hint of disappointment.\""+
                    "You've lost 2 HP. Refocus your thoughts, or risk being ensnared by the fiery enigma of this realm.\"", 10);
                    scanner.nextLine();
    
                    //ADD DAMAGE REMOVAL
                }

            } while (answer != input); //Force user to try again if they guess incorrectly
    
    
            Utilities.slowPrint("The Ember Sage's flames brightened, casting a warm glow. \"Correct,\" it affirmed. \"Forge ahead through the blazing challenges that await.\""+
            "With a sweeping gesture, the sage cleared a path through the flames, revealing a way deeper into the scorching world. Inspired by your success, you moved forward, ready to face the burning secrets ahead.", 10);
    
            //ADD COIN INCREMENTER
                
        }   else //Else in case the side quest has been completed
        {
            Utilities.slowPrint("This Side Quest has been completed", 10);
        }
    
        } //End of Method
        
}
