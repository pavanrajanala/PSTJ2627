package Week_Tasks.Week8_Tasks;

public class Week8_Task3_JavaSingleton {
    static class Singleton {
        private static Singleton instance;
        public String str;

        private Singleton() {
        }

        public static Singleton getSingleInstance() {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }
    }

    public static void main(String[] args) {
        Singleton first = Singleton.getSingleInstance();
        first.str = "Hello";

        Singleton second = Singleton.getSingleInstance();

        System.out.println("first.str -> " + first.str);
        System.out.println("second.str -> " + second.str);
        System.out.println("first == second -> " + (first == second));
    }
}
