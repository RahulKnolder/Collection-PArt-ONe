package Com.knoldus.Task_2;

import java.util.ArrayList;
import java.util.List;

public class ReplaceWithNewObject {


    public static void main(String[] args) {

        // Create a list of 5 objects
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Replace all objects with a new object
        int newObject = 7;


        for (int i = 0; i < list.size(); i++) {
            list.set(i, newObject);
        }

        // Print the list
        System.out.println(list);
    }
}
