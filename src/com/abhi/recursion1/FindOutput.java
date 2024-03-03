package com.abhi.recursion1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindOutput {
    public static void main(String[] args) {
   long start=System.currentTimeMillis();
        System.out.println(fib(50));
        System.out.println("Total time:"+(System.currentTimeMillis()-start));
    }


        public static int fib(long n) {
            return ((n==0)?0:((n==1)?1:(fib(n-1)+fib(n-2))));
        }
    }


