public class Bullet {

    void Drive(){System.out.println("Driving");}
}
class enfield extends Bullet{
    void Drive(){System.out.println("Driving safely with 60km");}

    public static void main(String args[]){
        Bullet b = new enfield();
        b.Drive();
    }

}
