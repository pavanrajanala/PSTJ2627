import java.util.*;
import java.util.stream.*;

public class Task8 {
    public static void main(String[] args) {
        
        int n = 5; 
        int m = 4; 

        int[][] edges = {
            {1, 2},
            {2, 3},
            {3, 4},
            {4, 5}
        };

        int source = 1;
        int destination = 5;

        Map<Integer, List<Integer>> graph = new HashMap<>();
        IntStream.range(1, n + 1).forEach(i -> graph.put(i, new ArrayList<>()));

        for (int i = 0; i < m; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

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
    }
}
