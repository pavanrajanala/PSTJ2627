package Week_Tasks.Week1_Tasks;
import java.util.Scanner;


interface Fibonacci {
    long calculate(int n);
}

public class Week1_Task8_FibonacciNumber {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();


        Fibonacci fib = num -> {
            long a = 0, b = 1;
            for (int i = 0; i < num; i++) {
                long next = a + b;
                a = b;
                b = next;
            }
            return a;
        };

        System.out.println(n + "th Fibonacci number is: " + fib.calculate(n));
    }
}
