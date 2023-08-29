
interface Bicycle{
    int a=21;
    void applyBrake(int decrement);
    void speedUp(int increment);

}
class Avoncycle implements Bicycle{
        void Blowhorn(){
            System.out.println("pee popoponjdsbkal");
        }
       public void applyBrake(int decrement){
            System.out.println("Applying Brake");
        }
       public void speedUp(int increment){
            System.out.println("Apply speed");
        }
}

public class _55_Abstract_class_VS_Interfaces {
    public static void main(String[] args) {

        Avoncycle Cycle=new Avoncycle();
        Cycle.applyBrake(54);
//        You can create properties in Interfaces
        System.out.println(Cycle.a);
//        You cannot modify the already created properties in Interfaces as they are final
//        Cycle.a=62;
        System.out.println(Cycle.a);


    }
}
