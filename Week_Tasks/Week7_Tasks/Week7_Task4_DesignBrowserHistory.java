package Week_Tasks.Week7_Tasks;

import java.util.*;

public class Week7_Task4_DesignBrowserHistory {
    static class BrowserHistory {
        List<String> history = new ArrayList<>();
        int current = 0;

        BrowserHistory(String homepage) {
            history.add(homepage);
        }

        void visit(String url) {
            while (history.size() > current + 1) {
                history.remove(history.size() - 1);
            }
            history.add(url);
            current++;
        }

        String back(int steps) {
            current = Math.max(0, current - steps);
            return history.get(current);
        }

        String forward(int steps) {
            current = Math.min(history.size() - 1, current + steps);
            return history.get(current);
        }
    }

    public static void main(String[] args) {
        BrowserHistory bh = new BrowserHistory("leetcode.com");
        bh.visit("google.com");
        bh.visit("facebook.com");
        bh.visit("youtube.com");
        System.out.println("back(1) -> " + bh.back(1));
        System.out.println("back(1) -> " + bh.back(1));
        System.out.println("forward(1) -> " + bh.forward(1));
        bh.visit("linkedin.com");
        System.out.println("forward(2) -> " + bh.forward(2));
        System.out.println("back(2) -> " + bh.back(2));
        System.out.println("back(7) -> " + bh.back(7));
    }
}
