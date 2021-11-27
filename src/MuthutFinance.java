public class MuthutFinance {
    float GetRate2fInterest(){return 1;}
}
class Muthut extends MuthutFinance{
    float getRate2fInterest(){return 11.4f;}
}
class PNB extends MuthutFinance{
    float getRate2fInterest(){return 9.5f;}
}
class YES extends MuthutFinance{
    float getRate2fInterest(){return 10.2f;}
}
class TestPolymorphism{
    public static void main(String args[]){
        MuthutFinance b;
        b=new Muthut();
        System.out.println("Mutht Rate of Interest: "+b.GetRate2fInterest());
        b=new PNB();
        System.out.println("PNB Rate of Interest: "+b.GetRate2fInterest());
        b=new YES();
        System.out.println("YES Rate of Interest: "+b.GetRate2fInterest());
    }


}
