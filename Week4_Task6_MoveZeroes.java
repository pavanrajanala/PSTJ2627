package Week_Tasks.Week4_Tasks;

import java.util.*;

public class Week4_Task6_MoveZeroes {
    static void moveZeroes(int[] nums) {
        int insertPos = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos++] = num;
            }
        }
        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        System.out.println("Input: " + Arrays.toString(nums));
        moveZeroes(nums);
        System.out.println("Output: " + Arrays.toString(nums));
    }
}
