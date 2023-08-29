
class EkClass{
    int a ;

    public int getA() {
        return a;
    }

    EkClass(int a){
        this.a=a;
    }
    public int Returnone(){
        return 1;
    }
}

public class _47_this_and_super_kywrd_in_Java {
    public static void main(String[] args) {

        EkClass ek=new EkClass(87);
        System.out.println(ek.getA());

    }
}
