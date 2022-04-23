package com;
//leetcode.com/problems/search-a-2d-matrix/

import java.util.Arrays;

public class SortedMatrixSearch {
    public static void main(String[] args) {
        int [][]matrix={
                {11,12,13,14},
                {15,16,17,18},
                {19,20,21,22},
                {23,24,25,26}
        };
//        for(int i=0; i<matrix.length; i++){
//            for(int j=0; j<matrix[i].length;j++){
//                System.out.print(Arrays.toString(search(matrix,matrix[i][j]))+" ");
//            }
//            System.out.println();
//        }
        System.out.print(Arrays.toString(search(matrix,13)));
    }

    //we are trying to reduce our search space(rows) such that at the end only two rows will be left remain to search.
    //for that taking middle col and doing binary search on that.main aim is to reduce matrix to two rows

    static int[] search(int[][] matrix, int target) {


        int rows = matrix.length;
        int cols = matrix[0].length;
        //when matrix is empty
        if (cols == 0) {
             return new int[]{-1, -1};

        }
//        when matrix has only one array. direct to binary search
        if (rows == 1) {
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;
//
        while (rStart < (rEnd - 1)) {
            int rMid = rStart + (rEnd - rStart) / 2;

            if (matrix[rMid][cMid] == target) {
                 return new int[]{rMid, cMid};

            } else if (matrix[rMid][cMid] < target) {
                rStart = rMid;
            } else {
                rEnd = rMid;
            }

        }
        //doing binary search on remaing two rows.
        if (target <= matrix[rStart][cols - 1]) {
            return binarySearch(matrix, rStart, 0, cols - 1, target);
        } else {
            return binarySearch(matrix, rStart + 1, 0, cols - 1, target);
        }
    }
    //    //binary search code for remaining two rows.
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int cMid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][cMid] == target) {
                 return new int[]{row, cMid};

            } else if (matrix[row][cMid] < target) {
                cStart = cMid + 1;
            } else {
                cEnd = cMid - 1;
            }

        }
         return new int[]{-1, -1};



    }


}





