public class _31_Methods_in_Java {

    static int logic(int x,int y){
        int z;
        if(x>y){
            z=x+y;
            System.out.println("The "+ x + " is greater the "+ y);
        }
        else {
            z=(x+y)*5;
            System.out.println("The "+ x + " is less than the "+ y);
            System.out.println("the output is ");


        }
        return z;
    }
    public static void main(String[] args) {

        int a=21;
        int b=9;
        int c=logic(a,b);
        System.out.println(c);


    }
}


/*
public class cwh_31_methods {

    static int logic(int x, int y){
        int z;
        if(x>y){
            z = x+y;
        }
        else {
            z = (x +y) * 5;
        }
        x = 566;
        return z;
    }



    int a = 5;
    int b = 7;
    int c;
    // Method invocation using Object creation
    //cwh_31_methods obj = new cwh_31_methods();
    //c = obj.logic(a, b);
    c = logic(a, b);
            System.out.println(a + " "+ b);
    int a1 = 2;
    int b1 = 1;
    int c1;
    c1 = logic(a1, b1);
            System.out.println(c);
            System.out.println(c1);
}
    }
    */

