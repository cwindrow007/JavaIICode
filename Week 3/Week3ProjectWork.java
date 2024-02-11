/*
Title: Week 3 Project work
Author: Christopher Windrow
Description:
    This is week 3 Project work to edit and add to previous Week 2 Project

 */
import java.util.Scanner;
public class Week3ProjectWork {


    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);

        //User Input for number of runners
        System.out.println(" Enter the number of runners: ");
        int numRunners = scn.nextInt();
        scn.nextLine();

        //Array to store runner names and pace into numRunners
        String[] runnerNames = new String[numRunners];
        double[] avgPace = new double[numRunners];

        //Variables for Totals
        double totalRunDistance = 0;
        double totalTime = 0;
        int totalRuns = 0;

        //For-Loop for each runner
        for(int i = 0; i < numRunners; i++){
            //Reads runner's name
            System.out.println("Enter the name of the runner " + (i + 1) + ": ");
            runnerNames[i] = scn.nextLine();

            //Reads numRuns for the current runner
            System.out.println("Enter the number of runs for " +  runnerNames[i] + ": ");
            int numberRuns = scn.nextInt();
            scn.nextLine();

            //Variables for current runner
            double runnerTotalDistance = 0;
            double runnerTotalTime  = 0;

            //Loop over each run of the current runner
            for(int j = 0; j <numberRuns; j++){
                //Gets Runners distance for current run
                System.out.println("Enter the distance in miles for run " + (j + 1) + " for " + runnerNames[i] + ": ");
                double distance = scn.nextDouble();

                //Gets Runners time for current run
                System.out.print("Enter the time in minutes for run " + (j + 1) + " for " + runnerNames[i] + ": ");
                double time = scn.nextDouble();
                scn.nextLine();

                //Updates total run distance/time for runner
                runnerTotalDistance += distance;
                runnerTotalTime += time;
            }
            //Calculate and stores average runners pace into an array
            avgPace[i] = runnerTotalTime/runnerTotalDistance;
            //Updates to Total Run distances per Runner
            totalRunDistance += runnerTotalDistance;
            totalTime += runnerTotalTime;
            totalRuns += numberRuns;
        }
        //Output of each runner's name and avgPace
        for(int i = 0; i < numRunners; i++){
            System.out.println(runnerNames[i] + "'s average pace: " + avgPace[i] + " minutes per mile.");
        }
        //Calculation/output of average pace for all runners
        double overallAvgPace = totalTime/totalRunDistance;
        System.out.println("Overall average pace for all runs: " + overallAvgPace + " minutes per mile.");
        //outputs the total number of runners and runs
        System.out.println("Total number of runners: " + numRunners);
        System.out.println("Total number of runs: " + totalRuns);



        }
    }

