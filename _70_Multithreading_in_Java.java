
class MyThread1 extends Thread{
    public void run(){
        int i=0;
        while(i<60) {
            System.out.println("My thread is Running");
            System.out.println("I am Very happy ");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    public void run(){
        int i=0;
        while(i<60) {
            System.out.println("My thread 2 for enjoying");
            System.out.println("I am sad!");
            i++;
        }
    }
}



public class _70_Multithreading_in_Java {
    public static void main(String[] args) {

        MyThread1 t1= new MyThread1();
        MyThread2 t2=new MyThread2();
        t1.start();;
        t2.start();


    }
}
