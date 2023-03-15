package Com.knoldus.Task_10;

import java.util.LinkedHashSet;

public class Test {
    public static void main(String args[]) {
        LinkedHashSet<Student> hashSet = new LinkedHashSet<Student>();
        hashSet.add(new Student(1, "Jai", 50000));
        hashSet.add(new Student(2, "Mahesh", 80000));
        hashSet.add(new Student(3, "Vishal", 60000));
        hashSet.add(new Student(4, "Hemant", 64000));


        for (Student e : hashSet) {
            System.out.println(e);
        }


        System.out.println("Add duplicate record:");
        hashSet.add(new Student(3, "Vishal", 60000));
        for (Student e : hashSet) {
            System.out.println(e);
        }
    }
}