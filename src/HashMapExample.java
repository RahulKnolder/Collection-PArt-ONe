import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        // create a new HashMap object
        Map<String, Integer> scores = new HashMap<>();

        // add some key-value pairs to the HashMap
        scores.put("Rahul", 100);
        scores.put("Nadra", 200);
        scores.put("ANu", 300);
        scores.put("Riya", 400);


         //print out the keys and values in the HashMap


        for (String name : scores.keySet()) {
            int score = scores.get(name);
            System.out.println(name + ": " + score);
        }

        scores.replace("Rahul",7);


        {

        }

    }

}
