package Week_Tasks.Week6_Tasks;

public class Week6_Task9_LongestPalindromicSubstring {
    static int[] manacher(String s) {
        StringBuilder sb = new StringBuilder("^#");
        for (char c : s.toCharArray()) {
            sb.append(c).append('#');
        }
        sb.append('$');
        String t = sb.toString();

        int n = t.length();
        int[] p = new int[n];
        int center = 0, right = 0;
        for (int i = 1; i < n - 1; i++) {
            if (i < right) {
                p[i] = Math.min(right - i, p[2 * center - i]);
            }
            while (t.charAt(i + p[i] + 1) == t.charAt(i - p[i] - 1)) {
                p[i]++;
            }
            if (i + p[i] > right) {
                center = i;
                right = i + p[i];
            }
        }
        return p;
    }

    static String longestPalindrome(String s) {
        int[] p = manacher(s);
        int maxLen = 0, centerIndex = 0;
        for (int i = 0; i < p.length; i++) {
            if (p[i] > maxLen) {
                maxLen = p[i];
                centerIndex = i;
            }
        }
        int start = (centerIndex - maxLen) / 2;
        return s.substring(start, start + maxLen);
    }

    public static void main(String[] args) {
        String s = "babad";
        System.out.println("Input: " + s);
        System.out.println("Output: " + longestPalindrome(s));
    }
}
