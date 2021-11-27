package Class11;
import java.util.HashMap;
public class HashStringIntValue {

    public static void main(String[] args) {

                              // Create HashMap object called people
        HashMap<String, Integer> people = new HashMap<String, Integer>();

        // Add keys and values (Name, Age)
        people.put("Akash", 24);
        people.put("Yash", 26);
        people.put("Divyesh",28);

        for (String i : people.keySet()) {
            System.out.println("Name: " + i + " Age: " + people.get(i));
        }
    }

}
