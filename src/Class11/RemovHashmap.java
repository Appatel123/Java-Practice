package Class11;
import java.util.HashMap;
public class RemovHashmap {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("India", "Delhi");
        capitalCities.put("Rom", "Bethliham");
        capitalCities.put("USA", "Washington DC");
        capitalCities.remove("England");
        System.out.println(capitalCities);
    }
}