package Com.knoldus.Task_9;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListShuffle {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Original LinkedList: " + list);

        Collections.shuffle(list);

        System.out.println("Shuffled LinkedList: " + list);

    }

}
