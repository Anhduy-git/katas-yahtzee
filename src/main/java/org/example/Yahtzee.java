package org.example;

public class Yahtzee {
    public static int calculateScore(int[] dices, String category) {
        Category categoryObject = CategoryFactory.getCategory(category);
        return categoryObject.calculateScore(dices);
    }
}
