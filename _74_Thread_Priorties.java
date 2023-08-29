
class Mythr1 extends Thread {
    public Mythr1(String name) {
        super(name);
    }

    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("Thank You Mr "+this.getName());
            i++;
        }
    }
}

public class _74_Thread_Priorties {
    public static void main(String[] args){

        Mythr1 t =new Mythr1("Ahmed");
        Mythr1 t2 =new Mythr1("Captain");
        Mythr1 t3 =new Mythr1("Syed");
        Mythr1 t4 =new Mythr1("Seenu");
        Mythr1 t5 =new Mythr1("Thaseen (most Important)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t.setPriority(Thread.MIN_PRIORITY);
        t.start();
        t2.start();
        t5.start();
        t3.start();
        t4.start();


    }
}
