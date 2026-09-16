package Week_Tasks.Week4_Tasks;

import java.util.*;

public class Week4_Task8_TransposeMatrix {
    static int[][] transpose(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int[][] result = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("Input: [[1,2,3],[4,5,6]]");
        System.out.println("Output: " + Arrays.deepToString(transpose(matrix)));
    }
}
