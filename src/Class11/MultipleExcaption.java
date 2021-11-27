package Class11;

public class MultipleExcaption {

    public static void main(String[] args) {

        try{
            int p[]=new int[5];
            p[1]=10/0;
            System.out.println(p[10]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(Exception e)
        {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("amit patel");
    }
}
