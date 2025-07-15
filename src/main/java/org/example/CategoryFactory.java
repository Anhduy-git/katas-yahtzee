package org.example;

import java.util.Map;

public class CategoryFactory {

    // Map for basic categories from 1 to 6
    private static final Map<String, Integer> basicCategoryMap = Map.of(
            "Ones", 1,
            "Twos", 2,
            "Threes", 3,
            "Fours", 4,
            "Fives", 5,
            "Sixes", 6
    );
    public static Category getCategory(String category) {
        return switch (category) {
            case "Ones", "Twos", "Threes", "Fours", "Fives", "Sixes" -> new BasicCategory(basicCategoryMap.get(category));
            case "Pair" -> new PairCategory();
            case "TwoPairs" -> new TwoPairsCategory();
            default -> throw new IllegalArgumentException("Unexpected value: " + category);
        };
    }
}
