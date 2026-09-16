package Week_Tasks.Week7_Tasks;

import java.util.*;

public class Week7_Task2_JavaInstanceofKeyword {
    static class Person {
    }

    static class Student extends Person {
    }

    static class Rockstar extends Person {
    }

    static class Hacker extends Person {
    }

    static Person createPerson(String type) {
        switch (type) {
            case "Student":
                return new Student();
            case "Rockstar":
                return new Rockstar();
            case "Hacker":
                return new Hacker();
            default:
                return new Person();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            people.add(createPerson(sc.nextLine().trim()));
        }

        int students = 0, rockstars = 0, hackers = 0;
        for (Person p : people) {
            if (p instanceof Student) {
                students++;
            } else if (p instanceof Rockstar) {
                rockstars++;
            } else if (p instanceof Hacker) {
                hackers++;
            }
        }

        System.out.println(students + " " + rockstars + " " + hackers);
    }
}
