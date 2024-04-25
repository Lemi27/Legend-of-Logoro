/********************************************************
@author(s)          Shreekavin Umasankar
@date               19-April-2024
@teacher            Andrew Carreiro
@file               FireQuest1.java
@description        First side quest in the fire world.
********************************************************/

package src.Worlds.SideQuests;

import java.util.Scanner;

public class FireQuest1 extends SideQuests {

    //Variable Decleration and Initialization
    Scanner uI = new Scanner(System.in);
    int answer = 36; //Answer to the riddle
    int input; //Users guess

    //Initial output
    System.out.println("In a realm ablaze with fiery hues and molten landscapes, you found yourself standing before the Fire Seer—a formidable entity forged from flickering flames and glowing embers."+
    "\"Adventurer of the scorching expanse,\" it intoned, its voice crackling like a roaring fire, \"to pass through this infernal domain, decipher my riddle's burning refrain.\""+
    "It posed its cryptic challenge: \"I am a number. If you divide me by 4, I become 9.\"");
    
    input = Utilities.inputInt("What number am I?", -10000000000, 100000000);
 
    //Processing
    do
    {
        input = uI.nextInt();
 
        if (answer != input)
        {
           System.out.println("The Fire Seer's flames dimmed slightly, its gaze cooling with a hint of concern. \"Incorrect,\" it intoned, its voice tinged with smoky disappointment. \"You've lost 1 HP. Rekindle your thoughts, or be consumed by the fiery conundrum of this realm.\"");
           uI.nextLine();
 
           //ADD DAMAGE REMOVAL
 
        }
    } while (answer != input); //Force user to try again if they guess incorrectly
 
 
    System.out.println ("The Fire Seer's flames flickered brighter, casting a radiant glow. \"Correct,\" it rumbled approvingly. \"Forge ahead through the fiery trials that await.\""+
    "With a sweeping gesture, the seer parted the flames, revealing a pathway deeper into the scorching world. Ignited by triumph, you pressed on, ready to confront the blazing mysteries that lay ahead.");
 
    //ADD COIN INCREMENTER
 
 

}
