package JavaHomework;
/*
 * Christopher Windrow
 * 01-24-2024
 * Assignment 1 - Calculating Future Investment Value
 */

import java.util.Scanner;
/*Public method to calculate future investment value
 * rate is the formula to convert an interest rate to a percentage
 * invstValue is to calculate the accumulated value of interest
 * return statement to round accumulateValue to two decimal places
 * 
 */
public class CalculateInvestment {
	
	public static double calculateInterest(double invstAmnt, double ratePercentage, int numYears) {
		double rate = (ratePercentage/100) / 12;
		double invstValue = invstAmnt * Math.pow(1 + rate, numYears * 12);
		return Math.round(invstValue * 100.0) / 100.0;
		
	}
	//Main Method taking user input, calling calculateInterest Method, and output Accumulated Value
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println ("Enter investment amount: ");
		double invstAmnt = scn.nextDouble();
		System.out.println("Entere annual Interest Rate: ");
		double ratePercentage = scn.nextDouble();
		System.out.println("Enter the number of years: ");
		int numYears = scn.nextInt();
		
		double accumulatedValue = calculateInterest(invstAmnt,ratePercentage,numYears);
		System.out.println("Accumulated value is: " + accumulatedValue);
	}

}
