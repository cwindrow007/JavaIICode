/*
Title: Week 2 Project work
Author: Christopher Windrow
Description:
    This is week 2 project work to write a program which is in O(n) time

 */
import java.util.Scanner;
public class Week2Worksheet {


    public static void main (String[] args){
        double distance = 0;
        double time = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number of runs: ");
        int numRums = scn.nextInt();

        for(int i=0; i < numRums; i++){
            System.out.println("Enter the distance in miles run " + (i + 1) + " was (Use Decimal Format): ");
            double distanceRan = scn.nextDouble();
            System.out.print("Enter the time spend in minutes for the run " + (i +1) + " (Use Decimal Format): ");
            double timeRan = scn.nextDouble();

            distance += distanceRan;
            time += timeRan;
        }
        double averagePace = time/distance;
        System.out.println("The average pace is " + averagePace + " minutes per mile.");
        scn.close();
    }
    /*output example:
    Enter number of runs:
3
Enter the distance in miles run 1 was (Use Decimal Format):
30
Enter the time spend in minutes for the run 1 (Use Decimal Format): 300
Enter the distance in miles run 2 was (Use Decimal Format):
26
Enter the time spend in minutes for the run 2 (Use Decimal Format): 200
Enter the distance in miles run 3 was (Use Decimal Format):
10.56
Enter the time spend in minutes for the run 3 (Use Decimal Format): 18.8
The average pace is 7.794471153846153 minutes per mile.

Process finished with exit code 0

     */


}
