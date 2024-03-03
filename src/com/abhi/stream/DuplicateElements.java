package com.abhi.stream;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateElements {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(12,12,32,12,32,5,55,55,5,6);

        Set<Integer> collect = list.stream()
                .filter(a -> Collections.frequency(list, a) > 2).collect(Collectors.toSet());

        System.out.println(collect);
    }
}
