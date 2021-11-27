package Class8;

public class Constrcture {
    int id;
    String name;

    Constrcture(int A,String B){
        id = A;
        name = B;
    }
    //
    void display(){System.out.println(id+" "+name);}

    public static void main(String args[]){

       Constrcture A1 = new Constrcture(100,"Amit");
        Constrcture A2 = new Constrcture(200,"Toral");

        A1.display();
        A2.display();
    }
}
