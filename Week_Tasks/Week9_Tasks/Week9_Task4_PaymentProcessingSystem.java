package Week_Tasks.Week9_Tasks;

import java.util.*;

public class Week9_Task4_PaymentProcessingSystem {
    interface Payment {
        void pay(double amount);

        double getFeePercentage();
    }

    static class CreditCardPayment implements Payment {
        public void pay(double amount) {
        }

        public double getFeePercentage() {
            return 2.0;
        }
    }

    static class UPIPayment implements Payment {
        public void pay(double amount) {
        }

        public double getFeePercentage() {
            return 1.0;
        }
    }

    static class NetBankingPayment implements Payment {
        public void pay(double amount) {
        }

        public double getFeePercentage() {
            return 1.5;
        }
    }

    static abstract class PaymentProcessor {
        abstract double processPayment(Payment payment, double amount);
    }

    static class OnlinePaymentProcessor extends PaymentProcessor {
        double processPayment(Payment payment, double amount) {
            double finalAmount = amount + (amount * payment.getFeePercentage() / 100);
            payment.pay(finalAmount);
            return finalAmount;
        }
    }

    static Payment createPayment(int type) {
        switch (type) {
            case 1:
                return new CreditCardPayment();
            case 2:
                return new UPIPayment();
            default:
                return new NetBankingPayment();
        }
    }

    static String labelFor(int type) {
        switch (type) {
            case 1:
                return "CreditCard";
            case 2:
                return "UPI";
            default:
                return "NetBanking";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        PaymentProcessor processor = new OnlinePaymentProcessor();

        for (int i = 0; i < n; i++) {
            String[] parts = sc.nextLine().trim().split("\\s+");
            int type = Integer.parseInt(parts[0]);
            double amount = Double.parseDouble(parts[1]);

            Payment payment = createPayment(type);
            double finalAmount = processor.processPayment(payment, amount);
            System.out.printf("%s %.2f%n", labelFor(type), finalAmount);
        }
    }
}
