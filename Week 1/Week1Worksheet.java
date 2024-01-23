/*
Title: Week 1 Lab Worksheet
Author: Christopher Windrow
Description:
    This is Week1Worksheet code where we are to provide out IDE is working.

 */
public class Week1Worksheet {


    public static void main (String[] args){

        //Basic arithmetic operations
        System.out.println(2+6); //Addition
        System.out.println(4-5); //Subtraction
        System.out.println(14*292); //Multiplication
        System.out.println(12345/6789);//Division

        //Math class methods for power and square root
        System.out.println(Math.pow(3,7)); //Power
        System.out.println(Math.sqrt(5)); //Square Root

        //Calculating and displaying the Value of b
        double b = 5 * Math.PI;
        System.out.println(b);

        //Calculating and displaying the value of c
        double c = Math.sin(Math.PI) + 4;
        System.out.println(c);

        //Complex equation solved using Math.pow
        System.out.println((2+3*Math.pow(4,2))/24);

        //Use of Math.exp() method for a calculation
        System.out.println(Math.exp((Math.PI*4)-5));

        //Outputting a predefined grade
        int grade = 95;
        System.out.println("Your grade is " + grade);



    }

}