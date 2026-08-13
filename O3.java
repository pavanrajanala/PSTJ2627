import java.util.Arrays;
public class O3 {
    public static void main(String[] args) {
        int[] arr = {10, 25, 8, 45, 32, 67, 15};

        Arrays.stream(arr)
                .max()
                .ifPresent(max -> System.out.println("Maximum element: " + max));
    }
}
