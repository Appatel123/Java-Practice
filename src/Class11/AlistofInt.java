package Class11;
import java.util.ArrayList;
import java.util.Collections;  // Import the Collections class

public class AlistofInt {

    public static void main(String[] args) {
        ArrayList<Integer> myMarks = new ArrayList<Integer>();
        myMarks.add(68);
        myMarks.add(60);
        myMarks.add(62);
        myMarks.add(67);
        myMarks.add(42);
        myMarks.add(52);

        Collections.sort(myMarks);  // Sort myMarks

        for (int A : myMarks) {
            System.out.println(A);
        }
    }


}
