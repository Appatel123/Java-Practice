package Class11;

public class Array3 {

    static void min(int arr[]){
        int Max=arr[0];
        for(int i=1;i<arr.length;i++)
            if(Max>arr[i])
                Max=arr[i];

        System.out.println(Max);
    }

    public static void main(String args[]){
        int a[]={10,1,5,5};
        min(a);
    }}

