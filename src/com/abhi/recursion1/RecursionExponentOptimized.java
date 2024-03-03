package com.abhi.recursion1;

public class RecursionExponentOptimized {

    public static void main(String[] args) {
long st=System.nanoTime();
         int base=2;
         int power=50;

         int ans=findExponent(base,power);
        System.out.println(ans);
        System.out.println("Total times::"+(System.nanoTime()-st));


    }

    private static int findExponent(int base, int power) {
        if(power==0)
            return 1;
        if(power==1)
            return base;

        int answer=findExponent(base,power/2);
        if(power%2==0)
            return  answer*answer;
        else return base*answer*answer;



    }
}