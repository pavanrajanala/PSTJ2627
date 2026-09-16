package Week_Tasks.Week4_Tasks;

import java.util.*;

public class Week4_Task3_CompareTriplets {
    static int[] compareTriplets(int[] a, int[] b) {
        int alice = 0, bob = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > b[i]) {
                alice++;
            } else if (a[i] < b[i]) {
                bob++;
            }
        }
        return new int[] { alice, bob };
    }

    public static void main(String[] args) {
        int[] a = {5, 6, 7};
        int[] b = {3, 6, 10};
        System.out.println("Input: a = " + Arrays.toString(a) + ", b = " + Arrays.toString(b));
        System.out.println("Output: " + Arrays.toString(compareTriplets(a, b)));
    }
}
