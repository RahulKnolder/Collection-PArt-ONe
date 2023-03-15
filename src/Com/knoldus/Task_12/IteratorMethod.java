package Com.knoldus.Task_12;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorMethod {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Rahul");
        list.add("Shrasti");
        list.add("Akash");


        Iterator<String> iterator = list.iterator();
        String firstElement = iterator.next();
        System.out.println("First element using iterator: " + firstElement);
    }
}
