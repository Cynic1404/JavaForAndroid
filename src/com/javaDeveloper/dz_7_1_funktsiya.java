package com.javaDeveloper;
import java.util.Scanner;

public class dz_7_1_funktsiya {
    public static void main(String[] args) {
        System.out.println("Vvedi pervoe chiclo ");
        Scanner vvod = new Scanner(System.in);
        int a = vvod.nextInt();
        System.out.println("Vvedi vtoroe chiclo ");
        int b = vvod.nextInt();

       Character res = compare(a,b);
       System.out.println(res);
    }

    public static Character compare (int a, int b){

//        if (a<b){
//            return '<';}
//        else if (b>a){
//            return '>';}
//        else if (a==b){
//            return '=';}
//        else{return 'e';}



        char res = a>=b? (a==b ? '=': '>'):'<';
        return res;

        }


    }

