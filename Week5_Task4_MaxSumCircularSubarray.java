package Week_Tasks.Week5_Tasks;

import java.util.*;

public class Week5_Task4_MaxSumCircularSubarray {
    static int maxSubarraySumCircular(int[] nums) {
        int total = 0, curMax = 0, maxSum = nums[0], curMin = 0, minSum = nums[0];
        for (int num : nums) {
            curMax = Math.max(curMax + num, num);
            maxSum = Math.max(maxSum, curMax);
            curMin = Math.min(curMin + num, num);
            minSum = Math.min(minSum, curMin);
            total += num;
        }
        if (maxSum < 0) {
            return maxSum;
        }
        return Math.max(maxSum, total - minSum);
    }

    public static void main(String[] args) {
        int[] nums = {5, -3, 5};
        System.out.println("Input: " + Arrays.toString(nums));
        System.out.println("Output: " + maxSubarraySumCircular(nums));
    }
}
