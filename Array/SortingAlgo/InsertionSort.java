package com.Najmudin;
// we are sorting the elements in parts. first sort till index no 0,then till index no 1, then till index no 2.. and so on till last
//index

import java.util.Arrays;

public class InsertionSort {
    public static  void main(String[]args){
        int []arr={2,3,66,3,-24,4,1,5};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void insertSort(int[] arr){
        //i will run till n-2;becz j will point to i+1 element.
        for( int i=0; i<arr.length-1;i++){
            for( int j=i+1;j>0;j--){  //j in every iteration of i will keep checking on its left
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else{
                    break;
                }
            }
        }
    }


}
