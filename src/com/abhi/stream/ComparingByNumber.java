package com.abhi.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class ComparingByNumber {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(12,12,32,12,32,5,1,155,55,5,6);

       // Map<Integer, List<Integer>> collect = list.stream().collect(Collectors.groupingBy(Integer::intValue));
        Map<Integer, List<Integer>> collect = list.stream().collect(Collectors.groupingBy(a->Integer.valueOf(a)));

        for(Map.Entry<Integer,List<Integer>> entry:collect.entrySet()){
            System.out.println(entry.getKey()+"  "+ entry.getValue().size());

        }
//        System.out.println(collect);
    }
}
