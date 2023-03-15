package Com.knoldus.Task_11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsAddAll {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Rahul");
        list.add("Karthik");
        list.add("OM");
        list.add("Shiva");
        list.add("Anand");
        list.add("Prem");

        System.out.println("The List are: " + list);

        Collections.addAll(list, "Rahul", "OM", "Prem");

        System.out.println("Collection Value: " + list);

        System.out.println("Final collection value: " + list);
    }
}
