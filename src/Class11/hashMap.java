package Class11;
import java.util.HashMap;// Import the HashMap class

public class hashMap {

    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        // Create a HashMap object called capitalCities
         capitalCities.put("India","Delhi");
         capitalCities.put("Rom","Bethliham");
         capitalCities.put("Englnd","London");
         capitalCities.put("USA","Washington Dc");
        System.out.println(capitalCities);

    }
}
