package Week_Tasks.Week3_Tasks;

import java.util.*;
import java.util.stream.*;

public class Week3_Task10_SortThePeople {
    static String[] sortPeople(String[] names, int[] heights) {
        Integer[] indices = new Integer[names.length];
        for (int i = 0; i < names.length; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices, (a, b) -> heights[b] - heights[a]);

        return Arrays.stream(indices)
                .map(i -> names[i])
                .toArray(String[]::new);
    }

    public static void main(String[] args) {
        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};
        System.out.println("Input: names = " + Arrays.toString(names) + ", heights = " + Arrays.toString(heights));
        System.out.println("Output: " + Arrays.toString(sortPeople(names, heights)));
    }
}
