package com.javaDeveloper;

        import java.util.Scanner;

public class nedelya {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = "";
        while (!word.equals("stop")){
            System.out.println("Enter day of a week. To stop enter 'stop'");
            word = in.next();
            switch(word) {
                case "1":
                    System.out.println("Monday");
                    break;
                case "2":
                    System.out.println("Tuesday");
                    break;
                case "3":
                    System.out.println("Wednesday");
                    break;
                case "4":
                    System.out.println("Thursday");
                    break;
                case "5":
                    System.out.println("Friday");
                    break;
                case "6":
                    System.out.println("Saturday");
                    break;
                case "7":
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.print("You should type 1-7 or 'stop'");
            }
        }
    }
}
