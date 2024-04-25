/********************************************************
@author(s)          Shreekavin Umasankar
@date               19-April-2024
@teacher            Andrew Carreiro
@file               WaterQuest2.java
@description        Second side quest in the water world.
********************************************************/

package src.Worlds.SideQuests;

import java.util.Scanner;

public class WaterQuest2 extends SideQuests {
    
    //Variable Decleration and Initialization
    Scanner uI = new Scanner(System.in);
    int answer = 0; //Answer to the riddle
    int input; //Users guess

    //Initial output
    System.out.println("Navigating a realm where shimmering lakes mirrored the sky and waterfalls sang ancient melodies, you found yourself standing before the Water Guardian—a majestic figure sculpted from flowing rivers and misty streams."+
    "\"Traveler of the aquatic expanse,\" it murmured, its voice a soothing ripple, \"to journey further into these aqueous lands, unravel my enigmatic riddle and reveal your insight.\""+
    "It presented its cryptic challenge: \" If you multiply the number of legs on a crab by the number of bones on a shark, you get me.\"");
    
    input = Utilities.inputInt("What number shall I be?", -10000000000, 100000000);
 
    //Processing
    do
    {
 
        if (answer != input)
        {
           System.out.println("The Water Guardian's watery gaze dimmed momentarily. \"Incorrect,\" it intoned softly. \"I shall remove some health and let you rethink the depths of the puzzle.");
           uI.nextLine();
 
           //ADD DAMAGE REMOVAL
 
        }
    } while (answer != input); //Force user to try again if they guess incorrectly
 
 
    System.out.println ("The Water Guardian's watery gaze shimmered with approval. \"Correct,\" it echoed melodically. \"Forge ahead on your aquatic quest."+
    "With a graceful gesture, the guardian parted the waters, unveiling a pathway deeper into the enchanting water world. Fueled by success, you ventured forth, eager to discover the submerged secrets awaiting you.");
 
    //ADD COIN INCREMENTER
 
 




}
