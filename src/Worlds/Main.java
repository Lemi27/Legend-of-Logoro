/********************************************************
@author(s)          Fawaaz Kamali Siddiqui, Shreekavin Umasankar,
                    Lemi Miyu, Matthew Kostuch, Steven Wang, 
                    Muhammad Nomaan, Sinan Shana
@date               *insert here
@teacher            Andrew Carreiro
@file               Main.java
@description        *insert class description here
********************************************************/

package worlds;

import java.util.Scanner;

import worlds.functionalities.Utilities;

public class Main
{

    // public variables
    public static MainCharacter mainCharacter;

    /*******************
    main(String[] args)
    @param          String[]
    @return         void
    @description    Main method of the entire program, where all 
                    classes are combined.
    *******************/
    public static void main(String[] args)
    {
        // variable declaration and instantiation section
        Scanner scanner = new Scanner(System.in);
        int progress = 1;
        int livesRemaining;

        // input section for user name
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        // MainCharacter instantiation
        mainCharacter = new MainCharacter(firstName, lastName);
        livesRemaining = mainCharacter.getLivesRemaining();

        // keep user in loop
        while (progress < 6 && livesRemaining > 0)
        {
            switch(progress)
            {
                case 1:
                    mainCharacter.world(mainCharacter, progress);
                    break;
                case 2:
                    mainCharacter.world(mainCharacter, progress);
                    break;
                case 3:
                    mainCharacter.setMaxHP(24);
                    mainCharacter.world(mainCharacter, progress);
                    break;
                case 4:
                    mainCharacter.world(mainCharacter, progress);
                    break;
                case 5:
                    mainCharacter.setMaxHP(26);
                    mainCharacter.world(mainCharacter, progress);
                    break;
                default:
            }

            progress = mainCharacter.getCurrentWorld();
            livesRemaining = mainCharacter.getLivesRemaining();
        }

        // if user has won the game
        if (mainCharacter.getProgress()[4][2])
        {
            // storyline after game is won
        }
        else // if user has lost the game, or quit
        {
            // output something
            Utilities.slowPrint("Braver men than you have tried and failed. Till next time.", 50);
        }

    } // end of main()

}