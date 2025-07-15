package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Yahtzee {
    public static int calculateScore(int[] dices, String category) {
        return switch (category) {
            case "Ones", "Twos", "Threes", "Fours", "Fives", "Sixes" -> calculateScoreBasicCategories(dices, category);
            case "Pair" -> calculateScorePairCategory(dices);
            case "TwoPairs" -> calculateScoreTwoPairsCategory(dices);
            default -> throw new IllegalArgumentException("Unexpected value: " + category);
        };
    }

    public static int calculateScoreBasicCategories(int[] dices, String category) {
        Map<String, Integer> map = Map.of(
                "Ones", 1,
                "Twos", 2,
                "Threes", 3,
                "Fours", 4,
                "Fives", 5,
                "Sixes", 6
        );
        return Arrays.stream(dices).filter((dice) -> dice == map.get(category)).sum();
    }

    public static int calculateScorePairCategory(int[] dices) {
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

    public static int calculateScoreTwoPairsCategory(int[] dices) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int dice : dices) {
            countMap.put(dice, countMap.getOrDefault(dice, 0) + 1);
        }
        int score = 0;
        int pairsFound  = 0;
        for (int i = 6; i >= 1; i--) {
            if (countMap.containsKey(i) && countMap.get(i) >= 2) {
                score += i * 2;
                pairsFound ++;
                if (pairsFound  == 2) {
                    return score;
                }
            }
        }
        return 0;
    }
}
