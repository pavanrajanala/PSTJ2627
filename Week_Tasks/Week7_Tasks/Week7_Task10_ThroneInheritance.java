package Week_Tasks.Week7_Tasks;

import java.util.*;

public class Week7_Task10_ThroneInheritance {
    static class ThroneInheritance {
        String king;
        Map<String, List<String>> children = new HashMap<>();
        Set<String> dead = new HashSet<>();

        ThroneInheritance(String kingName) {
            king = kingName;
            children.put(kingName, new ArrayList<>());
        }

        void birth(String parentName, String childName) {
            children.get(parentName).add(childName);
            children.put(childName, new ArrayList<>());
        }

        void death(String name) {
            dead.add(name);
        }

        List<String> getInheritanceOrder() {
            List<String> order = new ArrayList<>();
            dfs(king, order);
            return order;
        }

        void dfs(String name, List<String> order) {
            if (!dead.contains(name)) {
                order.add(name);
            }
            for (String child : children.get(name)) {
                dfs(child, order);
            }
        }
    }

    public static void main(String[] args) {
        ThroneInheritance t = new ThroneInheritance("king");
        t.birth("king", "andy");
        t.birth("king", "bob");
        t.birth("king", "catherine");
        t.birth("andy", "matthew");
        t.birth("bob", "alex");
        t.birth("bob", "asha");

        System.out.println("getInheritanceOrder() -> " + t.getInheritanceOrder());
        t.death("bob");
        System.out.println("after death(\"bob\") -> " + t.getInheritanceOrder());
    }
}
