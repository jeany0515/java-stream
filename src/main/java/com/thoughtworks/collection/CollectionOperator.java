package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> list = new ArrayList<>();
        if (left <= right) {
            for (int i = left; i<= right; i++) {
                list.add(new Integer(i));
            }
        } else {
            for (int i = left; i>= right; i--) {
                list.add(new Integer(i));
            }
        }
       return list;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        return this.getListByInterval(left, right).stream().filter(e -> e%2 == 0).collect(Collectors.toList());
    }

    public List<Integer> popEvenElments(int[] array) {
        return IntStream.of(array).boxed().filter(e -> e%2 == 0).collect(Collectors.toList());
    }

    public int popLastElment(int[] array) {
        return IntStream.of(array).reduce((first, second) -> second).getAsInt();
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        throw new NotImplementedException();
    }
}
