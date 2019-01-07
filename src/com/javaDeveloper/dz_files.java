package com.javaDeveloper;

import java.io.*;

public class dz_files {
    public static void main(String[] args) {
        File file1 = new File("some.txt");
        File file2 = new File("opa.txt");
        readFile(file2);}

    public static void readFile(File o){
        BufferedReader br = null;
        String result = "";
        try {
            br = new BufferedReader(new FileReader(o));
            String line = null;
            while ((  line = br.readLine())!= null){
                result+=line+"\n";
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(result);

        }
}

//    Создайте файл в папке вашего проекта, к примеру "some.txt". При помощи Java прочитайте содержимое этого файла и выведите все содержимое в консоль.