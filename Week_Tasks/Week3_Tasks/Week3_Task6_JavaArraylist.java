package Week_Tasks.Week3_Tasks;

import java.util.*;

public class Week3_Task6_JavaArraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        List<List<Integer>> lines = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] parts = sc.nextLine().trim().split("\\s+");
            int d = Integer.parseInt(parts[0]);
            List<Integer> values = new ArrayList<>();
            for (int j = 1; j <= d; j++) {
                values.add(Integer.parseInt(parts[j]));
            }
            lines.add(values);
        }

        int q = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < q; i++) {
            String[] parts = sc.nextLine().trim().split("\\s+");
            int x = Integer.parseInt(parts[0]);
            int y = Integer.parseInt(parts[1]);
            List<Integer> line = lines.get(x - 1);
            if (y - 1 < 0 || y - 1 >= line.size()) {
                System.out.println("ERROR!");
            } else {
                System.out.println(line.get(y - 1));
            }
        }
    }
}
