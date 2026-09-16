package Week_Tasks.Week4_Tasks;

public class Week4_Task1_StringHalvesAlike {
    static boolean halvesAreAlike(String s) {
        String vowels = "aeiouAEIOU";
        int half = s.length() / 2;
        int countA = 0, countB = 0;

        for (int i = 0; i < half; i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                countA++;
            }
        }
        for (int i = half; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                countB++;
            }
        }

        return countA == countB;
    }

    public static void main(String[] args) {
        String s = "book";
        System.out.println("Input: " + s);
        System.out.println("Output: " + halvesAreAlike(s));
    }
}
