/*
Title: Week 4 Project work
Author: Christopher Windrow
Description:
    This is week 4 Project to convert a user input to a harmonic sum with iteration or recursion
    This program also calculates the Lucas Number of the user input
 */
import java.util.Scanner;

public class week4Assignment {

    //Method for Harmonic sum using a While loop
    private static double harmonicI(int n){
        double harmonicSum = 0.0;
        for(; n > 0; n--){
            harmonicSum += 1.0/n;
        }
        return harmonicSum;
    }

    //Method for harmonic sum using recursion
    private static double harmonicR(int n){
        if(n == 1){
            return 1.0;
        }
        return 1.0/ n + harmonicR(n-1);

    }

    //Method to get Lucas Number given input
    private static double lucasR(int n) {

        if (n == 0) return 2;
        if(n == 1) return 1;
        return lucasR(n - 1) + lucasR(n - 2);
    }

    //Main method
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        boolean decision = true;

        while (decision) {
            //Variables
            int choice;
            int userInput;
            double iterativeNum;
            double recursiveNum;
            double lucasNum;

            // String choices for user before switch statement
            String choice1 = "Enter 1 to get a Harmonic sum iteratively for your number: ";
            String choice2 = "Enter 2 to get a Harmonic sum recursively for your number: ";
            String choice3 = "Enter 3 to get a sum using Lucas Numbers for your number: ";
            String quit = "Would you like to enter another number or quit? (y/n): ";

            System.out.println(choice1 + "\n" + choice2 + "\n" + choice3);
            choice = scn.nextInt();
            scn.nextLine();

            //Switch statement
            switch (choice) {
                case 1:
                    System.out.println("Enter an integer to calculate the harmonic sum iteratively: ");
                    userInput = scn.nextInt();
                    iterativeNum = harmonicI(userInput);
                    System.out.println("The harmonic number using iteration is: " + iterativeNum);
                    break;
                case 2:
                    System.out.println("Enter an integer to calculate the harmonic sum recursively: ");
                    userInput = scn.nextInt();
                    recursiveNum = harmonicR(userInput);
                    System.out.println("The harmonic number using recursion is: " + recursiveNum);
                    break;
                case 3:
                    System.out.println("Enter an integer to calculate the Lucas numbers sum: ");
                    userInput = scn.nextInt();
                    lucasNum = lucasR(userInput);
                    System.out.println("The Lucas number is: " + lucasNum);
                    break;
                default:
                    System.out.println("Invalid input. Please enter a number 1-3.");
            }

            scn.nextLine();

            //Ask user if they want to continue or quit after processing the choice
            System.out.println(quit);
            String userDecision = scn.nextLine();
            if (userDecision.equalsIgnoreCase("n")) {
                decision = false;
            }
        }

        System.out.println("Program will not exit.");
    }
}
