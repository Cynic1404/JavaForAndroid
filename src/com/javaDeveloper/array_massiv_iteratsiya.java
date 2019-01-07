package com.javaDeveloper;

import java.util.ArrayList;

public class array_massiv_iteratsiya {
    public static void main(String[] args) {

        ArrayList<String> pizda = new ArrayList<>(0);
            pizda.add("First" + " ");
            pizda.add("Second" + " ");
            pizda.add("Third" + " ");

            for(String i : pizda)
                System.out.print(i);
}}
