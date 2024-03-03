package com.abhi.recursion1;

public class SayDigit {

    public static void main(String[] args) {
 sayDigitvalue(64833893);


    }

   public static void sayDigitvalue(int digit){
       String [] digitList={"zero","one","two","three","four","five","six","seven","eight","nine"};
       if(digit==0)
           return ;
       int d=digit%10;
       digit=digit/10;
       sayDigitvalue(digit);
       System.out.println(digitList[d]);


    }
}


