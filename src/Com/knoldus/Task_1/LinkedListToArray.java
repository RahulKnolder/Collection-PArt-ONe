package Com.knoldus.Task_1;

import java.util.LinkedList;

public class LinkedListToArray {

    public static void main(String[] args) {

        // Create a LinkedList of 5 objects
        LinkedList<String> List = new LinkedList<>();
        List.add("Rahul");
        List.add("Rishika");
        List.add("Nadra");
        List.add("jitin");
        List.add("Sahil");

         String array []= new String[List.size()];
         List.toArray(array);


        for (String index : array) {
            System.out.println(index);
        }



    }
}
