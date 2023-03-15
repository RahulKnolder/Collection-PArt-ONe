package Com.knoldus.Task_4;

import java.util.LinkedHashSet;

public class RemoveElement {

    public static void main(String[] args) {
        // Create a new LinkedHashSet of Strings
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // Add some elements to the set
        set.add("apple");
        set.add("banana");
        set.add("cherry");
        set.add("durian");

        System.out.println("Original set: " + set);

        // Remove "banana" from the set
        set.remove("banana");

        System.out.println("Set after removing 'banana': " + set);
    }
}
