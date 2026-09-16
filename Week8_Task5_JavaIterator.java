package Week_Tasks.Week8_Tasks;

import java.util.*;

public class Week8_Task5_JavaIterator {
    static Iterator<String> func(List<String> elements) {
        Iterator<String> it = elements.iterator();
        while (it.hasNext()) {
            if (it.next().equals("###")) {
                break;
            }
        }
        return it;
    }

    public static void main(String[] args) {
        List<String> data = Arrays.asList("42", "10", "###", "Hello", "Java");
        System.out.println("Input: " + data);

        Iterator<String> it = func(data);
        System.out.print("Output: ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }
}
