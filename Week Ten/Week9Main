/*
Author: Christopher Windrow
Description: Week 10 - Stacks
 */
package week9;
import java.util.ArrayList;
import java.util.Stack;


public class Week9Main {

    private static Stack<String> myStack = new Stack<String>();
    private static ArrayList<String> myArray = new ArrayList<String>();


    public static void main(String[] args) {
        for(int i = 1; i< 5; i++) {
            System.out.println(i);
        }
        myStack.push("Hi");
        myStack.push("Hello");
        myStack.push("Hey");
        myStack.push("Greetings");
        myStack.push("Yo");
        myStack.push("Good Day");
        System.out.println("1");
        outputMyStack();
        transferStackToArray();
        System.out.println("2");
        outputMyArray();
        reverseArrayUsingStack();
        System.out.println("3");
        outputMyArray();
        transferArrayToStack();
        System.out.println("4");
        outputMyStack();
        transferAndSortStackToArray();
        System.out.println("5");
        outputMyArray();
        reverseArrayUsingStack();
        System.out.println("6");
        outputMyArray();
    }

    //Output stack elements on each line, for each in myStack
    //Note the special way the for loop works, and the toString can be applied to Object.
    private static void outputMyStack(){
        for(String s : myStack){
            System.out.println(s);

        }

    }

    //Simply pops each element off of myStack and adds it to myArray at index 0
    private static void transferStackToArray() {
        while(!myStack.isEmpty()){
            myArray.add(0, myStack.pop());
        }

    }

    //Outputs the myArray in order of the indices
    private static void outputMyArray() {
        myArray.forEach(o -> {
            System.out.println(o);
        });
    }

    //Simply pushes each element from myArray to myStack,
    //in the order of myArray indices. empties myArray.
    private static void transferArrayToStack() {
        for(String s : myArray){
            myStack.push(s);
        }
        myArray.clear();
    }

    //Uses myStack to reverse the order of elements in myArray
    private static void reverseArrayUsingStack() {
       for(String s: myArray){
           myStack.push(s);
       }
       myArray.clear();

       while(!myStack.isEmpty()){
           myArray.add(myStack.pop());
       }
    }


    //Pops each element off myStack, and adds the elements to the myArray ArrayList, and
    //orders it in ascending order alphabetically
    private static void transferAndSortStackToArray() {
        while(!myStack.isEmpty()) {
            String currString = myStack.pop();
            ArrayList<String> newArray = new ArrayList<>();
            boolean foundGreater = false;
            for(Object o: myArray) {
                if(foundGreater) {//Already found the greater values, just add them
                    newArray.add(o.toString());
                }else {
                    if(currString.compareTo(o.toString())<0){//place it in now since it's greater
                        newArray.add(currString);
                        foundGreater = true;
                    }
                    newArray.add(o.toString());
                }
            }
            if(!foundGreater) {
                newArray.add(currString);
            }
            myArray = newArray;
        }
    }



}
