package Week_Tasks.Week8_Tasks;

import java.util.*;

public class Week8_Task8_JavaFactory {
    interface Food {
        void getType();
    }

    static class Pizza implements Food {
        public void getType() {
            System.out.println("The factory returned class Pizza");
            System.out.println("Someone ordered Fast Food!");
        }
    }

    static class Cake implements Food {
        public void getType() {
            System.out.println("The factory returned class Cake");
            System.out.println("Someone ordered a Dessert!");
        }
    }

    static class FoodFactory {
        static Food getFood(String type) {
            if (type.equalsIgnoreCase("pizza")) {
                return new Pizza();
            } else if (type.equalsIgnoreCase("cake")) {
                return new Cake();
            }
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine().trim();
        Food food = FoodFactory.getFood(type);
        food.getType();
    }
}
