package Class11;

public class FinaliezeExcaption {
    public static void main(String[] args)
    {
        FinaliezeExcaption obj = new FinaliezeExcaption();

        System.out.println("Hashcode is: " + obj.hashCode());
        obj = null;

        System.gc();
        System.out.println("End of the Process");
    }

    protected void Finalize()
    {
        System.out.println("Called the finalize() method");
    }


}
