package Com.knoldus.Task_13;

import java.util.Collections;
import java.util.List;

public class MinElement {
    public static void main(String[] args) {
        List<Integer> myList = List.of(5, 2, 9, 1, 7);

        int min = Collections.min(myList);

        System.out.println(min);
    }

}
