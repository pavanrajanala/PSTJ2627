package Week_Tasks.Week3_Tasks;

import java.time.*;
import java.time.temporal.*;

public class Week3_Task2_DaysBetweenDates {
    static int daysBetweenDates(String date1, String date2) {
        LocalDate d1 = LocalDate.parse(date1);
        LocalDate d2 = LocalDate.parse(date2);
        return (int) Math.abs(ChronoUnit.DAYS.between(d1, d2));
    }

    public static void main(String[] args) {
        String date1 = "2020-01-15";
        String date2 = "2019-12-31";
        System.out.println("Input: date1 = " + date1 + ", date2 = " + date2);
        System.out.println("Output: " + daysBetweenDates(date1, date2));
    }
}
