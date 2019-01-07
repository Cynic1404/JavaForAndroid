package com.javaDeveloper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        String[] mass = new String[]{"a", "b", "c", "d"};
        printArr(mass);
    }




    public  static void printArr( String[] arr){
        for (int i = 0; i< arr.length; i++){
        System.out.print(arr[i]);
    }
    
}}