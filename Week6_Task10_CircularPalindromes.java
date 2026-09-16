package Week_Tasks.Week6_Tasks;

public class Week6_Task10_CircularPalindromes {
    static int longestPalindromeLength(String s) {
        StringBuilder sb = new StringBuilder("^#");
        for (char c : s.toCharArray()) {
            sb.append(c).append('#');
        }
        sb.append('$');
        String t = sb.toString();

        int n = t.length();
        int[] p = new int[n];
        int center = 0, right = 0, maxLen = 0;
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
            maxLen = Math.max(maxLen, p[i]);
        }
        return maxLen;
    }

    static int[] circularPalindromes(String s) {
        int n = s.length();
        int[] result = new int[n];
        String doubled = s + s;
        for (int k = 0; k < n; k++) {
            result[k] = longestPalindromeLength(doubled.substring(k, k + n));
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "eededdeedede";
        System.out.println("Input: " + s);
        int[] result = circularPalindromes(s);
        StringBuilder sb = new StringBuilder("Output: ");
        for (int v : result) {
            sb.append(v).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
