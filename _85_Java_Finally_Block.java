

public class _85_Java_Finally_Block {
    public static int greet() {
        try {
            int a = 5;
            int b = 2;
            int c = a / b;
//        System.out.println(c);
            return c;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("This is the End of function ");
        }
        return 0;
    }
    public static void main(String[] args) {

        int k=greet();
//        System.out.println(k);

        int a=7;
        int b=9;
        while(true){
            try{
                System.out.println(a/b);
            }
            catch(Exception e){
                System.out.println(e);
                break;
            }
            finally{
                System.out.println("I am Finally for value b is " +b);
            }
            b--;
        }
        try{
            System.out.println(50/10);
        }
        finally{
            System.out.println("I am the Last finally");
        }


    }

}
