import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class _99_Gorgarian_Calender_Class {
    public static void main(String[] args) {

        Calendar c2=  Calendar.getInstance();
        System.out.println(c2.getTime());

        System.out.println(c2.get(Calendar.DATE));
        System.out.println(c2.get(Calendar.SECOND));
        System.out.println(c2.get(Calendar.HOUR));
        System.out.println(c2.get(Calendar.HOUR_OF_DAY));

        System.out.println(c2.get(Calendar.HOUR_OF_DAY) + ":" + c2.get(Calendar.MINUTE) + ":" + c2.get(Calendar.SECOND));
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2018));
//        System.out.println(TimeZone.getAvailableIDs()[0]);
//        System.out.println(TimeZone.getAvailableIDs()[1]);
//        System.out.println(TimeZone.getAvailableIDs()[2]);
    }
}
