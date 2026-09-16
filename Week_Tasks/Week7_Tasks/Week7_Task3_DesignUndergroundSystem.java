package Week_Tasks.Week7_Tasks;

import java.util.*;

public class Week7_Task3_DesignUndergroundSystem {
    static class UndergroundSystem {
        Map<Integer, Object[]> checkIns = new HashMap<>();
        Map<String, double[]> stats = new HashMap<>();

        void checkIn(int id, String stationName, int t) {
            checkIns.put(id, new Object[] { stationName, t });
        }

        void checkOut(int id, String stationName, int t) {
            Object[] entry = checkIns.remove(id);
            String startStation = (String) entry[0];
            int startTime = (int) entry[1];
            String key = startStation + "->" + stationName;
            double[] stat = stats.getOrDefault(key, new double[] { 0, 0 });
            stat[0] += (t - startTime);
            stat[1] += 1;
            stats.put(key, stat);
        }

        double getAverageTime(String startStation, String endStation) {
            double[] stat = stats.get(startStation + "->" + endStation);
            return stat[0] / stat[1];
        }
    }

    public static void main(String[] args) {
        UndergroundSystem us = new UndergroundSystem();
        us.checkIn(45, "Leyton", 3);
        us.checkOut(45, "Waterloo", 15);
        us.checkIn(32, "Paradise", 8);
        us.checkOut(32, "Cambridge", 22);
        us.checkIn(27, "Leyton", 10);
        us.checkOut(27, "Waterloo", 20);

        System.out.println("getAverageTime(\"Leyton\", \"Waterloo\") -> " + us.getAverageTime("Leyton", "Waterloo"));
        System.out.println("getAverageTime(\"Paradise\", \"Cambridge\") -> " + us.getAverageTime("Paradise", "Cambridge"));

        us.checkIn(10, "Leyton", 24);
        us.checkOut(10, "Waterloo", 38);
        System.out.println("getAverageTime(\"Leyton\", \"Waterloo\") -> " + us.getAverageTime("Leyton", "Waterloo"));
    }
}
