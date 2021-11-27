package Class11;

public class TryCatch4 {

    public static void main(String[] args) {
        try
        {
            int arr[]= {2,4,6,8};
            System.out.println(arr[15]);
        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        System.out.println("last code");
    }

}
