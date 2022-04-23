package com.Najmudin;
//https://leetcode.com/problems/missing-number/
/*tips: if range is from [0,n] then index=value;
     if range is from[1,n]the index=value-1;*/

public class MissingNumber {
    public static void main(String[] args) {
        int arr[]={1,4,0,2};
        int num=findMissNum(arr);
        System.out.println(num);
    }
    static int findMissNum(int arr[]){
        int i=0;
        while( i<arr.length){
            int correctIndex=arr[i];
            if(arr[i]<arr.length&&arr[i]!=arr[correctIndex]){
                int temp=arr[i];
                arr[i]=arr[correctIndex];
                arr[correctIndex]=temp;
            }else{
                i++;
            }
        }
        for(int index=0; index<arr.length;index++){
            if(arr[index]!=index)return index;
        }
        return arr.length;

    }
    }

