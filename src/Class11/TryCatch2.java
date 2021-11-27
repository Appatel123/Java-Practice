package Class11;

public class TryCatch2 {

    public static void main(String[] args) {
        try
        {
            int data=5/0;

            System.out.println("rest of the code");
        }

        catch(ArithmeticException e)
        {
            System.out.println(e);
        }


    }
}
