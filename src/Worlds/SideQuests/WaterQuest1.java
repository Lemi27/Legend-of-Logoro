/********************************************************
@author(s)          Shreekavin Umasankar
@date               19-April-2024
@teacher            Andrew Carreiro
@file               WaterQuest1.java
@description        First side quest in the water world.
********************************************************/

package src.Worlds.SideQuests;

import java.util.Scanner;

public class WaterQuest1 extends SideQuests {

    //Variable Decleration and Initialization
    Scanner uI = new Scanner(System.in);
    int answer = 50; //Answer to the riddle
    int input; //Users guess

    //Initial output
    System.out.println("Submerged in a world where oceans whispered secrets and waves painted tales, you encountered the Water Oracle—a luminescent figure formed of cascading waterfalls and shimmering pools."+
    "\"Seeker of the depths,\" it murmured, its voice a gentle cascade, \"to navigate these aqueous realms, solve my riddle and prove your aquatic prowess.\""+
    "It posed its cryptic challenge: \"Within the tides of ten and the waves of five, multiply the current's flow.\"");
    
    input = Utilities.inputInt("What truth shall arise?", -10000000000, 100000000);
 
    //Processing
    do
    {
 
        if (answer != input)
        {
           System.out.println("The Water Oracle's luminous form dimmed slightly. \"Incorrect,\" it intoned softly. \"Try again, or remain adrift in this realm's mysteries.\"You loose 1 health in the process");
           uI.nextLine();
 
           //ADD DAMAGE REMOVAL
 
        }
    } while (answer != input); //Force user to try again if they guess incorrectly
 
 
    System.out.println ("The Water Oracle's luminous form brightened, casting a radiant glow. \"Correct,\" it echoed melodiously. \"Continue your journey through the watery depths.\""+
    "With a graceful swirl, the oracle parted the waters, revealing a path deeper into the mystical aquatic world. Emboldened, you venture forth, eager to unravel the secrets that the water realm held beneath its surface.");
    
 
    //ADD COIN INCREMENTER
 
 
}
