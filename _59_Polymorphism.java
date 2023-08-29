interface Camera2{
    void takeSnap();
    void recordVideo();
    private void Greet(){
        System.out.println("Good Afternoon");
    }
    default void record4kvideo(){
        Greet();
        System.out.println("Reconding the 4k Video...");
    }
//   we don't have declare the method in class if we use default in interface
//   And if we override the default method the override method will be executed and  not default
}
interface Wifi2{
    String[] getNetworks();
    void connectNetwork(String Network);

}
class MycellPhone2{
    void callNumber(int phonenumber){
        System.out.println("Calling" + phonenumber);
    }
    void pickCall(){
        System.out.println("Connecting.....");
    }

}
class MySmartPhone2 extends MycellPhone2 implements Wifi2,Camera2{
    public void takeSnap(){
        System.out.println("Taking Snap");
    }
    public void recordVideo(){
        System.out.println("Recording the Video");
    }
    //    public void record4kvideo(){
//        System.out.println("Taking snap and recording the 4k Video...");
//    }
    public String[] getNetworks(){
        System.out.println("Getting list of networks");
        String [] networklist={"Thaseen","Adnan","Afraz","Mudassir"};
        return networklist;
    }

    @Override
    public void connectNetwork(String Network) {
        System.out.println("Connecting to " + Network);
    }

    public void ConnectTONetworks(String network){
        System.out.println("Connecting to "+ network);
    }
}

public class _59_Polymorphism {
    public static void main(String[] args) {
        Camera2 cam1=new MySmartPhone2();   // This is smartphone but,use it as a camera
//        cam1.getNetworks();  ----> Not allowed because this is only camera not wifi ot getnetworks interface

//        Aloowed below
        cam1.record4kvideo();

        MySmartPhone2 Mob =new MySmartPhone2();
        Mob.record4kvideo();
        Mob.getNetworks();
        Mob.callNumber(701084464);
        Mob.pickCall();
        


    }
}
