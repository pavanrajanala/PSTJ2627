import java.util.Arrays;

public class O4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 3;

        Arrays.stream(arr)
                .sorted()
                .skip(k - 1)
                .findFirst()
                .ifPresentOrElse(
                        x -> System.out.println("Kth Smallest Element: " + x),
                        () -> System.out.println("Invalid K")
                );
    }
}
