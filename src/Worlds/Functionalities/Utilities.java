/* /********************************************************
@author(s)          Steven Wang
@date               April 23, 2024
@teacher            Andrew Carreiro
@file               Functions.java
@description        Functionalities for the program including restricting input
                    and controlling output.
********************************************************/ 
package worlds.functionalities;

import java.util.Scanner;
public class Utilities
{

    private static Scanner uI = new Scanner(System.in);
    
    /*******************
    inputInt(String prompt, int min, int max)
    @param          prompt
    @param          min
    @param          max
    @return         int
    @description    Continously loop until user inputs a value that is lower then max and higher then min
    *******************/
  public static int inputInt(String prompt, int min, int max) {
    Scanner uI = new Scanner(System.in);
    int input;

    System.out.print(prompt);
    do {

      // If the user does not input an int then you loop until they input an integer.
      while (!uI.hasNextInt()) {
        System.out.println("Please enter a valid integer. ");
        System.out.print(prompt);
        uI.nextLine();
      }
      input = uI.nextInt();

      // Check if the input value is higher then max or lower than min. If so, loop
      // until input is lower then max and higher then min
      if (input < min || input > max) {
        System.out.println("Please enter a valid integer");
        System.out.print(prompt);
        uI.nextLine();
      }

    } while (input < min || input > max); // Continously loop until user inputs a value that is lower then min and
    
    return input;
  } // end of inputInt() method

  /*******************
    inputInt(String prompt)
    @param          prompt
    @return         int
    @description    Continously loop until user inputs a valid integer
    *******************/

  public static int inputInt(String prompt) //Input Int without a range
  {
    Scanner uI = new Scanner(System.in);
    int input;

    System.out.print(prompt);

    // If the user does not input an int then you loop until they input an integer.
    while (!uI.hasNextInt()) 
    {
      System.out.println("Please enter a valid integer. ");
      System.out.print(prompt);
      uI.nextLine();
    }

    input = uI.nextInt();
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
    public static String inputString(String prompt, String[] acceptedAnswers) {

        String answer;
        boolean isValidInput;
        do 
        {
            System.out.print(prompt);
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
  
      /*******************
   slowPrint(int currentHp, int maxHp)
    @param          text
    @param          interval
    @return        void
    @description   Print out text with a delay while printing.
    *******************/
  public static void slowPrint(String text, long interval) {
      // Loop through each character in the text
      for (int i = 0; i < text.length(); i++) {
          // Print the current character
          System.out.print(text.charAt(i));
          try {
              // Pause for the specified delay
              Thread.sleep(interval);
          } catch (InterruptedException e) {
              // If interrupted while sleeping, print the stack trace
              e.printStackTrace();
          }
      }
  } //end of slowPrint() method


   /*******************
   freeze(int maxHp)
    @param          interval
    @return        void
    @description   Momentary freeze program for a certain interval
  ********************/
  public static void freeze(long interval)
  {
    try 
    {
      Thread.sleep(interval);
    }
    catch (InterruptedException e)
    {
      e.printStackTrace();
    }
  }

      /*******************
  visualHealthBar(String prompt, String[] acceptedAnswers)
    @param          currentHealth
    @param          maxHealth
    @return         void
    @description   Print out a visual representation of the main character's health
    *******************/
    public static void visualHealthBar(int currentHealth, int maxHealth) {

      System.out.print("Health: ");

      for (int i = 0; i < maxHealth; i++) {
          if (i < currentHealth) {
              System.out.print("#"); // Print filled portion of the health bar
          } else {
              System.out.print("-"); // Print empty portion of the health bar
          }
      }
      System.out.println(); // newline


  } // end of printHealthBar method

}//End of class




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


