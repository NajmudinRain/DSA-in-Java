package com.Najmudin;
//https://leetcode.com/problems/find-all-duplicates-in-an-array/
import java.util.*;

public class FindDuplicatesNumbers {
    public static void main(String[] args) {
        int arr[]={4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr).toString());
    }
    public static List<Integer> findDuplicates(int[] nums) {
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
        ArrayList<Integer> al= new ArrayList<>();
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
                al.add(nums[index]);
            }
        }
        return al;
    }
}
