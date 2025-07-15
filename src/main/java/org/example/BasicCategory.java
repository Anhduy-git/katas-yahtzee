package org.example;

import java.util.Arrays;

public class BasicCategory implements Category {
    private final int faceValue;

    public BasicCategory(int faceValue) {
        this.faceValue = faceValue;
    }

    @Override
    public int calculateScore(int[] dices) {
        return Arrays.stream(dices).filter((dice) -> dice == this.faceValue).sum();
    }
}
