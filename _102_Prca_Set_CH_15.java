import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Date;

public class _102_Prca_Set_CH_15 {
    public static void main(String[] args) {

//        Pract set Q1

        ArrayList ar = new ArrayList();
        ar.add("Thaseen");
        ar.add("Adnan");
        ar.add("Afraz");
        ar.add("Mudassir");
        ar.add("Sami");
        ar.add("Yameen");
        ar.add("Ismail");
        ar.add("Furquan");
        ar.add("Muzakkir");
        ar.add("Shadman");
//
//        for(int i=0;i<ar.size();i++){
//            System.out.println(ar.get(i));
//        }
        for(Object o:ar){
            System.out.println(o);
    }

//            Q:5

            HashSet<Integer> hs=new HashSet();
            hs.add(5);
            hs.add(15);
            hs.add(53);
            hs.add(67);
            hs.add(0);
            hs.add(8);
            hs.add(2);
            hs.add(5);
            System.out.println(hs);

//            Ps -Q-2
            Date d=new Date();
//        System.out.println(d.getTime());
        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());

//        Q-3
        Calendar c1= Calendar.getInstance();
//        System.out.println(c1.get(Calendar.HOUR)+":"+c1.get(Calendar.MINUTE)+":"+c1.get(Calendar.SECOND));
        System.out.println(c1.get(Calendar.HOUR_OF_DAY)+":"+c1.get(Calendar.MINUTE)+":"+c1.get(Calendar.SECOND));

//        PS-Q-4

        LocalDateTime dt= LocalDateTime.now();
//        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;
        DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s");
        String myDate= dt.format(df);
        System.out.println(myDate);



    }
}
