package Week_Tasks.Week9_Tasks;

import java.util.*;

public class Week9_Task2_RideSharingSimulator {
    static abstract class Vehicle {
        abstract double calculateFare(double distance);
    }

    static class Bike extends Vehicle {
        double calculateFare(double distance) {
            return distance * 5;
        }
    }

    static class Auto extends Vehicle {
        double calculateFare(double distance) {
            return distance * 12;
        }
    }

    static class Cab extends Vehicle {
        double calculateFare(double distance) {
            return distance * 12;
        }
    }

    static class InvalidBookingException extends Exception {
        InvalidBookingException(String message) {
            super(message);
        }
    }

    static Vehicle createVehicle(String type) throws InvalidBookingException {
        switch (type) {
            case "Bike":
                return new Bike();
            case "Auto":
                return new Auto();
            case "Cab":
                return new Cab();
            default:
                throw new InvalidBookingException("Invalid ride type: " + type);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());

        for (int i = 0; i < n; i++) {
            String[] parts = sc.nextLine().trim().split("\\s+");
            String type = parts[0];
            double distance = Double.parseDouble(parts[1]);
            try {
                Vehicle vehicle = createVehicle(type);
                System.out.println((int) vehicle.calculateFare(distance));
            } catch (InvalidBookingException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
