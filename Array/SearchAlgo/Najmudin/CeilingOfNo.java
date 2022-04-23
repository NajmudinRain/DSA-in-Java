package com.Najmudin;

public class CeilingOfNo {
    public static void main(String[]args){
     int[]arr= {2,4,6,7,8,9,11,22,33,44,55,88,102,105,108};
     int target=89;
     //ceiling of number is the smallest no greater or equal to target no.
     System.out.println(ceilOfNo(arr,target)); //printing the index.

     }

    static int ceilOfNo(int arr[],int target) {

        if(target>arr[arr.length-1])return -1; //when the target itself is the greater than the greatest no of array.
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if ( target>arr[mid]) {
                start = mid + 1;
            } else if (target<arr[mid]) {
                end = mid - 1;
            } else {
                return arr[mid];
            }
        }
        return start;
    }
}
