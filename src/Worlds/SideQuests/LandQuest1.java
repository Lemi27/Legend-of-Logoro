/********************************************************
@author(s)          Shreekavin Umasankar
@date               19-April-2024
@teacher            Andrew Carreiro
@file               LandQuest1.java
@description        First side quest in the land world.
********************************************************/

package src.Worlds.SideQuests;

import java.util.Scanner;

public class LandQuest1 extends SideQuests {
    
   //Variable Decleration and Initialization
   Scanner uI = new Scanner(System.in);
   int answer = 7; //Answer to the riddle
   int input; //Users guess

   //Initial output
   System.out.println("In a realm where mountains touched the sky and rivers sang ancient songs, you find yourself facing the Earth Guardian—a colossal figure of stone and moss."+
    "\"Seeker,\" it intoned, its voice deep as rumbling earth, \"to pass this sacred ground, solve my riddle and prove your worth.\""+
    "It posed its cryptic challenge: \"Ten glowworms illuminate a dark cave. A hungry badger snatches three for a midnight snack.\"");
    
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
