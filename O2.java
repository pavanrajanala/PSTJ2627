import java.util.stream.IntStream;

public class O2 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int key = 40;

        IntStream.range(0, arr.length)
                .filter(i -> arr[i] == key)
                .findFirst()
                .ifPresentOrElse(
                        i -> System.out.println("Element found at position: " + (i + 1)),
                        () -> System.out.println("Element not found")
                );



    }
}
