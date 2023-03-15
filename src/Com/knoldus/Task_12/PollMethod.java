package Com.knoldus.Task_12;

import java.util.LinkedList;

//Poll method deletes the head of the list and returns it. Return Value: This function returns the
// first element (head) of the linked list if there are elements in the list, and if the list is
// empty, it returns null.


public class PollMethod {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");

        String firstElement = list.poll();
        if (firstElement != null) {
            System.out.println("First element using poll(): " + firstElement);
        } else {
            System.out.println("The list is empty.");
        }
    }
}
