package Week_Tasks.Week8_Tasks;

import java.util.*;

public class Week8_Task6_JavaInterface {
    interface AdvancedArithmetic {
        int divisorSum(int n);
    }

    static class MyCalculator implements AdvancedArithmetic {
        public int divisorSum(int n) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());

        AdvancedArithmetic myCalculator = new MyCalculator();
        System.out.println("I implemented: AdvancedArithmetic");
        System.out.println(myCalculator.divisorSum(n));
    }
}
