/*
Author: Christopher Windrow
Description: Week 10 - Queues
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Week9QMain {

    private static Queue<String> myQueue = new LinkedList<String>();
    private static ArrayList<String> myArray = new ArrayList<String>();
    public static void main(String [] args) {

        myQueue.add("Hi");
        myQueue.add("Hello");
        myQueue.add("Hey");
        myQueue.add("Greetings");
        myQueue.add("Yo");
        myQueue.add("Good Day");
        System.out.println("1");
        outputMyQueue();
        transferQueueToArray();
        System.out.println("2");
        outputMyArray();
        reverseArrayUsingQueue();
        System.out.println("3");
        outputMyArray();
        transferArrayToQueue();
        transferAndSortQueueToArray();
        System.out.println("4");
        outputMyArray();
        reverseArrayUsingQueue();
        System.out.println("5");
        outputMyArray();
        transferArrayToQueue();
        transferQueueToArrayQ();
        System.out.println("6");
        System.out.println(removeFromArrayQ());
        System.out.println(removeFromArrayQ());
        System.out.println(removeFromArrayQ());
        System.out.println(removeFromArrayQ());
        System.out.println(removeFromArrayQ());
        System.out.println(removeFromArrayQ());

    }

    //Output queue elements on each line, for each in myQueue
    private static void outputMyQueue() {
        for(String s: myQueue){
            System.out.println(s);
        }
    }

    //Simply removes each element off of myQueue and adds it to myArray at index 0
    private static void transferQueueToArray() {
        while(!myQueue.isEmpty()){
            myArray.add(0, myQueue.remove());
        }
    }

    //Outputs the myArray in order of the indices
    private static void outputMyArray() {
        myArray.forEach(o -> {
            System.out.println(o);
        });
    }

    //Simply adds each element from myArray to myQueue,
    //in the order of myArray indices. empties myArray.
    private static void transferArrayToQueue() {
        for (String s : myArray) {
            myQueue.add(s);
        }
        myArray.clear();
    }

    //Uses myStack to reverse the order of elements in myArray
    //Hint: You can do this by simply calling a couple other methods in this class :-)
    private static void reverseArrayUsingQueue() {
        transferArrayToQueue();
        transferQueueToArray();
    }

    //Removes each element off myQueue, and adds the elements to the myArray ArrayList, and
    //orders it in ascending order alphabetically
    private static void transferAndSortQueueToArray() {
        while(!myQueue.isEmpty()) {
            String currString = myQueue.remove();
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
    //Assumes myArray is used like a Queue:
    //index 0 is the "tail" of the queue
    //This method adds the value to index 0 in myArray
    private static void enqueueOnArrayQ(String value) {
        myArray.add(0, value);
    }

    //special method that uses enqueueOnArrayQ to transfer myQueue elements to myArray
    private static void transferQueueToArrayQ() {
        while (!myQueue.isEmpty()){
            enqueueOnArrayQ(myQueue.remove());
        }
    }

    //Assumes myArray is used like a Queue:
    //Last index is the "head" of the queue
    //This method returns the value of the last index in myArray, and removes it from myArray
    private static String removeFromArrayQ() {
        return myArray.remove((myArray.size() - 1));
    }

}