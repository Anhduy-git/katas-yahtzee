package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YahtzeeTest {
    @Test
    void calculateScore_withCategoryOnes() {
        int[] dices = new int[]{1, 1, 2, 4, 5};
        int score = Yahtzee.calculateScore(dices, "Ones");
        assertEquals(2, score);
    }
    @Test
    void calculateScore_withCategoryTwos() {
        int[] dices = new int[]{1, 4, 2, 2, 2};
        int score = Yahtzee.calculateScore(dices, "Twos");
        assertEquals(6, score);
    }
    @Test
    void calculateScore_withCategoryThrees() {
        int[] dices = new int[]{1, 3, 6, 5, 2};
        int score = Yahtzee.calculateScore(dices, "Threes");
        assertEquals(3, score);
    }
    @Test
    void calculateScore_withCategoryFours() {
        int[] dices = new int[]{1, 4, 2, 4, 5};
        int score = Yahtzee.calculateScore(dices, "Fours");
        assertEquals(8, score);
    }
    @Test
    void calculateScore_withCategoryFives() {
        int[] dices = new int[]{5, 4, 5, 2, 5};
        int score = Yahtzee.calculateScore(dices, "Fives");
        assertEquals(15, score);
    }
    @Test
    void calculateScore_withCategorySixes() {
        int[] dices = new int[]{3, 4, 6, 2, 6};
        int score = Yahtzee.calculateScore(dices, "Sixes");
        assertEquals(12, score);
    }
}