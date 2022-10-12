package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        LocalDate time = LocalDate.parse("2022-03-01");
        Instant time2 = Instant.parse("2022-03-01T01:23:44Z");

        System.out.println("date: " + time.format(fmt1));
        System.out.println("date: " + fmt2.format(time2));
    }
}
