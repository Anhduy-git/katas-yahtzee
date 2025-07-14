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
}