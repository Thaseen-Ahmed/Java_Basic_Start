
class Practise13 extends Thread{
    public void run(){
        int i=0;
        while(i<300) {
            System.out.println("Good Morning");
            i++;
        }
    }
}
class Practise13B extends Thread{
    public void run(){
//        int i=0;
//        while(i<300) {
//            try {
//                Thread.sleep(200);
//            }
//            catch (Exception e){
//                System.out.println(e);
//            }
//            System.out.println("Welcome");
//            i++;
//        }
    }
}

public class _76_Prac_set_CH_13 {
    public static void main(String[] args) {

        Practise13 p13 = new Practise13();
        Practise13B b13 = new Practise13B();
        p13.setPriority(6);
        b13.setPriority(9);
        System.out.println(p13.getPriority());
        System.out.println(b13.getPriority());
        System.out.println(p13.getState());
        System.out.println(b13.getState());

//        p13.start();
//        b13.start();
    }
}

