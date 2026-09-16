package Week_Tasks.Week5_Tasks;

import java.util.*;

public class Week5_Task9_StringMatchingInArray {
    static List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            for (String other : words) {
                if (!word.equals(other) && other.contains(word)) {
                    result.add(word);
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] words = {"mass", "as", "hero", "superhero"};
        System.out.println("Input: " + Arrays.toString(words));
        System.out.println("Output: " + stringMatching(words));
    }
}
