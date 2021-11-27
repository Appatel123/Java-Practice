package Class11;
import java.util.HashMap;
public class HashIntString {

    public static void main(String[] args) {
        HashMap<String, Integer> capitalCities = new HashMap<String,Integer>();
        capitalCities.put("England", 001);
        capitalCities.put("India", 420);
        capitalCities.put("Rom", 120);
        capitalCities.put("USA", 100);
        capitalCities.clear();
        System.out.println(capitalCities);
    }

}
