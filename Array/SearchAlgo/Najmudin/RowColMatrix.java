package com.Najmudin;
//JAVA Code for Search in a row wise and
// column wise sorted matrix
//Read Explanation here
//https://www.geeksforgeeks.org/search-in-row-wise-and-column-wise-sorted-matrix/
//Approach: The simple idea is to remove a row or column in each comparison until an element is found.
// Start searching from the top-right corner of the matrix. There are three possible cases
import java.util.Arrays;


public class RowColMatrix{

    public static void main(String[]args){
        int [][] arr= {
                {2,4,8,9},
                {3,12,16,20},
                {5,13,17,21},
                {7,14,18,22},
                {11,15,19,23}
        };
        System.out.println(Arrays.toString(search(arr,23)));

    }
    static  int[] search(int matrix[][],int target){
        int row=0;
        int col=matrix[0].length-1;

        while(row< matrix.length &&col>=0){
            if(matrix[row][col]==target){
                return new int[]{row,col};
            }
            else if(matrix[row][col]<target){
                row++;
            }else {
                col--;
            }
        }
        return  new int[]{-1,-1};
    }
}







