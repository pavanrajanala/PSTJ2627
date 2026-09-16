package Week_Tasks.Week3_Tasks;

import java.time.*;

public class Week3_Task4_DayOfTheWeek {
    static String dayOfTheWeek(int day, int month, int year) {
        String name = LocalDate.of(year, month, day).getDayOfWeek().toString();
        return name.charAt(0) + name.substring(1).toLowerCase();
    }

    public static void main(String[] args) {
        int day = 31, month = 8, year = 2019;
        System.out.println("Input: day = " + day + ", month = " + month + ", year = " + year);
        System.out.println("Output: " + dayOfTheWeek(day, month, year));
    }
}
