package com.Najmudin;
//https://leetcode.com/problems/set-mismatch/
//You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error,
// one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.
// You are given an integer array nums representing the data status of this set after the error.
//Find the number that occurs twice and the number that is missing and return them in the form of an array.

public class SetMisMatch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 4};
        for (int x : findErrorNums(arr)) {
            System.out.print(x+" ");
        }

    }
    public static int[] findErrorNums(int[]nums){
        int i=0;
        while(i<nums.length){
            int correctIndex=nums[i]-1;
            if(nums[i]!=nums[correctIndex]){
                int temp=nums[i];
                nums[i]=nums[correctIndex];
                nums[correctIndex]=temp;

            }else{
                i++;
            }
        }

        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
                return new int[]{nums[index],index+1};
            }
        }
        return new int[]{-1,-1};
    }
}
