package com.abhi.stream;

import java.util.Arrays;
import java.util.List;

public class SumOfNumber {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7);

        //int sum = list.stream().mapToInt(a -> a).sum();
        int sum = list.stream().mapToInt(Integer::valueOf).sum();
        System.out.println(sum);
    }
}
