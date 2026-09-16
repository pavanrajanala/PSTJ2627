package Week_Tasks.Week5_Tasks;

import java.util.*;

public class Week5_Task7_LongestSubstringWithoutRepeating {
    static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> lastSeen = new HashMap<>();
        int maxLen = 0, start = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (lastSeen.containsKey(c) && lastSeen.get(c) >= start) {
                start = lastSeen.get(c) + 1;
            }
            lastSeen.put(c, i);
            maxLen = Math.max(maxLen, i - start + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("Input: " + s);
        System.out.println("Output: " + lengthOfLongestSubstring(s));
    }
}
