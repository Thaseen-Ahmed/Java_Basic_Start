import java.io.FileWriter;
import java.io.IOException;

class MyDeprecated{
    @Deprecated
    void meth1(){
        System.out.println("I am Method 1");
    }
}

interface Myint{
    void display();
        }


public class _112_Prac_set_Adv_2 {
    public static void main(String[] args) {

//            @SuppressWarnings("deprecation")
//
//        MyDeprecated d = new MyDeprecated();
//        d.meth1();
//
//        Myint i =()->{
//            System.out.println("I am Displaying From Lambda Expression");
//        };
//        i.display();
        int i = 27;
        String table = "";
        for (int j = 0; j < 10; j++) {
            table += i + "X"+(j+1) + "=" + i*(j+1);
            table += "\n";
        }
        try {
            FileWriter fileWriter = new FileWriter("MultiplicationTable.txt");
            fileWriter.write(table);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
