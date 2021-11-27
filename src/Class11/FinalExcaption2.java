package Class11;

public class FinalExcaption2 {

    public static void main(String args[]){
        try {
            System.out.println("Inside try block");

            int data=20/0;
            System.out.println(data);
        }

        catch (ArithmeticException e){
            System.out.println("Exception handled");
            System.out.println(e);
        }

        finally {
            System.out.println("finally block is always executed");
        }
        System.out.println("Last code...");
    }
}
