package com.abhi.recursion1;

public class RecursionExponent {

    public static void main(String[] args) {
long st=System.nanoTime();
         long base=2;
         long power=50;

         long ans=findExponent(base,power);
        System.out.println(ans);
        System.out.println("Total times::"+(System.nanoTime()-st));



    }

    private static long findExponent(long base, long power) {
        if(power==0)
            return 1;
        if(power==1)
            return base;
        return base* findExponent(base,power-1);


    }
}