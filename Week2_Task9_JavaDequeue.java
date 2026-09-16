package Week_Tasks.Week2_Tasks;
import java.util.*;

public class Week2_Task9_JavaDequeue {
    static int maxUniqueInWindow(int[] arr, int m) {
        Map<Integer, Integer> freq = new HashMap<>();
        Deque<Integer> window = new ArrayDeque<>();
        int maxUnique = 0;

        for (int value : arr) {
            window.addLast(value);
            freq.merge(value, 1, Integer::sum);

            if (window.size() > m) {
                int removed = window.pollFirst();
                if (freq.merge(removed, -1, Integer::sum) == 0) {
                    freq.remove(removed);
                }
            }

            if (window.size() == m) {
                maxUnique = Math.max(maxUnique, freq.size());
            }
        }
        return maxUnique;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] firstLine = sc.nextLine().trim().split("\\s+");
        int n = Integer.parseInt(firstLine[0]);
        int m = Integer.parseInt(firstLine[1]);
        int[] arr = Arrays.stream(sc.nextLine().trim().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println(maxUniqueInWindow(arr, m));
    }
}
