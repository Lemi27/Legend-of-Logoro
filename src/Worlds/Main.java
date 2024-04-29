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

        // storyline to begin story
        Utilities.slowPrint("In the distant reaches of the universe lies a galaxy teeming with magical energy and mathematical mysteries. The inhabitants of this galaxy, known as the Mathematicians, have long safeguarded the secrets of mathematics, using its power to maintain balance and order across the cosmos.", 50);
        System.out.println(); // newline
        Utilities.slowPrint("Among these mathematicians is Logoro, a brilliant, old wizard known for his unparalleled mastery of equations. However, when an ancient artifact known as the Prism of Equations is shattered, Logoro is caught in the ensuing chaos and disappears without a trace, his whereabouts unknown.", 50);
        System.out.println(); 
        Utilities.slowPrint("Trouble brews as the shattered Prism's fragments scatter across five distant planets, unleashing chaos and threatening the very fabric of reality. As an apprentice mathematician under the guidance of Professor Puzzler, you receive a mysterious summons. It becomes clear that Logoro's disappearance is linked to the Prism's destruction, and your mission is not only to restore the Prism but also to rescue Logoro and save the galaxy from impending doom.", 50);
        System.out.println(); 
        Utilities.freeze(5000); // give user reading time

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
            Utilities.slowPrint("\n\nYou have rescued Logoro. Balance has been restored. Tyranny has been suppressed. Thank you, " + mainCharacter.getFirstName() + " " + mainCharacter.getLastName(), 150);
            System.out.println(".\n");
        }
        else // if user has lost the game, or quit
        {
            // output something
            Utilities.slowPrint("Braver men than you have tried and failed. Till next time.", 50);
        }

    } // end of main()

}