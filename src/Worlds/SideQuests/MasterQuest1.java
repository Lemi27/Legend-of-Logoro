/********************************************************
@author(s)          Lemi Miyu
@date               19-April-2024
@teacher            Andrew Carreiro
@file               MasterQuest1.java
@description        First side quest in the master world.
********************************************************/

package src.Worlds.SideQuests;

import java.util.Scanner;

public class MasterQuest1 extends SideQuests {
    
    //Variable Decleration and Initialization
    Scanner uI = new Scanner(System.in);
    int answer = 90; //Answer to the riddle
    int input; //Users guess
       
    //Initial output
    System.out.println("In the realm of the Master Elementals, where magic intertwines with the very fabric of reality, you find yourself standing before the Gatekeeper of Equations."+ 
    "This ancient being, a fusion of fire, water, earth, and air, guards the path to untold knowledge.\"You seek passage?\" The Gatekeeper's voice booms like thunder, each syllable vibrating with elemental power."+
    "Before you lies a shimmering portal, its arcane symbols pulsing with energy. To unlock its secrets, you must solve the riddle posed by the Gatekeeper."+
    "\"In this realm, magic and logic dance in harmony. Answer me this, mortal: What is the result of the following equation, using the laws of BEDMAS?\"");
           
    input = Utilities.inputInt("How many jewels will each warrior receive after the division?", -10000000000, 100000000);
        
    //Processing
    do
    {

        if (answer != input)
        {

        System.out.println("The Ember Sage's flames wavered, its luminosity fading momentarily. \"Incorrect,\" it intoned, its voice carrying a hint of disappointment.\"You've lost 2 HP. Refocus your thoughts, or risk being ensnared by the fiery enigma of this realm.\"");

        uI.nextLine();
        
        //ADD DAMAGE REMOVAL
        
        }
    } while (answer != input); //Force user to try again if they guess incorrectly
        
        
            System.out.println ("The Ember Sage's flames brightened, casting a warm glow. \"Correct,\" it affirmed. \"Forge ahead through the blazing challenges that await.\""+
            "With a sweeping gesture, the sage cleared a path through the flames, revealing a way deeper into the scorching world. Inspired by your success, you moved forward, ready to face the burning secrets ahead.");
        
            //ADD COIN INCREMENTER
        
     
        
}
