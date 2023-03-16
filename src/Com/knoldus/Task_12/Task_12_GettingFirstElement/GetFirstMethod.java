package Com.knoldus.Task_12.Task_12_GettingFirstElement;

import java.util.LinkedList;

public class GetFirstMethod {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Rahul");
        list.add("Shrasti");
        list.add("Akash");

        String firstElement = list.getFirst();
        System.out.println("First element using getFirst(): " + firstElement);
    }

}
