package com.javaDeveloper;

public class codacademy {
    public static void main(String[] args) {
        int carLoan = 10000;
        int loanLenght = 3;
        int interestRate = 5;
        int downPayment = 2000;
        if(loanLenght<=0){
            System.out.println("Error! You must take out a valid car loan.");
        } else if (downPayment >= carLoan){
            System.out.println("The car can be paid in full.");
        }
        else {
            int remainingBalance = carLoan - downPayment;
            int month = loanLenght *12;
            int monthlyBalance = remainingBalance /month;
            int interest = monthlyBalance/100;
            int monthlyPayment = monthlyBalance + interest;
            System.out.println(monthlyPayment);

        }





    }
}
