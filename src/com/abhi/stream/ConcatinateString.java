package com.abhi.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatinateString {
    public static void main(String[] args) {

        List<String> list= Arrays.asList("abhinav","kumar","delhi","gurgaon");

        String collect = list.stream()
                .collect(Collectors.joining("::"));
        System.out.println(collect);
    }
}
