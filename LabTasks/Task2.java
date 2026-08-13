import java.util.*;
import java.util.stream.*;

class Task2 {
    public static void main(String[] args) {

        List<Map.Entry<String, Integer>> data = Arrays.asList(
            Map.entry("S1", 50),
            Map.entry("S2", 80),
            Map.entry("S1", 70),
            Map.entry("S3", 60),
            Map.entry("S1", 90)
        );

        Map<String, Double> result = data.stream()
            .collect(Collectors.groupingBy(
                Map.Entry::getKey,
                Collectors.averagingInt(Map.Entry::getValue)
            ));

        result.forEach((id, avg) ->
            System.out.println(id + " -> " + avg)
        );
    }
}