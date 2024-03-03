package com.abhi.recursion1;

import java.util.Arrays;

public class RecursionStringReverse {

    public static void main(String[] args) {

        String name="abhinav kumar";

        reversedString(name);

    }

    private static void reversedString(String name) {
         if(name.length()==0)
             return ;
         else{
             System.out.print(name.charAt(name.length()-1));
             reversedString(name.substring(0,name.length()-1));
         }


    }


}