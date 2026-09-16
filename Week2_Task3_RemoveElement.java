package Week_Tasks.Week2_Tasks;
import java.util.*;

public class Week2_Task3_RemoveElement {
    static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        System.out.println("Input: nums = " + Arrays.toString(nums) + ", val = " + val);
        int k = removeElement(nums, val);
        System.out.println("Output: " + k + ", nums = " + Arrays.toString(Arrays.copyOf(nums, k)));
    }
}
