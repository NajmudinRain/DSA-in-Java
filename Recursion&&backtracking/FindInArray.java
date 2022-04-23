package com.Najmudin;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FindInArray {
    public static void main(String[] args) {
        int arr[]={8,8,2,5,6,7,1,8,8,8,8,1,1};
//        System.out.println(search(arr,8,0));
//         ArrayList<Integer> al= new ArrayList<>();
//        searchAllIndex(arr,8,0,al);
//        System.out.println(al.toString());
        System.out.println(searchAllIndex(arr,8,0));

    }
    //doing linear search
    static int search(int[]arr, int target, int index){
        if(index==arr.length)return -1;

        if(arr[index]==target) {
            return index;
        }else {
           return search(arr, target, index + 1);
        }
    }
//    static ArrayList<Integer> al= new ArrayList<>();
//    static void searchAllIndex(int[]arr, int target, int index){
//        if(index==arr.length)return;
//
//        if(arr[index]==target) {
//           al.add(index);
//        }
//        searchAllIndex(arr, target, index + 1);
//
//    }

    //searching by having arraylist as arguments.
//    static ArrayList<Integer> searchAllIndex(int[]arr, int target, int index,ArrayList<Integer> al){
//        if(index==arr.length )return al;
//
//        if(arr[index]==target) {
//           al.add(index);
//        }
//        return searchAllIndex(arr, target, index + 1,al);
//
//    }
    //find without taking arraylist as arguments.
    static ArrayList<Integer> searchAllIndex(int[]arr, int target, int index){
        ArrayList<Integer> al= new ArrayList<>();
        if(index==arr.length )return al;
       //this will contain ans for that funciton call only.
        if(arr[index]==target) {
            al.add(index);
        }
        //
        ArrayList<Integer>ansfrombelowcalls=searchAllIndex(arr, target, index + 1);
         al.addAll(ansfrombelowcalls);
         return al;

    }
}
