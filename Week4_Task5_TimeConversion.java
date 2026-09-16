package Week_Tasks.Week4_Tasks;

public class Week4_Task5_TimeConversion {
    static String timeConversion(String s) {
        String period = s.substring(8);
        int hour = Integer.parseInt(s.substring(0, 2));
        String rest = s.substring(2, 8);

        if (period.equals("AM")) {
            if (hour == 12) {
                hour = 0;
            }
        } else {
            if (hour != 12) {
                hour += 12;
            }
        }

        return String.format("%02d", hour) + rest;
    }

    public static void main(String[] args) {
        String s = "07:05:45PM";
        System.out.println("Input: " + s);
        System.out.println("Output: " + timeConversion(s));
    }
}
