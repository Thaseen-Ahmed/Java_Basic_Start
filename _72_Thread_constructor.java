
class Mythr extends Thread {
    public Mythr(String name) {
        super(name);
    }

    public void run() {
        int i = 5;
        while (i < 50) {
            System.out.println("The Thread Construtor");
            i++;
        }
    }
}

        class Thread5 extends Thread {
            public Thread5(String name, int Id) {
                System.out.println("I am the a Thr5 with name " + name + " and Id " + Id);
            }
            public void read(String name,int Id){
                System.out.println(name+" Thread is Reading the thread of id "+Id);
            }
            public void run(String name,int Id){
                int i=2;
                while(i<20) {
                    System.out.println("I am Thread5 of "+name+" And i am Running with id "+Id);
                    i++;
                }
            }
        }

public class _72_Thread_constructor {
    public static void main(String[] args) {

        Mythr t =new Mythr("Thaseen");
        Mythr t2 =new Mythr("Ahmed");
        Thread5 t5=new Thread5("Captain",56);

//        t.start();
//        t2.start();
        System.out.println("The id of the thread is " +t.getId());
        System.out.println("The name of the thread is " +t.getName());
        System.out.println("The id of the thread is " +t2.getId());
        System.out.println("The name of the thread is " +t2.getName());

        t5.read("Adnan",34);
        t5.run("Thaseen",78);
        t5.start();
    }
}
