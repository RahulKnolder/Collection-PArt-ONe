package Com.knoldus.Task_6;

import java.util.LinkedList;

public class LinkedListSwap {

    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Before swapping:");
        System.out.println(numbers);

        // Swap the elements at index 1 and 3
        int index1 = 1;
        int index2 = 3;
        int temp = numbers.get(index1);
        numbers.set(index1, numbers.get(index2));
        numbers.set(index2, temp);

        System.out.println("After swapping:");
        System.out.println(numbers);

    }
}
