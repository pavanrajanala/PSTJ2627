package Week_Tasks.Week1_Tasks;
import java.util.Scanner;
interface DigitCondition {
    boolean check(int digit);
}

public class Week1_Task7_SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        System.out.print("Sum (E)ven digits or (O)dd digits? ");
        char choice = sc.next().charAt(0);

        DigitCondition isEven = digit -> digit % 2 == 0;
        DigitCondition isOdd = digit -> digit % 2 != 0;

        DigitCondition condition = (choice == 'E' || choice == 'e') ? isEven : isOdd;

        long temp = Math.abs(number);
        int sum = 0;

        if (temp == 0 && condition.check(0)) {
            sum = 0;
        }

        while (temp > 0) {
            int digit = (int) (temp % 10);
            if (condition.check(digit)) {
                sum += digit;
            }
            temp /= 10;
        }

        String kind = (condition == isEven) ? "even" : "odd";
        System.out.println("Sum of " + kind + " digits: " + sum);
    }
}