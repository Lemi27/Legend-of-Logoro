/********************************************************
@author(s)          Shreekavin Umasankar
@date               19-April-2024
@teacher            Andrew Carreiro
@file               AirQuest1.java
@description        First side quest in the air world.
********************************************************/

package src.Worlds.SideQuests;

import java.util.Scanner;

public class AirQuest1 extends SideQuests 
{

    //Variable Decleration and Initialization
    Scanner uI = new Scanner(System.in);
    int answer = 112; //Answer to the riddle
    int input; //Users guess

    //Initial output
    System.out.println("Deep within the mystical air world, you encounter an ethereal air spirit, its form shimmering like a gentle breeze."+
    "\"Traveler,\" it whispers, \"answer my riddle to proceed.\" It presents the riddle: \"Dancing among clouds, a dozen fowl fly high in the sky, add a centuries leap, and you shall find the the prize.\"");

    input = Utilities.inputInt("What number am I?", -10000000000, 100000000);

    //Processing
    do
    {
        if (answer != input)
        {
            System.out.println("As you ponder the next step, a sudden gust of wind catches you off guard,"+ 
            "stealing your balance momentarily.\n You lose your footing and stumble, taking 1 point of damage. The spirit then prompts you to try again");
            uI.nextLine();

            //ADD DAMAGE REMOVAL

        }
    } while (answer != input); //Force user to try again if they guess incorrectly


System.out.println ("The spirit's eyes sparkle. \"Correct! You have claimed the prize.\"With a graceful swirl, the spirit vanishes. Encouraged, you continue, eager to uncover the world's secrets. ");

//ADD COIN INCREMENTER


} //End of menthod
