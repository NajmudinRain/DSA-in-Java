package com.Najmudin;
//https://leetcode.com/problems/first-missing-positive/

public class FirstPositiveMissingNumber {
    public static void main(String[] args) {
//        int arr[]={3,4,-1,1};
        int arr[]={7,8,9,11,12};
        System.out.println(firstMissingPositive(arr));
    }

        public static int firstMissingPositive(int[] nums) {
            int i=0;
            while( i<nums.length){
                int correctIndex=nums[i]-1;
                if(nums[i]>0&&nums[i]<=nums.length&&nums[i]!=nums[correctIndex]){
                    int temp=nums[i];
                    nums[i]=nums[correctIndex];
                    nums[correctIndex]=temp;
                }else{
                    i++;
                }

            }
            //checking for the missing number
            for(int index=0; index<nums.length;index++){

                if(nums[index]!=index+1){
                    return index+1;
                }

            }
            //when the entire array has element in its correct pos
            return nums.length+1;
        }
    }

