/********************************************************
@author(s)          Shreekavin Umasankar
@date               19-April-2024
@teacher            Andrew Carreiro
@file               LandQuest2.java
@description        Second side quest in the land world.
********************************************************/

package src.Worlds.SideQuests;

import java.util.Scanner;

public class LandQuest2 extends SideQuests {

    //Variable Decleration and Initialization
    Scanner uI = new Scanner(System.in);
    int answer = 7; //Answer to the riddle
    int input; //Users guess

    //Initial output
    System.out.println("In a land where valleys whispered tales and forests guarded ancient secrets, you stood before the Earth Sentinel—a massive being of roots and boulders."+
    "\"Traveler,\" it rumbled, its voice resonating like shifting tectonic plates, \"to traverse this sacred maze, unravel my riddle's cryptic haze.\""+
    "It presented its puzzling challenge: \"FINISH THIS Amidst the soil, beneath the sky's crown, subtract a quake's rumble, what's left to be found?\"");
   
   input = Utilities.inputInt("How many glowworms remain to light the cave?", -10000000000, 100000000);

   //Processing
  do
  {
      input = uI.nextInt();

      if (answer != input)
      {
          System.out.println("The Earth Sentinel's stone features remained stern. \"Incorrect,\" it intoned gravely. \"Try again, and face the consequences by taking 1 damage.\"");
          uI.nextLine();

          //ADD DAMAGE REMOVAL

      }
  } while (answer != input); //Force user to try again if they guess incorrectly


System.out.println ("The Earth Sentinel's stone features softened. \"Correct,\" it intoned with approval. \"Proceed on your path.\""+
"With a gentle shift, the sentinel opened a hidden passage, guiding you deeper into the labyrinthine world. Filled with determination, you ventured forth, ready to explore the mysteries that lay ahead.");


//ADD COIN INCREMENTER


    
}
