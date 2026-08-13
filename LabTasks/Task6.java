import java.util.*;
import java.util.stream.*;

public class Task6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        IntStream.range(0, n)
            .mapToObj(i -> {
                String type = sc.next();
                double distance = sc.nextDouble();
                return new String[]{type, String.valueOf(distance)};
            })
            .map(ride -> {
                String type = ride[0];
                double distance = Double.parseDouble(ride[1]);

                try {
                    if (distance <= 0)
                        throw new IllegalArgumentException();

                    double fare = switch (type) {
                        case "Bike" -> distance * 5;
                        case "Auto" -> distance * 12;
                        case "Cab" -> distance * 12;
                        default -> throw new IllegalArgumentException();
                    };

                    return String.valueOf((int) fare);
                } catch (IllegalArgumentException e) {
                    return "Invalid booking";
                }
            })
            .forEach(System.out::println);

        sc.close();
    }
}