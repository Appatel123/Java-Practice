package Class8;

public class Humen {

    void Run(){System.out.println("Runing");}
}
class Man extends Humen{
    void Catch(){System.out.println("Catching");}
}
class HumenInheritance{
    public static void main(String args[]){
        Man M=new Man();
        M.Run();
        M.Catch();
    }
}



