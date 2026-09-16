package Week_Tasks.Week4_Tasks;

public class Week4_Task7_DiagonalDifference {
    static int diagonalDifference(int[][] arr) {
        int n = arr.length;
        int primary = 0, secondary = 0;
        for (int i = 0; i < n; i++) {
            primary += arr[i][i];
            secondary += arr[i][n - 1 - i];
        }
        return Math.abs(primary - secondary);
    }

    public static void main(String[] args) {
        int[][] arr = {{11, 2, 4}, {4, 5, 6}, {10, 8, -12}};
        System.out.println("Input: [[11,2,4],[4,5,6],[10,8,-12]]");
        System.out.println("Output: " + diagonalDifference(arr));
    }
}
