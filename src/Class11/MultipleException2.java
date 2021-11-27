package Class11;

public class MultipleException2 {

    public static void main(String[] args) {
        try {
            int array[] = new int[10];
            array[10] = 20/ 0;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
