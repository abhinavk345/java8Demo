package com.abhi.stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class AverageOfNumber {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7);

        double asDouble = list.stream()
                .map(e -> e * e)
                .filter(a -> a > 10)
                .mapToInt(x -> x)
                .average()
                .getAsDouble();
        System.out.println(asDouble);
    }
}
