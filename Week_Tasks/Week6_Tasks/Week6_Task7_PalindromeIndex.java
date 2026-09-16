package Week_Tasks.Week6_Tasks;

public class Week6_Task7_PalindromeIndex {
    static boolean isPalindrome(String s, int lo, int hi) {
        while (lo < hi) {
            if (s.charAt(lo) != s.charAt(hi)) {
                return false;
            }
            lo++;
            hi--;
        }
        return true;
    }

    static int palindromeIndex(String s) {
        int lo = 0, hi = s.length() - 1;
        while (lo < hi) {
            if (s.charAt(lo) != s.charAt(hi)) {
                if (isPalindrome(s, lo + 1, hi)) {
                    return lo;
                }
                if (isPalindrome(s, lo, hi - 1)) {
                    return hi;
                }
                return -1;
            }
            lo++;
            hi--;
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "aaab";
        System.out.println("Input: " + s);
        System.out.println("Output: " + palindromeIndex(s));
    }
}
