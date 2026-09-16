package Week_Tasks.Week7_Tasks;

public class Week7_Task1_DesignParkingSystem {
    static class ParkingSystem {
        int[] slots;

        ParkingSystem(int big, int medium, int small) {
            slots = new int[] { 0, big, medium, small };
        }

        boolean addCar(int carType) {
            if (slots[carType] > 0) {
                slots[carType]--;
                return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        ParkingSystem ps = new ParkingSystem(1, 1, 0);
        System.out.println("Input: ParkingSystem(1, 1, 0)");
        System.out.println("addCar(1) -> " + ps.addCar(1));
        System.out.println("addCar(2) -> " + ps.addCar(2));
        System.out.println("addCar(3) -> " + ps.addCar(3));
        System.out.println("addCar(1) -> " + ps.addCar(1));
    }
}
