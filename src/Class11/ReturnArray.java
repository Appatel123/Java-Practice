package Class11;

public class ReturnArray {

    static int[] get(){
        return new int[]{1,3,5,9,6};
    }

    public static void main(String args[]){

        int arr[]=get();

        for(int i=1;i<arr.length;i++)
            System.out.println(arr[i]);
    }
}

