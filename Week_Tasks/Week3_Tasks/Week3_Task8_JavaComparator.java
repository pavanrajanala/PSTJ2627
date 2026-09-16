package Week_Tasks.Week3_Tasks;

import java.util.*;

public class Week3_Task8_JavaComparator {
    static class Player {
        String name;
        int score;

        Player(String name, int score) {
            this.name = name;
            this.score = score;
        }

        @Override
        public String toString() {
            return name + " " + score;
        }
    }

    static class Checker implements Comparator<Player> {
        public int compare(Player a, Player b) {
            if (a.score != b.score) {
                return b.score - a.score;
            }
            return a.name.compareTo(b.name);
        }
    }

    public static void main(String[] args) {
        List<Player> players = new ArrayList<>(Arrays.asList(
                new Player("amy", 100),
                new Player("david", 100),
                new Player("heraldo", 50),
                new Player("aakansha", 75),
                new Player("aleksa", 150)));

        System.out.println("Input: " + players);
        players.sort(new Checker());
        System.out.println("Output: " + players);
    }
}
