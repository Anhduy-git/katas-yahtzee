package org.example;

import java.util.Arrays;

public class Yahtzee {
    public static int calculateScore(int[] dices, String category) {
        return switch (category) {
            case "Ones" -> Arrays.stream(dices).filter((dice) -> dice == 1).sum();
            case "Twos" -> Arrays.stream(dices).filter((dice) -> dice == 2).sum();
            case "Threes" -> Arrays.stream(dices).filter((dice) -> dice == 3).sum();
            case "Fours" -> Arrays.stream(dices).filter((dice) -> dice == 4).sum();
            case "Fives" -> Arrays.stream(dices).filter((dice) -> dice == 5).sum();
            case "Sixes" -> Arrays.stream(dices).filter((dice) -> dice == 6).sum();
            default -> throw new IllegalStateException("Unexpected value: " + category);
        };
    }
}
