/********************************************************
@author(s)          *insert here
@date               *insert here
@teacher            Andrew Carreiro
@file               Utilities.java
@description        Class with methods to manipulate arrays, 
                    slow print, display inventories, etc.
********************************************************/
package Functionalities;

import java.util.Scanner;
public class Utilities
{

    private Scanner uI;

    public Utilities() {
        this.uI = new Scanner(System.in);
        }
    
        public int inputInt(String prompt, int min, int max) {

            int input;
            do{
                System.out.println(prompt);
                while (!uI.hasNextInt()) {
                    System.out.println("Please enter a valid integer. ");
                    System.out.print(prompt);
                    uI.next();
                }
                input =uI.nextInt();
                while (input< min || input > max) {
                    System.out.println("Please enter a valid integer");
                    System.out.print(prompt);
                }
            } while (input > min || input < max);
            return input;
        }
    
        public String inputString(String prompt, String[] acceptedAnswers, String input) {
    
            String answer;
            boolean isValidInput;
            do {
                System.out.println(prompt);
                answer = uI.next();
                isValidInput = false;
                for (String acceptedAnswer : acceptedAnswers) {
                    if (answer.equals(acceptedAnswer)){
                        isValidInput = true;
                        break;
                    }
                }
                if (!isValidInput) {
                    System.out.println("Invalid input. Please try again. ");
                }
            } while (!isValidInput);
            return answer;
        }
    
        public void slowPrint(String text, double interval){
            
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

}
    class RolePlayingGame{
        public static void main(String [] args) {
    
        }
    
}
