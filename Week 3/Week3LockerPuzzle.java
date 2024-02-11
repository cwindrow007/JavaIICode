/*
Title: Week 3 Locker Puzzle
Author: Christopher Windrow
Description:
    This is week 3 project locker puzzle

 */
import java.util.Scanner;

public class Week3LockerPuzzle {

    public static void main(String[] args) {

        //Variables
        int numStudents;
        int numLockers;
        int openLockers = 0;

        //Prompts to get user input for Students
        Scanner scn = new Scanner(System.in);
        System.out.println("Please input the Number of Students: ");

        //If statement to check for valid input
        if (scn.hasNextInt()) {
            numStudents = scn.nextInt();
            if (numStudents <= 0) {
                System.out.println("Input is invalid. Please enter a positive number without decimals.");
                return;
            }
        } else {
            System.out.println("Input is invalid. Please enter a positive number without decimals.");
            return;
        }

        //Prompts to get user input for Lockers
        System.out.println("Please enter Number of Lockers: ");

        //If statement to check for valid input
        if (scn.hasNextInt()) {
            numLockers = scn.nextInt();
            if (numLockers <= 0) {
                System.out.println("Input is invalid. Please enter a positive number without decimals.");
                return;
            }
        } else {
            System.out.println("Input is invalid. Please enter a positive number without decimals.");
            return;
        }

        //Adjust numStudents to equal numLockers
        if (numStudents != numLockers) {
            numStudents = numLockers;
        }


        // Create an array to store the status of each array
        // The first student closed all lockers, each lockers[i] is false
        boolean[] lockers = new boolean[numLockers];

        // Each student changes the lockers
        for (int j = 1; j <= numStudents; j++) {
            for (int i = j - 1; i < numLockers; i += j) {
                lockers[i] = !lockers[i];
            }
        }

        // Find which one is open
        for (int i = 0; i < numLockers; i++) {
            if (lockers[i]) {
                System.out.println("Locker " + (i + 1) + " is open");
                openLockers++;

            }
        }
        System.out.println("Total number of Students: " + numStudents);
        System.out.println("Total number of Lockers: " + numLockers);
        System.out.println("Total number of Lockers open: " + openLockers);
        System.out.println("Total number of Lockers closed: " + (numLockers - openLockers));

    }
}

