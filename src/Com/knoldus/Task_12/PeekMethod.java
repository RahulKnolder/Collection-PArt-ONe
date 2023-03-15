package Com.knoldus.Task_12;

import java.util.LinkedList;

//This method returns the head of this list, or null if this list is empty.
public class PeekMethod {


    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");

        String firstElement = list.peek();
        System.out.println("First element using peek(): " + firstElement);
    }
}
