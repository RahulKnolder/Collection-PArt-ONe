package Com.knoldus.Task_7;

import java.util.*;
public class CloneArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<Integer>();
        List.add(10);
        List.add(20);
        List.add(30);
        List.add(40);

        // Method 1: Using the ArrayList constructor
        ArrayList<Integer> cloneList1 = new ArrayList<Integer>(List);

        // Method 2: Using the clone() method
        ArrayList<Integer> cloneList2 = (ArrayList<Integer>) List.clone();

        System.out.println("Original ArrayList: " + List);
        System.out.println("Copy ArrayList (using constructor): " + cloneList1);
        System.out.println("Copy ArrayList (using clone method): " + cloneList2);

    }
}

