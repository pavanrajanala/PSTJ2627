package Week_Tasks.Week3_Tasks;

import java.time.*;
import java.util.*;

public class Week3_Task1_JavaDateAndTime {
    static String findDay(int month, int day, int year) {
        return LocalDate.of(year, month, day).getDayOfWeek().toString();
    }

    public static void main(String[] args) {
        int month = 8, day = 5, year = 2015;
        System.out.println("Input: " + month + " " + day + " " + year);
        System.out.println("Output: " + findDay(month, day, year));
    }
}
