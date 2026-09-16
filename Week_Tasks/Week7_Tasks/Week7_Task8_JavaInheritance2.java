package Week_Tasks.Week7_Tasks;

public class Week7_Task8_JavaInheritance2 {
    static class Arithmetic {
        int add(int a, int b) {
            return a + b;
        }
    }

    static class Adder extends Arithmetic {
        @Override
        int add(int a, int b) {
            return super.add(a, b);
        }
    }

    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println("My superclass is: " + adder.getClass().getSuperclass().getSimpleName());
        System.out.println(adder.add(10, 32) + " " + adder.add(10, 3) + " " + adder.add(10, 10));
    }
}
