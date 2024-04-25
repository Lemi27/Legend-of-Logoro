/********************************************************
@author(s)          Shreekavin Umasankar
@date               19-April-2024
@teacher            Andrew Carreiro
@file               AirQuest2.java
@description        Second side quest in the air world.
********************************************************/

package src.Worlds.SideQuests;

<<<<<<< HEAD
import java.util.Scanner;
=======
>>>>>>> main

public class AirQuest2 extends SideQuests {

    //Variable Decleration and Initialization
    Scanner uI = new Scanner(System.in);
    int answer = 12; //Answer to the riddle
    int input; //Users guess

    //Initial output
    System.out.println("In the heart of a fog-shrouded forest, you feel a chill unlike any other. From the mist emerged an air monster, its form swirling with dark clouds and lightning."+
    "\"Human,\" it rumbled, its voice echoing like thunder, \"to pass, unravel this cipher.\"It posed its cryptic riddle: \"I am an even number. If you add half of me to a third of me, you get 10.\"");

    input = Utilities.inputInt("What number shall prevail?", -10000000000, 100000000);

    //Processing
    do
    {
        if (answer != input)
        {
            System.out.println("\"Sorry, that's not correct,\" the monster's voice boomed, disappointment evident. You face the consequences of losing 2 HP. \"Try again if you wish.\"");
            uI.nextLine();

            //ADD DAMAGE REMOVAL

        }
    } while (answer != input); //Force user to try again if they guess incorrectly


System.out.println ("The air monster's stormy eyes narrowed, then softened. \"Correct,\" it grumbled approvingly. \"You may proceed.\""+
"With a thunderous clap, the monster dissipated into the mist, unveiling the hidden prize. Emboldened, you ventured forth.");


//ADD COIN INCREMENTER

  
    
}
