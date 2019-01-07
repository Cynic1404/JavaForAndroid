package com.javaDeveloper;

public class dvumernyi_massiv_iteratsiya {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1, -2, -3, 4, 5, 6, -7},
                {1, 2, 3, 4, 5, 6, 7},
                {85, 4, 3, 2, 1}};

        for (int i =0; i<arr.length; i++){
            for (int b = 0; b<arr[i].length; b++){
                System.out.print(arr[i][b]+" ");
            }
            System.out.println(" ");
    }}}
