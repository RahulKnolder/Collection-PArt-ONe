package Com.knoldus.Task_10;

import java.util.LinkedHashSet;

public class RemoveDuplicatesFromLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<UserDefinedClass> set = new LinkedHashSet<>();


        set.add(new UserDefinedClass("object1"));
        set.add(new UserDefinedClass("object2"));
        set.add(new UserDefinedClass("object1")); // duplicate
        set.add(new UserDefinedClass("object3"));
        set.add(new UserDefinedClass("object2")); // duplicate




        System.out.println("Original LinkedHashSet: " + set);



        LinkedHashSet<UserDefinedClass> uniqueSet = new LinkedHashSet<>(set);

        // Loop through the original set and add each object to the new set
        // The LinkedHashSet will automatically eliminate duplicates
        for (UserDefinedClass object : uniqueSet) {
            uniqueSet.add(object);
        }

        // Print the new set containing only unique objects
        System.out.println("LinkedHashSet without duplicates: " + uniqueSet);
    }
    }

