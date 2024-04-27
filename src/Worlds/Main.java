package src.Worlds;
/********************************************************
@author(s)          Fawaaz Kamali Siddiqui, Shreekavin Umasankar,
                    Lemi Miyu, Matthew Kostuch, Steven Wang, 
                    Muhammad Nomaan, Sinan Shana
@date               *insert here
@teacher            Andrew Carreiro
@file               Main.java
@description        *insert class description here
********************************************************/
import java.util.Scanner;

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
                    mainCharacter.world1(mainCharacter);
                    break;
                case 2:
                    mainCharacter.world2(mainCharacter);
                    break;
                case 3:
                    mainCharacter.world3(mainCharacter);
                    break;
                case 4:
                    mainCharacter.world4(mainCharacter);
                    break;
                case 5:
                    mainCharacter.world5(mainCharacter);
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
        else // if user has lost the game
        {
            // output something
        }

        scanner.close();

    } // end of main()

}