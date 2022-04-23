package com.Najmudin;
//https://leetcode.com/problems/find-the-duplicate-number/

public class DuplicateNumber {
    public static void main(String[] args) {
        int arr[]={1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }

    public static int findDuplicate(int[] nums) {

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
                return nums[index];
            }
        }
        return -1;
    }
}
