package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InverseReduce {

    private Random random;

    public InverseReduce(Random random) {
        this.random = random;
    }

    public List<Integer> divideToSmaller(int number) {
        int divider = random.nextInt(3);
        List<Integer> list = new ArrayList<>();
        for (int i = number - divider; i >= 0; i = i - divider ) {
            list.add(i);
        }

        return list;
    }
}
