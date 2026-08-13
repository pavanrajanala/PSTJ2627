import java.util.*;
import java.util.stream.*;

public class Task8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        Map<Integer, List<Integer>> graph = new HashMap<>();

        IntStream.range(1, n + 1)
                .forEach(i -> graph.put(i, new ArrayList<>()));

        IntStream.range(0, m).forEach(i -> {
            int u = sc.nextInt();
            int v = sc.nextInt();

            graph.get(u).add(v);
            graph.get(v).add(u);
        });

        int source = sc.nextInt();
        int destination = sc.nextInt();

        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        queue.add(source);
        visited.add(source);

        while (!queue.isEmpty()) {
            int current = queue.poll();

            if (current == destination) {
                System.out.println("YES");
                return;
            }

            graph.get(current).stream()
                    .filter(x -> !visited.contains(x))
                    .forEach(x -> {
                        visited.add(x);
                        queue.add(x);
                    });
        }

        System.out.println("NO");

        sc.close();
    }
}