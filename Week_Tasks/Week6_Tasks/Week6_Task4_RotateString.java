package Week_Tasks.Week6_Tasks;

public class Week6_Task4_RotateString {
    static boolean contains(String text, String pattern) {
        int n = text.length(), m = pattern.length();
        if (m == 0) {
            return true;
        }
        int[] lps = new int[m];
        int len = 0, i = 1;
        while (i < m) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                lps[i++] = ++len;
            } else if (len != 0) {
                len = lps[len - 1];
            } else {
                lps[i++] = 0;
            }
        }

        i = 0;
        int j = 0;
        while (i < n) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
                if (j == m) {
                    return true;
                }
            } else if (j != 0) {
                j = lps[j - 1];
            } else {
                i++;
            }
        }
        return false;
    }

    static boolean rotateString(String s, String goal) {
        return s.length() == goal.length() && contains(s + s, goal);
    }

    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        System.out.println("Input: s = " + s + ", goal = " + goal);
        System.out.println("Output: " + rotateString(s, goal));
    }
}
