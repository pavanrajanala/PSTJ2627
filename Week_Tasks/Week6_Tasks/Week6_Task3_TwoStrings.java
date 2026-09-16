package Week_Tasks.Week6_Tasks;

import java.util.*;

public class Week6_Task3_TwoStrings {
    static boolean twoStrings(String s1, String s2) {
        Set<Character> chars = new HashSet<>();
        for (char c : s1.toCharArray()) {
            chars.add(c);
        }
        for (char c : s2.toCharArray()) {
            if (chars.contains(c)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        System.out.println("Input: s1 = " + s1 + ", s2 = " + s2);
        System.out.println("Output: " + (twoStrings(s1, s2) ? "YES" : "NO"));
    }
}
