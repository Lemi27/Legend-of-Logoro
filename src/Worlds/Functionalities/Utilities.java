/* /********************************************************
@author(s)          Steven Wang
@date               April 23, 2024
@teacher            Andrew Carreiro
@file               Functions.java
@description        Functionalities for the program including restricting input
                    and controlling output.
********************************************************/ 
package src.Worlds.Functionalities;

import java.util.Scanner;
public class Utilities
{

    private Scanner uI;

    // constructor method
    public Utilities() 
    {
        this.uI = new Scanner(System.in);
    
    }
    
    /*******************
    inputInt(String prompt, int min, int max)
    @param          min
    @param          max
    @param          prompt
    @return         int
    @description    Continously loop until user inputs a value that is lower then max and higher then min
    *******************/
    public int inputInt(String prompt, int min, int max) {

        int input;
        do
        {
            System.out.println(prompt);

            // If the user does not input an int then you loop until they input an integer. 
            while (!uI.hasNextInt()) 
            { 
                System.out.println("Please enter a valid integer. ");
                uI.next();
            }
            input =uI.nextInt();

            //Check if the input value is higher then max or lower than min. If so, loop until input is lower then max and higher then min
            while (input< min || input > max) 
            {
                System.out.println("Please enter a valid integer");
                System.out.print(prompt);
            }
        } while (input > min || input < max); // Continously loop until user inputs a value that is lower then max and higher then min
        return input;
    } // end of inputInt() method
    
    /*******************
    inputString(String prompt, String[] acceptedAnswers)
    @param          acceotedAnswers
    @param          prompt
    @return         String
    @description   Continously loop until user inputs an answer that is an acceptable
                    answer that comes from a list if possible accepted answers.
    *******************/
    public String inputString(String prompt, String[] acceptedAnswers) {

        String answer;
        boolean isValidInput;
        do 
        {
            System.out.println(prompt);
            answer = uI.next();
            isValidInput = false;

            // loop through each item of acceptedAnswers array checking the item at each index one at a time
            for (String acceptedAnswer : acceptedAnswers) 
            {
                if (answer.equals(acceptedAnswer))
                {
                    isValidInput = true;
                    break;
                }
            }
            //If isValidInput is false, then make user input again
            if (!isValidInput) 
            {
                System.out.println("Invalid input. Please try again. ");

            }
        } while (!isValidInput); // Continously loop until user inputs an answer that is acceptable.
        return answer;
    } //end of inputString() method
    public void slowPrint(double interval){
        
    }
}

    /*****
     * TODO:
     *      + inputInt(minRange, maxRange)
     *      + inputString(String[] acceptedAnswers) with restrictions and loops if conditions aren't met 
     *      + slowPrint(interval)
     *      + visualHealthBar(currentHP, maxHP)
     *      + 2D array methods
     *      + Dynamic array methods
     *   
    *****/


