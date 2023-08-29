import java.util.Calendar;
import java.util.TimeZone;

public class _98_Calender_Java {
    public static void main(String[] args) {
//        Calendar c1= Calendar.getInstance();
//        System.out.println(c1.getCalendarType());
//        System.out.println(c1.getTimeZone());

        Calendar c1= Calendar.getInstance();
//        Calendar c1= Calendar.getInstance(TimeZone.getTimeZone());
        System.out.println(c1.getCalendarType());
        System.out.println(c1.getTimeZone());
        System.out.println(c1.getTime());
        System.out.println(c1.get(Calendar.DATE));
        System.out.println(c1.get(Calendar.SECOND));
        System.out.println(c1.get(Calendar.HOUR));
        System.out.println(c1.get(Calendar.HOUR_OF_DAY));


    }
}
