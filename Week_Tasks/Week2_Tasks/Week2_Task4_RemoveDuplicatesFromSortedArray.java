package Week_Tasks.Week2_Tasks;
import java.util.*;

public class Week2_Task4_RemoveDuplicatesFromSortedArray {
    static int removeDuplicates(int[] nums) {
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println("Input: nums = " + Arrays.toString(nums));
        int k = removeDuplicates(nums);
        System.out.println("Output: " + k + ", nums = " + Arrays.toString(Arrays.copyOf(nums, k)));
    }
}
