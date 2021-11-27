package Class11;

public class TryCatchexcaption {

    public TryCatchexcaption(String s) {
    }

    public static void main(String[] args) {
        try
        {
            int data=10/0;
        }

        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println("Name is enough patel");
    }

    public void toString(String saved) {
    }
}
