package Com.knoldus.Task_5;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSwap {


    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("Rahul");
        list.add("Anand");
        list.add("Sinhghania");
        list.add("Akash");

        System.out.println("Before swapping:");
        System.out.println(list);

        // Swap the elements at index 1 and 3
        Collections.swap(list, 1, 3);

        System.out.println("After swapping:");
        System.out.println(list);

    }
}
