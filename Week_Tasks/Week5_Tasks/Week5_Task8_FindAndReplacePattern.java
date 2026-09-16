package Week_Tasks.Week5_Tasks;

import java.util.*;
import java.util.stream.*;

public class Week5_Task8_FindAndReplacePattern {
    static String normalize(String s) {
        Map<Character, Character> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        char next = 'a';
        for (char c : s.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, next++);
            }
            sb.append(map.get(c));
        }
        return sb.toString();
    }

    static List<String> findAndReplacePattern(String[] words, String pattern) {
        String normalizedPattern = normalize(pattern);
        return Arrays.stream(words)
                .filter(w -> normalize(w).equals(normalizedPattern))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        String[] words = {"abc", "deq", "mee", "aqq", "dkd", "ccc"};
        String pattern = "abb";
        System.out.println("Input: words = " + Arrays.toString(words) + ", pattern = " + pattern);
        System.out.println("Output: " + findAndReplacePattern(words, pattern));
    }
}
