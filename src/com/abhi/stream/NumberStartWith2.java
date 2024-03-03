package com.abhi.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartWith2 {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1232,2324,2453,-2454,555,634,4527,23455);

        List<Integer> collect = list.stream()
                .map(a -> String.valueOf(a))
                .filter(a -> a.startsWith("2")|| a.startsWith("-2"))
                .map(a -> Integer.valueOf(a))
                .collect(Collectors.toList());


        System.out.println(collect);
    }
}
