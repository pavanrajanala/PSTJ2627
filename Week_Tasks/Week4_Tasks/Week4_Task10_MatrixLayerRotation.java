package Week_Tasks.Week4_Tasks;

import java.util.*;

public class Week4_Task10_MatrixLayerRotation {
    static int[][] matrixRotation(int[][] matrix, int r) {
        int m = matrix.length, n = matrix[0].length;
        int layers = Math.min(m, n) / 2;
        int[][] result = new int[m][n];

        for (int d = 0; d < layers; d++) {
            List<int[]> coords = new ArrayList<>();
            for (int j = d; j <= n - 1 - d; j++) coords.add(new int[] { d, j });
            for (int i = d + 1; i <= m - 1 - d; i++) coords.add(new int[] { i, n - 1 - d });
            for (int j = n - 2 - d; j >= d; j--) coords.add(new int[] { m - 1 - d, j });
            for (int i = m - 2 - d; i >= d + 1; i--) coords.add(new int[] { i, d });

            int len = coords.size();
            int effR = r % len;
            int[] values = new int[len];
            for (int idx = 0; idx < len; idx++) {
                int[] c = coords.get(idx);
                values[idx] = matrix[c[0]][c[1]];
            }
            for (int idx = 0; idx < len; idx++) {
                int[] c = coords.get(idx);
                result[c[0]][c[1]] = values[(idx + effR) % len];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        int r = 2;
        System.out.println("Input: 4x4 matrix, r = " + r);
        int[][] result = matrixRotation(matrix, r);
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}
