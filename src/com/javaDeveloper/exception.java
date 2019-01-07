package com.javaDeveloper;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exception {
    public static void main(String[] args){
        Scanner vvod = new Scanner(System.in);
        System.out.println("Enter a number");
        try{
            int chislo = vvod.nextInt();}
        catch (InputMismatchException e){
            System.out.println("The issues caught " + e);}
        finally {System.out.println("Done");

        }

    }
}
