package Week_Tasks.Week3_Tasks;

import java.time.*;

public class Week3_Task3_DayOfYear {
    static int dayOfYear(String date) {
        return LocalDate.parse(date).getDayOfYear();
    }

    public static void main(String[] args) {
        String date = "2019-02-10";
        System.out.println("Input: " + date);
        System.out.println("Output: " + dayOfYear(date));
    }
}
