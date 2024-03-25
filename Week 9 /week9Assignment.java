/*
Author: Christopher Windrow
Description: Week 9 List in Java. This code is to get the range of a list, sum using a for loop, -
                     sum recursively, get the mean of two methods and the squares of numbers from uer input.
 */
package week9;

import java.util.ArrayList;
import java.util.Scanner;


public class week9Assignment {

    //Method to get all numbers between users input
    public static ArrayList<Integer> myRange(double x, double y){
        ArrayList<Integer> rangeList = new ArrayList<>();
        for(int i = (int) Math.ceil(x); i <= (int) Math.floor(y); i ++){
            rangeList.add(i);
        }
        return rangeList;
    }

    //Method to get list of numbers and computes their sum
    private static double listSum(ArrayList<Integer> list){
        double sum = 0;
        for (int num : list){
            sum += num;
        }
        return sum;
    }

    //Method that gets list of numbers and total then computes their sum recursively
    private static double listSumR(ArrayList<Integer> list, int index){
        if(index == list.size()){
            return 0;
        }else{
            return list.get(index) + listSumR(list, index + 1);
        }
    }
    //Method to  get the means of listSum and listSumR
    public static double mean(ArrayList<Integer> list) {
        return listSum(list) / list.size();
    }

    //Method to square numbers from user input
    public static ArrayList<Integer> squareList(ArrayList<Integer> list) {
        ArrayList<Integer> squarredList = new ArrayList<>();
        for (int num : list) {
            squarredList.add(num * num);
        }
        return squarredList;
    }
//Main method which takes user input for numbers to calculate all values within the list.

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Input for myRange method
        System.out.println("Enter the start and end numbers to get all numbers between them (separated by space): ");
        double start = scanner.nextDouble();
        double end = scanner.nextDouble();
        ArrayList<Integer> rangeList = myRange(start, end);
        System.out.println("Numbers between: " + rangeList);

        // Input for list methods
        System.out.println("Enter a list of integers for sum, mean, and squaring operations (end with any non-integer): ");
        ArrayList<Integer> nums = new ArrayList<>();
        while (scanner.hasNextInt()) {
            nums.add(scanner.nextInt());
        }

        // Consuming the no integer input
        if(scanner.hasNext()) {
            scanner.next();
        }

        // Performing operations on the list of numbers
        System.out.println("Sum: " + listSum(nums));
        System.out.println("Recursive Sum: " + listSumR(nums, 0));
        System.out.println("Mean: " + mean(nums));
        System.out.println("Squared List: " + squareList(nums));

        scanner.close();
    }
}
/*
Output:

Enter the start and end numbers to get all numbers between them (separated by space):
5.7 20
Numbers between: [6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
Enter a list of integers for sum, mean, and squaring operations (end with any non-integer):
6 12 18 24 30 36 42 48 54 60
-
Sum: 330.0
Recursive Sum: 330.0
Mean: 33.0
Squared List: [36, 144, 324, 576, 900, 1296, 1764, 2304, 2916, 3600]

Process finished with exit code 0
 */
