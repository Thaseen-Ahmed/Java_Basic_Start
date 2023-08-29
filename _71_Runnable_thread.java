
class MyThreadRunnable implements Runnable {
    @Override
    public void run() {
        int i=0;
        while(i<30) {
            System.out.println("I am thread 1 not a thread");
            i++;
        }
        }

}
    class MyThreadRunnable2 implements Runnable{
        @Override
        public void run() {
            int i = 0;
            while (i < 30) {
                System.out.println("I am thread 2 not a thread");
                i++;
            }
        }


}

public class _71_Runnable_thread {
    public static void main(String[] args) {
        MyThreadRunnable bullet1 = new MyThreadRunnable();
        Thread gun1=new Thread(bullet1);
        MyThreadRunnable2 bullet2= new MyThreadRunnable2();
        Thread gun2=new Thread(bullet2);

        gun1.start();
        gun2.start();

    }
}
