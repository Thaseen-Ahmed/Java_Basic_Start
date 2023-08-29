
interface Camera{
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
interface Wifi{
    String[] getNetworks();
    void connectNetwork(String Network);

}
class MycellPhone{
    void callNumber(int phonenumber){
        System.out.println("Calling" + phonenumber);
    }
    void pickCall(){
        System.out.println("Connecting.....");
    }

}
class MySmartPhone extends MycellPhone implements Wifi,Camera{
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

public class _57_Java_interface_nd_Default_methods {
    public static void main(String[] args) {

        MySmartPhone phone=new MySmartPhone();
        phone.record4kvideo();
//        phone.Greet(); ----> This will throw error because greet is Private
        String[] ar=phone.getNetworks();
        for (String item:ar){
            System.out.println(item);
        }



    }
}
