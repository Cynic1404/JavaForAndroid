package com.javaDeveloper;

import java.io.*;
import java.util.Scanner;

public class files {
    public static void main(String[] args) {
        File file = new File("first_file.txt");

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        String context = readFile();

        try {
            PrintWriter pw = new PrintWriter(file);
            System.out.println("Enter your text in file");
            Scanner in = new Scanner(System.in);
            String input = in.nextLine();
            context += input;
            pw.println(context);
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.print(readFile());


    }
    public static String readFile(){
        BufferedReader br = null;
        String result = "";
        try {
            br = new BufferedReader(new FileReader("first_file.txt"));
            String line = null;
            while ((  line = br.readLine())!= null){
                result+=line+"\n";
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;

    }
}