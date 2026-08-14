import java.util.*;

public class Task10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Map<String, String> users = new HashMap<>();
        users.put("admin", "admin123");
        users.put("user", "user123");
        users.put("testuser", "test123");

        for (int i = 0; i < n; i++) {
            String username = sc.next();
            String password = sc.next();

            boolean valid = true;


            if (username.length() < 3 || username.length() > 20) {
                valid = false;
            }

            if (password.length() < 6 || password.length() > 20) {
                valid = false;
            }


            if (valid) {
                if (users.containsKey(username) &&
                    users.get(username).equals(password)) {
                    System.out.println("SUCCESS");
                } else {
                    System.out.println("FAILURE");
                }
            } else {
                System.out.println("FAILURE");
            }
        }


    }
}