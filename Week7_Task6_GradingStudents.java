package Week_Tasks.Week7_Tasks;

import java.util.*;
import java.util.stream.*;

public class Week7_Task6_GradingStudents {
    static int gradeOf(int grade) {
        if (grade < 38) {
            return grade;
        }
        int nextMultiple = grade + (5 - grade % 5) % 5;
        if (nextMultiple == grade) {
            return grade;
        }
        return (nextMultiple - grade) < 3 ? nextMultiple : grade;
    }

    public static void main(String[] args) {
        int[] grades = { 73, 67, 38, 33 };
        int[] result = Arrays.stream(grades).map(Week7_Task6_GradingStudents::gradeOf).toArray();
        System.out.println("Input: " + Arrays.toString(grades));
        System.out.println("Output: " + Arrays.toString(result));
    }
}
