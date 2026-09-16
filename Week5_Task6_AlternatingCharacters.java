package Week_Tasks.Week5_Tasks;

public class Week5_Task6_AlternatingCharacters {
    static int alternatingCharacters(String s) {
        int deletions = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                deletions++;
            }
        }
        return deletions;
    }

    public static void main(String[] args) {
        String s = "AABAAB";
        System.out.println("Input: " + s);
        System.out.println("Output: " + alternatingCharacters(s));
    }
}
