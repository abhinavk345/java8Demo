package com.abhi.recursion1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int []myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
        System.out.println(Arrays.toString(findTopTwoScores( myArray)));

    }
    public static int[] findTopTwoScores(int[] array){
        int temp=0;
        int []newTemp=new int[2];
        for (int i=0; i<array.length-1; i++)
            for (int j=0; j<array.length-1-i; j++){
                if(array[j]<array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        newTemp[0]=array[0];
        newTemp[1]=array[1];

        return newTemp;
    }



}