package Week_Tasks.Week1_Tasks;
import java.util.Arrays;
import java.util.Scanner;

public class Week1_Task5_KthSmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter K: ");
        int k = sc.nextInt();

        if (k < 1 || k > n) {
            System.out.println("Invalid K!");
            return;
        }

        
        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        System.out.println("The " + k + "th smallest element is: " + sorted[k - 1]);
    }
}