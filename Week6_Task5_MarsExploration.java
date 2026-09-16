package Week_Tasks.Week6_Tasks;

public class Week6_Task5_MarsExploration {
    static int marsExploration(String s) {
        String pattern = "SOS";
        int mismatches = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != pattern.charAt(i % 3)) {
                mismatches++;
            }
        }
        return mismatches;
    }

    public static void main(String[] args) {
        String s = "SOSSPSSQSSOR";
        System.out.println("Input: " + s);
        System.out.println("Output: " + marsExploration(s));
    }
}
