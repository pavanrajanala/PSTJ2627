package Week_Tasks.Week6_Tasks;

public class Week6_Task1_StringSimilarity {
    static long stringSimilarity(String s) {
        int n = s.length();
        int[] z = new int[n];
        int l = 0, r = 0;
        for (int i = 1; i < n; i++) {
            if (i < r) {
                z[i] = Math.min(r - i, z[i - l]);
            }
            while (i + z[i] < n && s.charAt(z[i]) == s.charAt(i + z[i])) {
                z[i]++;
            }
            if (i + z[i] > r) {
                l = i;
                r = i + z[i];
            }
        }

        long sum = n;
        for (int v : z) {
            sum += v;
        }
        return sum;
    }

    public static void main(String[] args) {
        String s = "ababaa";
        System.out.println("Input: " + s);
        System.out.println("Output: " + stringSimilarity(s));
    }
}
