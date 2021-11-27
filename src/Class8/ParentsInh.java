package Class8;

public class ParentsInh {

    void Throw(){System.out.println("Throwing...");}
}
class Child extends ParentsInh{
    void Sleep(){System.out.println("Sleep...");}
}
class Bebychild extends Child{
    void Cry(){System.out.println("Crying...");}
}
class TestInheritance2{
    public static void main(String args[]){
        Bebychild B=new Bebychild();
        B.Throw();
        B.Sleep();
        B.Cry();
    }

}





