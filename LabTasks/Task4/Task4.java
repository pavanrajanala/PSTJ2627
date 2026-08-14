import java.util.*;
import java.util.stream.*;

public class Task4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine().trim();
        String pattern = sc.nextLine().trim();

        int[] lps = new int[pattern.length()];

        IntStream.range(1, pattern.length()).forEach(i -> {
            int j = lps[i - 1];

            while (j > 0 && pattern.charAt(i) != pattern.charAt(j)) {
                j = lps[j - 1];
            }

            if (pattern.charAt(i) == pattern.charAt(j)) {
                j++;
            }

            lps[i] = j;
        });

        List<Integer> result = new ArrayList<>();

        int[] j = {0};

        IntStream.range(0, text.length()).forEach(i -> {
            while (j[0] > 0 &&
                   text.charAt(i) != pattern.charAt(j[0])) {
                j[0] = lps[j[0] - 1];
            }

            if (text.charAt(i) == pattern.charAt(j[0])) {
                j[0]++;
            }

            if (j[0] == pattern.length()) {
                result.add(i - pattern.length() + 1);
                j[0] = lps[j[0] - 1];
            }
        });

        result.stream()
              .forEach(i -> System.out.print(i + " "));

        sc.close();
    }
}