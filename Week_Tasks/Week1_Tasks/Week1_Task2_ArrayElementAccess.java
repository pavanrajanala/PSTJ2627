package Week_Tasks.Week1_Tasks;
import java.util.Scanner;

public class Week1_Task2_ArrayElementAccess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter index to access: ");
        int index = sc.nextInt();

        if (index >= 0 && index < n) {
            System.out.println("Element at index " + index + " is: " + arr[index]);
        } else {
            System.out.println("Invalid index!");
        }
    }
}