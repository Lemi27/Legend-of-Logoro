/********************************************************
@author(s)          Shreekavin Umasankar
@date               19-April-2024
@teacher            Andrew Carreiro
@file               LandQuest2.java
@description        Second side quest in the land world.
********************************************************/

package worlds.sideQuests;

public class LandQuest2 extends SideQuests {

       //Initial output
    System.out.println("In a land where valleys whispered tales and forests guarded ancient secrets, you stood before the Earth Sentinel—a massive being of roots and boulders."+
    "\"Traveler,\" it rumbled, its voice resonating like shifting tectonic plates, \"to traverse this sacred maze, unravel my riddle's cryptic haze.\""+
    "It presented its puzzling challenge: \"Amidst the soil, beneath the sky's crown, subtract a quake's rumble, what's left to be found?\"");
   
   input = Utilities.inputInt("How many glowworms remain to light the cave?", -10000000000, 100000000);

   //Processing
  do
  {
      input = uI.nextInt();

      if (answer != input)
      {
          System.out.println("\"Sorry, that's not correct,\" the Guardian's voice roared. You face the consequences by taking 1 damage. \"Try again.\"");
          uI.nextLine();

          //ADD DAMAGE REMOVAL

      }
  } while (answer != input); //Force user to try again if they guess incorrectly


System.out.println ("The Earth Guardian's stony visage cracked into a smile. \"Correct,\" it boomed approvingly. \"You may continue your journey.\""+
"With a gentle tremor, the guardian stepped aside and went deep into the mystical land. Inspired, you moved forward, eager to uncover the world's secrets.");


//ADD COIN INCREMENTER


    
}
