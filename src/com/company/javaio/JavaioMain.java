package com.company.javaio;

import java.io.*;
import java.util.Scanner;

public class JavaioMain {


    static void dosyaOkumasi(){
        File dosyaNesnesi=null;
        do
        {
            System.out.println("Okumak istediginiz dosya adini giriniz.");
            Scanner klavye = new Scanner(System.in);
            String dosya = klavye.next();

             dosyaNesnesi = new File(dosya);

            if ( !dosyaNesnesi.exists())
                System.out.println("Bu isimde bir dosya yok.");
            else if ( !dosyaNesnesi.canRead())
                System.out.println("Bu dosya okunamiyor.");
        } while ((!dosyaNesnesi.exists()) ||
                !dosyaNesnesi.canRead());
    }





    static void readFile() throws IOException {

        dosyaOkumasi();

        BufferedReader girisAkimi = new BufferedReader(new FileReader("matok.txt"));

        String mato= girisAkimi.readLine();
        System.out.println("The file content is: "+mato);

        girisAkimi.close();
    }


    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        PrintWriter printWriter=null;

        try {
            FileOutputStream fileOutputStream=new FileOutputStream("matok.txt");
            printWriter=new PrintWriter(fileOutputStream,true);
        }
        catch (FileNotFoundException e){

            System.out.println(e.getMessage());
            System.exit(0);

        }
        System.out.println("Enter data to be saved in the file");
        String sentence= scanner.nextLine();
        printWriter.println("The user data is: "+sentence);
        printWriter.close();
        System.out.println("The file has been created");


        try {

            readFile();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

}
