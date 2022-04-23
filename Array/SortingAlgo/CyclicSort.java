package com.Najmudin;
//when continuous range (0-n or 1-n..etc)is given we use cyclic sort.
//worst time complexity is O(n)
//in each iteration we will find the correctIndex of the element and place it into its correct place if not placed.

import java.util.Arrays;

public class CyclicSort {
    public static  void main(String[]args){
        int []arr={5,4,3,2,1};
        cyclicSorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    static  void cyclicSorting(int[] arr){
       int i=0;
       while(i<arr.length){
           int correctIndex=arr[i]-1; //corrIndex=value-1;
           if(arr[i]!=arr[correctIndex]){
               int temp=arr[correctIndex];
               arr[correctIndex]=arr[i];
               arr[i]=temp;
           }else{
               i++;
           }

       }
    }

}
