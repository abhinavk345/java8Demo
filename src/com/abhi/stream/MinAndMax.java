package com.abhi.stream;

import java.util.*;
import java.util.stream.Collectors;

public class MinAndMax {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(12,12,32,12,32,5,155,55,5,6);

        OptionalInt max = list.stream()
                .mapToInt(a -> a)
                .max();
        System.out.println(max.getAsInt());
    }
}
