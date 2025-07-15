package org.example;

import java.util.HashMap;
import java.util.Map;

public class PairCategory implements Category {
    @Override
    public int calculateScore(int[] dices) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int dice : dices) {
            countMap.put(dice, countMap.getOrDefault(dice, 0) + 1);
        }
        for (int i = 6; i >= 1; i--) {
            if (countMap.containsKey(i) && countMap.get(i) >= 2) {
                return i * 2;
            }
        }
        return 0;
    }
}
