import java.time.Clock;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;
public class dateDemo {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);

        LocalDate ld = LocalDate.now(ZoneId.of("Asia/Kolkata"));
        LocalDate ld1 = LocalDate.of(2067, 11, 15);
        System.out.println(ld1);
    }
}
