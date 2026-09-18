class Employee {
    void calculateSalary() {
        System.out.println("Employee salary");
    }
}

class Developer extends Employee {
    @Override
    void calculateSalary() {
        System.out.println("Developer salary");
    }
}

class Manager extends Employee {
    @Override
    void calculateSalary() {
        System.out.println("Manager salary");
    }
}

public class Class1 {
    public static void main(String[] args) {
        Employee e1 = new Developer();
        Employee e2 = new Manager();

        e1.calculateSalary();
        e2.calculateSalary();
    }
}
