package com.Najmudin;
//Find position of an element in a sorted array of infinite numbers
//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class InfiniteArray {
    public static  void main(String[]args){
    int[]arr={2,4,5,6,7,9,11,13,15,17,19,20,21,23,25,26,28,29,30,32,34,35,37,28,39,40,42};
    int target=15;
    System.out.println(findPosition(arr,target));
    }

    static int findPosition(int[] arr, int target){
        //find the range
        int start=0;
        int end=1;
        int ans;
        while(target>arr[end]){ //runs until th target value is less than end
            int newStart=end+1;
            end=end+ 2*(end-start+1);  //evertime the search box will grow double.
            start=newStart;
        }
       return binarySearch(arr,target,start,end);

    }
    static int binarySearch(int []arr,int target,int start,int end){

        while(start<=end)
        {
//            int mid= start+end/2;
            int mid=start+ (end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }

            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                //ans
                return mid;
            }
        }
        return -1;
    }
}
