package java8;

import com.mysql.cj.protocol.a.LocalDateTimeValueEncoder;

import java.time.*;
import java.util.Set;

public class DateAPIDemo
{
    public static void main(String[] args) {
        LocalDate localDat = LocalDate.now();
        System.out.println(localDat);

        LocalDate spDate = LocalDate.of(2000,01,24);
        System.out.println(spDate);

        //System.out.println(LocalDate.parse("24-01-2000"));

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        System.out.println(LocalTime.of(15,24,45));

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);


        Instant instant = Instant.now();
        System.out.println(instant);
        Set<String> zoneId = ZoneId.getAvailableZoneIds();
        zoneId.forEach(zone -> {
            System.out.println(zone+ " : " +LocalDateTime.now(ZoneId.of(zone)));
        });
    }
}
