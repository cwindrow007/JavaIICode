
/*
Author: Christopher Windrow
Description: Week 12 - Sorting
 */
import java.util.ArrayList;
import java.util.Random;

public class QuickSortMain {

    static Random random = new Random();
    public static void main(String[] args) {
        ArrayList<Integer> theList = new ArrayList<Integer>();
        theList.add(3);
        theList.add(7);
        theList.add(44);
        theList.add(23);
        theList.add(11);
        theList.add(55);
        theList.add(43);
        theList.add(55);
        theList.add(43);
        theList.add(51);
        theList.add(41);
        theList.add(52);
        theList.add(43);
        theList.add(13);
        System.out.println(theList);
        theList = quickSort(theList);
        System.out.println(theList);
    }



    private static ArrayList<Integer> quickSort(ArrayList<Integer> list) {
        if(list.size() <= 1) return list;

        int pivotIndex = pick(list);

        ArrayList<ArrayList<Integer>> partitioned = partitionQ(list, pivotIndex);

        ArrayList<Integer> L = quickSort(partitioned.get(0));
        ArrayList<Integer> E = partitioned.get(1);
        ArrayList<Integer> G = quickSort(partitioned.get(2));

        ArrayList<Integer> sorted = new ArrayList<>();

        sorted.addAll(L);
        sorted.addAll(E);
        sorted.addAll(G);

        return sorted;

    }

    //Input: ArrayList list of Integer object; pivotIndex which is the index for the pivot Integer
    //Output/return: ArrayList of 3 ArrayLists, L E & G
    //			L: ArrayList of Integer objects with values less than the pivot Integer value
    //			E: ArrayList of Integer objects with values equal to the pivot Integer value (just 1 Integer object for unique lists)
    //			G: ArrayList of Integer objects with values greater than the pivot Integer value
    //			NOTE: pivot Integer value is NOT the pivot index.
    //			NOTE: L is added to the return value first, followed by E, then G.
    private static ArrayList<ArrayList<Integer>> partitionQ(ArrayList<Integer> list,int pivotIndex){
        ArrayList<Integer> L = new ArrayList<>();
        ArrayList<Integer> E = new ArrayList<>();
        ArrayList<Integer> G = new ArrayList<>();

        Integer pivotValue = list.get(pivotIndex);

        for(Integer item : list){
            if (item < pivotValue) L.add(item);
            else if (item.equals(pivotValue)) E.add(item);
            else G.add(item);
        }
        ArrayList<ArrayList<Integer>> partitioned = new ArrayList<>();
        partitioned.add(L);
        partitioned.add(E);
        partitioned.add(G);
        return partitioned;
        }

    //Input: ArrayList of integer objects
    //Output/return: randomly chosen index value between 0 and the size of the list.
    //Hint: use the Random class from java.util, along with the nextInt method.
    private static int pick(ArrayList<Integer> list) {

        Random r = new Random();
        int sizeOfList = size(list);
        if(sizeOfList == 0) return 0;
        else return r.nextInt(size(list));
    }


    //Input: ArrayList of integer objects
    //Output/return: size of list.
    private static int size(ArrayList<Integer> list) {
        return list.size();
    }
}

/*
Output:
[3, 7, 44, 23, 11, 55, 43, 55, 43, 51, 41, 52, 43, 13]
[3, 7, 11, 13, 23, 41, 43, 43, 43, 44, 51, 52, 55, 55]
 */
