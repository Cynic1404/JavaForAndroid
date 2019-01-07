package com.javaDeveloper;

public class lesson_6_2 {
    public static void main(String[] args) {
//        for (int i = -7; i <=12; i+=3){
//            if(i==-1){
//                continue;}
//            if(i==5){
//                continue;}
//            if(i==11){
//                continue;}
//            System.out.println(i);
//            }

        int i = -7;
        do{
            if(i!=-1 && i!=5 && i != 11){
                System.out.println(i);}
            i+=3;
        } while (i<12);

    }}
