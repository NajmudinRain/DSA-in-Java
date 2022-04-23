package com.Najmudin;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array

public class FirstAndLastPosition {
 public static void main(String[]args){
    int []arr={1,2,3,4,4,4,4,4,4,5,5,6,7};
    int target=4;
    for(int i:searchRange(arr,target)){
        System.out.print(i+" ");
    }


 }
    public static int[] searchRange(int[] nums, int target) {
          int []ans={-1,-1};//when target is not found. defaul return is -1,-1;
         ans[0]= search(nums,target,true);
         if(ans[0]!=-1) {  //when the target itself is not found.
             ans[1] = search(nums, target, false);
         }
         return ans;

    }
    static int search(int[]nums,int target,boolean findStart){
     int ans=-1;
        int start=0;
        int end=nums.length-1;

        while(start<=end)
        {
            // int mid= start+end/2;
            int mid=start+ (end-start)/2;
            if(target<nums[mid]){
                end=mid-1;
            }

            else if(target>nums[mid]){
                start=mid+1;
            }
            else{
                //possible ans
                ans=mid;
                if(findStart){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return ans;


    }



}
