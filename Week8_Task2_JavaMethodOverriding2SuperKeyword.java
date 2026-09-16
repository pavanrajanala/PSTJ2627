package Week_Tasks.Week8_Tasks;

public class Week8_Task2_JavaMethodOverriding2SuperKeyword {
    static class BiCycle {
        void defineMe() {
            System.out.println("I am a Bicycle and have 2 wheels and pedals.");
        }
    }

    static class MotorCycle extends BiCycle {
        @Override
        void defineMe() {
            super.defineMe();
            System.out.println("I am also a MotorCycle and have an engine.");
        }
    }

    public static void main(String[] args) {
        BiCycle bicycle = new BiCycle();
        bicycle.defineMe();

        MotorCycle motorCycle = new MotorCycle();
        motorCycle.defineMe();
    }
}
