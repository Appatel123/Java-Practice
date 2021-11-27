package Class11;

public class ExceptionIfElse {

    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException(" Boy must be at least 18 years old.");
        }
        else {
            System.out.println("Allowed - You are old enough!");
        }
    }

    public static void main(String[] args) {
        checkAge(15); // Set age to 15 (which is below 18...)
    }
}


