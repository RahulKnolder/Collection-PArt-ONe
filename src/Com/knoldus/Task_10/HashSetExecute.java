package Com.knoldus.Task_10;

import java.util.HashSet;

public class HashSetExecute {

    public static void main(String[] args) {

        HashSet<Employee> hashSet = new HashSet<>();

        Employee employe1 = new Employee(12, "rahul");
        Employee employe2 = new Employee(13, "rahul");
        Employee employe3 = new Employee(14, "Shiva");
        Employee employe4 = new Employee(15, "Ankit");
        Employee employe5 = new Employee(16, "Aditya");


        hashSet.add(employe1);
        hashSet.add(employe2);
        hashSet.add(employe3);
        hashSet.add(employe4);
        hashSet.add(employe5);


        for (Employee e : hashSet) {
            System.out.println(e);
        }


    }

}
