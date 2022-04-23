package com.Najmudin;

public class RotationCount {
    public static void main(String[]args){
//        int []arr={4,5,6,7,0,1,2};
        int[]arr={1,2,3,4,5};
        System.out.println(countRotation(arr));
    }
    static int countRotation(int arr[]){
      int pivot=findPivot(arr);
      return pivot+1;
    }
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            // if elements at middle, start, end are equal then just skip the duplicates
            if(arr[mid]==arr[start]&&arr[mid]==arr[end]){
                //skip the duplicates
                //what if these duplicates were our pivot elements.
                // check if start is pivot
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start=start+1; //start++;
                //check if end is pivot.
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end=end-1; //end--;
            }
            //when the  left side is sorted .we will look  for pivot in right side
            else if(arr[start]<arr[mid] ||arr[start]==arr[mid]&&arr[mid]>arr[end]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        return -1;
    }

}
