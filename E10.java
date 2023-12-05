package Project1;

import java.util.HashMap;
import java.util.Map;

public class E10 {
    public static void main(String[] args) {
        String[] strings = {"BMW", "PRUIS", "ACCORD", "COROLLA", "PRUIS", "BMW", "SIENNA"};

        Map<String, Integer> countMap = new HashMap<>();

        // Count occurrences of each string in the array
        for (String str : strings) {
            if (countMap.containsKey(str)) {
                countMap.put(str, countMap.get(str) + 1);
            } else {
                countMap.put(str, 1);
            }
        }

        // Print duplicates
        System.out.println("Duplicate elements in the array are:");
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
