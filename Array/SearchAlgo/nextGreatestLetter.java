package com.Najmudin;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/submissions/
//given a char array in ascending order(d,e,f,k,l).find the smallest no greater than target.
public class nextGreatestLetter{
    public static void main(String[]args){
        char[]letters={'c','f','j'};
//        char target='j';
        char target='c';
        System.out.println(nextGreatLetter(letters,target));

    }
     static char nextGreatLetter(char[] letters, char target){
        int start=0;
         int end=letters.length-1;

         while(start<=end){
             int mid=start+(end-start)/2;
             if(target<letters[mid]){
                 end=mid-1;
             }else{
                 start=mid+1;
             }
         }
         return letters[start%letters.length];
     }

}
