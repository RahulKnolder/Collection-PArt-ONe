package Com.knoldus.Task_8;

import java.util.ArrayList;
import java.util.Arrays;

public class SubListIndex {


    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50));
        ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(30, 40));

        int index = list1.indexOf(list2.get(0));

        while (index != -1) {
            if (list1.subList(index, index + list2.size()).equals(list2)) {
                System.out.println("Sub list found at index: " + index);
                break;
            }
            index = list1.indexOf(list2.get(0));
        }

        if (index == -1) {
            System.out.println("Sub list not found");
        }

    }
}
