package Week_Tasks.Week4_Tasks;

import java.util.*;

public class Week4_Task4_ContainsDuplicate {
    static boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (!seen.add(num)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println("Input: " + Arrays.toString(nums));
        System.out.println("Output: " + containsDuplicate(nums));
    }
}
