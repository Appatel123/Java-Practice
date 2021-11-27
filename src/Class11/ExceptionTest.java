package Class11;

public class ExceptionTest {

    public static void main(String args[]){
        try{

            int Mark=100/0;
        }catch(ArithmeticException e){System.out.println(e);}

        System.out.println("last amount...");
    }

}
