package Com.knoldus.Task_12.Task_12_GettingFirstElement;

import java.util.LinkedList;


/*peekFirst() method retrieves, but does not remove, the first element
 of this list, or returns null if this list is empty*/


public class PeekFirst {

    public static void main(String[] args) {
        // declaring a LinkedList
        LinkedList list = new LinkedList();

        // adding  elements
        list.add("Rahul");
        list.add("kumar");
        list.add("sinha");
        list.add("Anu");

        // printing the list
        System.out.println("The initial list is :" + list);

        // peek at the first element of the list
        // Prints 1st element, "Geeks"
        System.out.println("First element of the list is : " + list.peekFirst());
    }
}
