package Class8;

public class AbstractclassBicycle {
    void run() {

    }
}
class Atlas extends AbstractclassBicycle{
    void run(){System.out.println("running fast");}
    public static void main(String args[]){
        AbstractclassBicycle obj = new Atlas();
        obj.run();
    }
}
