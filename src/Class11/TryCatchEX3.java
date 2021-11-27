package Class11;

public class TryCatchEX3 {


    public static void main(String[] args) {
        try
        {
            int data=100/0;
            System.out.println("LONDON");
        }

        catch(ArithmeticException e)
        {
            System.out.println(e);
        }

    }
}
