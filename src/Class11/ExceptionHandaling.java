package Class11;

public class ExceptionHandaling {

    public static void main(String[] args) {

        try {


            int divideByZero = 2/ 0;
            System.out.println("Rest of code in try block");
        }

        catch (ArithmeticException e) {
            System.out.println("ArithmeticException => " + e.getMessage());
        }
    }

}
