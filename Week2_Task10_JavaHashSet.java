package Week_Tasks.Week2_Tasks;
import java.util.*;

public class Week2_Task10_JavaHashSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        Set<String> pairs = new HashSet<>();

        for (int i = 0; i < t; i++) {
            String[] parts = sc.nextLine().trim().split("\\s+");
            pairs.add(parts[0] + " " + parts[1]);
            System.out.println(pairs.size());
        }
    }
}
