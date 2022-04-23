package com.Najmudin;
import java.util.*;
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array
/*tips: if range is from [0,n] then index=value;
//     if range is from[1,n]the index=value-1;*/
public class FindMissingNumbers {
    public static void main(String[] args) {
        int arr[]={4,3,2,7,8,2,3,1};
        System.out.println(findAllMissNumbers(arr).toString());

    }
    public static List<Integer> findAllMissNumbers(int[] nums) {

        int i=0;
        while(i<nums.length){
            int correctIndex=nums[i]-1;
            if(nums[i]!=nums[correctIndex]){
                int temp=nums[i];
                nums[i]=nums[correctIndex];
                nums[correctIndex]=temp;
            }
            else{
                i++;
            }
        }
        ArrayList<Integer> al= new ArrayList<Integer>();
        for( int index=0; index<nums.length;index++){
            if(nums[index]!=index+1){
                al.add(index+1);
            }
        }
        return al;

    }
}
