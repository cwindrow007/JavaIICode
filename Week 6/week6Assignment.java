/*
Author: Christopher Windrow
Description: Week 6 exception handling assignment. This assignment take the input of two temperatures from a user, handles any exceptions, and outputs the difference
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class week6Assignment {
//Method to get high temperature from user
    public static double highTemp(){
        System.out.println("What was the highest temperature for today? ");

        Scanner scn = new Scanner(System.in);
        double high = 0;

        try{
            high = scn.nextDouble();
        } catch(InputMismatchException e) {
            scn.next();
            System.out.println("Sorry that is the wrong temperature. The temperature must be an integer or decimal. Please try again!");
            highTemp();
        }
        return high;
    }
    //Method to get low temperature from user
    public static double lowTemp(){
        System.out.println("What was the lowest temperature for today? ");
        double low = 0;

        Scanner scn = new Scanner(System.in);

        try{
            low = scn.nextDouble();
        } catch(InputMismatchException e) {
            scn.next();
            System.out.println("Sorry that is the wrong temperature. The temperature must be an integer or decimal. Please try again!");
            lowTemp();
        }
        return low;
    }

    //Method to check for low temp being greater than high temp and throw exception
    public static void checkTemp(double low, double high){
        if(low > high){
            throw new IllegalArgumentException("Low Temperature cannot be higher then high temperature.");
        }
    }


//Main Method
    public static void main(String[] args) {
        boolean validInput = false;
        double high = 0, low = 0;

        //While loop which runs through each method
        while(!validInput){
            try{
                high = highTemp();
                low = lowTemp();
                checkTemp(low, high);
                validInput = true;
            }catch( IllegalArgumentException e) {
                System.out.println("You entered a high input that is greater than low input. Please re-enter both high and low temps and try again.");
            }
        }
        //Tells and gives temperature difference
        System.out.println("The temperature difference was: "  +  (high - low));


    }
}
/*
Outputs:
What was the highest temperature for today?
Seventy Seven
Sorry that is the wrong temperature. The temperature must be an integer or decimal. Please try again!
What was the highest temperature for today?
77.25
What was the lowest temperature for today?
88.9
You entered a high input that is greater than low input. Please re-enter both high and low temps and try again.
What was the highest temperature for today?
77.35
What was the lowest temperature for today?
54.4
The temperature difference was: 22.949999999999996

Process finished with exit code 0
 */
