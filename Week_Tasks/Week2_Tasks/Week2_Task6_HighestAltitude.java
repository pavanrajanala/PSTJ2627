package Week_Tasks.Week2_Tasks;
import java.util.*;

public class Week2_Task6_HighestAltitude {
    static int largestAltitude(int[] gain) {
        int altitude = 0;
        int maxAltitude = 0;
        for (int g : gain) {
            altitude += g;
            maxAltitude = Math.max(maxAltitude, altitude);
        }
        return maxAltitude;
    }

    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7};
        System.out.println("Input: " + Arrays.toString(gain));
        System.out.println("Output: " + largestAltitude(gain));
    }
}
