package Week_Tasks.Week6_Tasks;

public class Week6_Task2_RepeatedSubstringPattern {
    static boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        int[] lps = new int[n];
        int len = 0, i = 1;
        while (i < n) {
            if (s.charAt(i) == s.charAt(len)) {
                lps[i++] = ++len;
            } else if (len != 0) {
                len = lps[len - 1];
            } else {
                lps[i++] = 0;
            }
        }

        int patternLen = n - lps[n - 1];
        return lps[n - 1] != 0 && n % patternLen == 0;
    }

    public static void main(String[] args) {
        String s = "abcabcabcabc";
        System.out.println("Input: " + s);
        System.out.println("Output: " + repeatedSubstringPattern(s));
    }
}
