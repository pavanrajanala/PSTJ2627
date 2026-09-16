package Week_Tasks.Week8_Tasks;

import java.util.*;

public class Week8_Task9_JavaExceptionHandling {
    static class MyCalculator {
        long power(int n, int p) throws Exception {
            if (n < 0 || p < 0) {
                throw new Exception("n or p should not be negative.");
            }
            if (n == 0 && p == 0) {
                throw new Exception("n and p should not be zero.");
            }
            return (long) Math.pow(n, p);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyCalculator calculator = new MyCalculator();

        int[][] cases = { { 3, 5 }, { 2, 4 }, { 0, 0 }, { -1, -2 } };
        for (int[] c : cases) {
            try {
                System.out.println(calculator.power(c[0], c[1]));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
