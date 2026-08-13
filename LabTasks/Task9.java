import java.util.*;

public class Task9 {
    static int add(int a, int b) {
        return a + b;
    }

    static double divide(double a, double b) {
        if (b == 0)
            throw new ArithmeticException();
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double result;
        String expression = sc.nextLine();

        String[] parts = expression.split(" ");

        double a = Double.parseDouble(parts[0]);
        String operator = parts[1];
        double b = Double.parseDouble(parts[2]);

        try {
            result = switch (operator) {
                case "+" -> add((int)a, (int)b);
                case "/" -> divide(a, b);
                default -> throw new IllegalArgumentException();
            };

            boolean passed = switch (operator) {
                case "+" -> result == 30;
                case "/" -> result == 5;
                default -> false;
            };

            System.out.println(passed ? "Test Passed" : "Test Failed");

        } catch (Exception e) {
            System.out.println("Test Failed");
        }

        sc.close();
    }
}