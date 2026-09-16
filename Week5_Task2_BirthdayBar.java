package Week_Tasks.Week5_Tasks;

import java.util.*;

public class Week5_Task2_BirthdayBar {
    static int birthdayBar(List<Integer> s, int d, int m) {
        int count = 0;
        for (int i = 0; i + m <= s.size(); i++) {
            int sum = 0;
            for (int j = i; j < i + m; j++) {
                sum += s.get(j);
            }
            if (sum == d) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> s = Arrays.asList(2, 2, 1, 3, 2);
        int d = 4, m = 2;
        System.out.println("Input: s = " + s + ", d = " + d + ", m = " + m);
        System.out.println("Output: " + birthdayBar(s, d, m));
    }
}
