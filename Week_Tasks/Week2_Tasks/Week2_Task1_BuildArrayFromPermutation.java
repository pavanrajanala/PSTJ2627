package Week_Tasks.Week2_Tasks;
import java.util.*;

public class Week2_Task1_BuildArrayFromPermutation {
    static int[] buildArray(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            nums[i] += (nums[nums[i]] % n) * n;
        }
        for (int i = 0; i < n; i++) {
            nums[i] /= n;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};
        System.out.println("Input: " + Arrays.toString(nums));
        int[] ans = buildArray(nums);
        System.out.println("Output: " + Arrays.toString(ans));
    }
}
