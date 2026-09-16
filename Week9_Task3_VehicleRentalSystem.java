package Week_Tasks.Week9_Tasks;

import java.util.*;

public class Week9_Task3_VehicleRentalSystem {
    static abstract class Vehicle {
        String vehicleNumber;
        double rentPerDay;

        Vehicle(String vehicleNumber, double rentPerDay) {
            this.vehicleNumber = vehicleNumber;
            this.rentPerDay = rentPerDay;
        }

        abstract double calculateRent(int days);
    }

    static class Car extends Vehicle {
        Car(String vehicleNumber, double rentPerDay) {
            super(vehicleNumber, rentPerDay);
        }

        double calculateRent(int days) {
            return rentPerDay * days;
        }
    }

    static class Bike extends Vehicle {
        Bike(String vehicleNumber, double rentPerDay) {
            super(vehicleNumber, rentPerDay);
        }

        double calculateRent(int days) {
            return rentPerDay * days * 0.90;
        }
    }

    static class Truck extends Vehicle {
        Truck(String vehicleNumber, double rentPerDay) {
            super(vehicleNumber, rentPerDay);
        }

        double calculateRent(int days) {
            return rentPerDay * days * 1.20;
        }
    }

    static Vehicle createVehicle(int type, String vehicleNumber, double rentPerDay) {
        switch (type) {
            case 1:
                return new Car(vehicleNumber, rentPerDay);
            case 2:
                return new Bike(vehicleNumber, rentPerDay);
            default:
                return new Truck(vehicleNumber, rentPerDay);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());

        for (int i = 0; i < n; i++) {
            String[] parts = sc.nextLine().trim().split("\\s+");
            int type = Integer.parseInt(parts[0]);
            String vehicleNumber = parts[1];
            double rentPerDay = Double.parseDouble(parts[2]);
            int days = Integer.parseInt(parts[3]);

            Vehicle vehicle = createVehicle(type, vehicleNumber, rentPerDay);
            System.out.printf("%s %.2f%n", vehicleNumber, vehicle.calculateRent(days));
        }
    }
}
