/********************************************************
@author(s)          Shreekavin Umasankar
@date               19-April-2024
@teacher            Andrew Carreiro
@file               FireQuest2.java
@description        Second side quest in the fire world.
********************************************************/

package src.Worlds.SideQuests;

import java.util.Scanner;

public class FireQuest2 extends SideQuests {

        //Variable Decleration and Initialization
        Scanner uI = new Scanner(System.in);
        int answer = 90; //Answer to the riddle
        int input; //Users guess
   
        //Initial output
        System.out.println("In a land where flames painted the skies and lava rivers flowed, you found yourself facing the Ember Sage—a majestic figure crafted from dancing flames and glowing embers."+
        "\"Traveler of the fiery expanse,\" it intoned, its voice echoing like crackling logs, \"to journey through this scalding realm, unravel my riddle's burning test.\""+
        "It posed its cryptic challenge: \"Legend has it that the igenous jewels multiply when divided equally among the brave. If there are 720 jewels and they must be divided equally among 8 warriors.\"");
       
        input = Utilities.inputInt("How many jewels will each warrior receive after the division?", -10000000000, 100000000);
    
        //Processing
        do
        {
    
            if (answer != input)
            {
                System.out.println("The Ember Sage's flames wavered, its luminosity fading momentarily. \"Incorrect,\" it intoned, its voice carrying a hint of disappointment.\""+
                "You've lost 2 HP. Refocus your thoughts, or risk being ensnared by the fiery enigma of this realm.\"");

                uI.nextLine();
    
                //ADD DAMAGE REMOVAL
    
            }
        } while (answer != input); //Force user to try again if they guess incorrectly
    
    
        System.out.println ("The Ember Sage's flames brightened, casting a warm glow. \"Correct,\" it affirmed. \"Forge ahead through the blazing challenges that await.\""+
        "With a sweeping gesture, the sage cleared a path through the flames, revealing a way deeper into the scorching world. Inspired by your success, you moved forward, ready to face the burning secrets ahead.");
    
        //ADD COIN INCREMENTER
    
 
    
}
