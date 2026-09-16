package Week_Tasks.Week5_Tasks;

import java.util.*;

public class Week5_Task10_NaivePatternSearch {
    static List<Integer> naiveSearch(String text, String pattern) {
        List<Integer> indices = new ArrayList<>();
        int n = text.length(), m = pattern.length();
        for (int i = 0; i <= n - m; i++) {
            int j = 0;
            while (j < m && text.charAt(i + j) == pattern.charAt(j)) {
                j++;
            }
            if (j == m) {
                indices.add(i);
            }
        }
        return indices;
    }

    public static void main(String[] args) {
        String text = "AABAACAADAABAABA";
        String pattern = "AABA";
        System.out.println("Input: text = " + text + ", pattern = " + pattern);
        System.out.println("Output: " + naiveSearch(text, pattern));
    }
}
