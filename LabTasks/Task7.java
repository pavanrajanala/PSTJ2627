import java.util.*;
import java.util.stream.*;

public class Task7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        IntStream.range(0, n)
                .mapToObj(i -> sc.next())
                .collect(Collectors.groupingBy(
                        x -> x,
                        LinkedHashMap::new,
                        Collectors.counting()
                ))
                .forEach((key, value) ->
                        System.out.println(key + " " + value)
                );

        sc.close();
    }
}