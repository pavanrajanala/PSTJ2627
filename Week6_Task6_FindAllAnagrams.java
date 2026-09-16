package Week_Tasks.Week6_Tasks;

import java.util.*;

public class Week6_Task6_FindAllAnagrams {
    static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) {
            return result;
        }

        int[] need = new int[26];
        int[] window = new int[26];
        for (char c : p.toCharArray()) {
            need[c - 'a']++;
        }

        int m = p.length();
        for (int i = 0; i < s.length(); i++) {
            window[s.charAt(i) - 'a']++;
            if (i >= m) {
                window[s.charAt(i - m) - 'a']--;
            }
            if (i >= m - 1 && Arrays.equals(window, need)) {
                result.add(i - m + 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println("Input: s = " + s + ", p = " + p);
        System.out.println("Output: " + findAnagrams(s, p));
    }
}
