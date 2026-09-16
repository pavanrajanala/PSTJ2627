package Week_Tasks.Week4_Tasks;

import java.util.*;

public class Week4_Task2_Lapindromes {
    static boolean isLapindrome(String s) {
        int half = s.length() / 2;
        char[] first = s.substring(0, half).toCharArray();
        char[] second = s.substring(s.length() - half).toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        return Arrays.equals(first, second);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < t; i++) {
            String s = sc.nextLine().trim();
            System.out.println(isLapindrome(s) ? "YES" : "NO");
        }
    }
}
