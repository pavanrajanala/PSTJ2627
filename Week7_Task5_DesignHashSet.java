package Week_Tasks.Week7_Tasks;

import java.util.*;

public class Week7_Task5_DesignHashSet {
    static class MyHashSet {
        static final int BUCKETS = 1000;
        LinkedList<Integer>[] buckets;

        @SuppressWarnings("unchecked")
        MyHashSet() {
            buckets = new LinkedList[BUCKETS];
            for (int i = 0; i < BUCKETS; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        void add(int key) {
            LinkedList<Integer> bucket = buckets[key % BUCKETS];
            if (!bucket.contains(key)) {
                bucket.add(key);
            }
        }

        void remove(int key) {
            buckets[key % BUCKETS].remove((Integer) key);
        }

        boolean contains(int key) {
            return buckets[key % BUCKETS].contains(key);
        }
    }

    public static void main(String[] args) {
        MyHashSet set = new MyHashSet();
        set.add(1);
        set.add(2);
        System.out.println("contains(1) -> " + set.contains(1));
        System.out.println("contains(3) -> " + set.contains(3));
        set.add(2);
        System.out.println("contains(2) -> " + set.contains(2));
        set.remove(2);
        System.out.println("contains(2) -> " + set.contains(2));
    }
}
