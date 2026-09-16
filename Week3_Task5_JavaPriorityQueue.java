package Week_Tasks.Week3_Tasks;

import java.util.*;

public class Week3_Task5_JavaPriorityQueue {
    static class Student {
        private final int id;
        private final String name;
        private final double cgpa;

        Student(int id, String name, double cgpa) {
            this.id = id;
            this.name = name;
            this.cgpa = cgpa;
        }

        int getID() {
            return id;
        }

        String getName() {
            return name;
        }

        double getCGPA() {
            return cgpa;
        }
    }

    static class Priorities {
        List<Student> getStudents(List<String> events) {
            PriorityQueue<Student> queue = new PriorityQueue<>((a, b) -> {
                if (a.getCGPA() != b.getCGPA()) {
                    return Double.compare(b.getCGPA(), a.getCGPA());
                }
                if (!a.getName().equals(b.getName())) {
                    return a.getName().compareTo(b.getName());
                }
                return Integer.compare(a.getID(), b.getID());
            });

            for (String event : events) {
                if (event.startsWith("ENTER")) {
                    String[] parts = event.split(" ");
                    queue.offer(new Student(Integer.parseInt(parts[3]), parts[1], Double.parseDouble(parts[2])));
                } else {
                    queue.poll();
                }
            }

            List<Student> result = new ArrayList<>();
            while (!queue.isEmpty()) {
                result.add(queue.poll());
            }
            return result;
        }
    }

    public static void main(String[] args) {
        List<String> events = Arrays.asList(
                "ENTER John 3.75 50",
                "ENTER Mark 3.8 24",
                "ENTER Shafaet 3.7 35",
                "SERVED",
                "SERVED",
                "ENTER Samiha 3.85 36",
                "SERVED",
                "ENTER Ashley 3.9 42",
                "ENTER Maria 3.6 46",
                "ENTER Anik 3.95 49",
                "ENTER Dan 3.95 50",
                "SERVED");

        System.out.println("Input events: " + events);
        List<Student> remaining = new Priorities().getStudents(events);
        System.out.println("Output:");
        for (Student s : remaining) {
            System.out.println(s.getName());
        }
    }
}
