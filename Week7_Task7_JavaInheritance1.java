package Week_Tasks.Week7_Tasks;

import java.util.*;

public class Week7_Task7_JavaInheritance1 {
    static class Person {
        protected String firstName;
        protected String lastName;
        protected int idNumber;

        Person(String firstName, String lastName, int idNumber) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.idNumber = idNumber;
        }

        public String toString() {
            return "Name: " + lastName + ", " + firstName + "\nID: " + idNumber;
        }
    }

    static class Student extends Person {
        int[] testScores;

        Student(String firstName, String lastName, int id, int[] scores) {
            super(firstName, lastName, id);
            testScores = scores;
        }

        char calculate() {
            int sum = 0;
            for (int score : testScores) {
                sum += score;
            }
            double average = (double) sum / testScores.length;
            if (average >= 90) return 'O';
            if (average >= 80) return 'E';
            if (average >= 70) return 'A';
            if (average >= 55) return 'P';
            if (average >= 40) return 'D';
            return 'T';
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = sc.next();
        String lastName = sc.next();
        int id = sc.nextInt();
        int numScores = sc.nextInt();
        int[] scores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            scores[i] = sc.nextInt();
        }

        Student student = new Student(firstName, lastName, id, scores);
        System.out.println(student.toString());
        System.out.println("Grade: " + student.calculate());
    }
}
