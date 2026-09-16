package Week_Tasks.Week5_Tasks;

import java.util.*;

public class Week5_Task3_MaxSubarrayAndSubsequence {
    static int[] maxSubarray(int[] arr) {
        int maxEndingHere = arr[0];
        int maxSubarraySum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSubarraySum = Math.max(maxSubarraySum, maxEndingHere);
        }

        int positiveSum = 0;
        int maxElement = arr[0];
        for (int v : arr) {
            if (v > 0) {
                positiveSum += v;
            }
            maxElement = Math.max(maxElement, v);
        }
        int maxSubsequenceSum = positiveSum > 0 ? positiveSum : maxElement;

        return new int[] { maxSubarraySum, maxSubsequenceSum };
    }

    public static void main(String[] args) {
        int[] arr = {2, -1, 2, 3, 4};
        System.out.println("Input: " + Arrays.toString(arr));
        System.out.println("Output: " + Arrays.toString(maxSubarray(arr)));
    }
}
