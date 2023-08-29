import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _100_101_Java_Time_API {
    public static void main(String[] args) {

//         LocalTime
//        LocalDate
//        LocalTimeDate
//        DateTimeFormatter
        LocalDate d = LocalDate.now();
        System.out.println(d);
        LocalTime tm= LocalTime.now();
        System.out.println(tm);

        LocalDateTime dt= LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yy--m E a");
//        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yy--E a");
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;
//        System.out.println(df2);
        String myDate= dt.format(df);
        String myDate2= dt.format(df2);
        System.out.println(myDate);
        System.out.println(myDate2);
    }
}
