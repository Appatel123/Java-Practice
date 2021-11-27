package Class11;
import java.util.ArrayList;
public class ArListFor {

    public static void main(String[] args) {
        ArrayList<String> eitems = new ArrayList<String>();
        eitems.add("Volvo");
        eitems.add("BMW");
        eitems.add("Ford");
        eitems.add("Mazda");
        for (String i : eitems) {
            System.out.println(i);
        }
    }
}
