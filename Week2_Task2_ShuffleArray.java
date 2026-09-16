package Week_Tasks.Week2_Tasks;
import java.util.*;

public class Week2_Task2_ShuffleArray {
    static int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[i + n];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        System.out.println("Input: nums = " + Arrays.toString(nums) + ", n = " + n);
        int[] ans = shuffle(nums, n);
        System.out.println("Output: " + Arrays.toString(ans));
    }
}
