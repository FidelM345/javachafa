package com.company.exception;

import java.util.Scanner;

public class Bolme {
    public static void main(String [] args)
    {
        String yanit;
        do
        { System.out.print("Bolunecek sayi:\t");
            Scanner klavye = new Scanner(System.in);
            int a = klavye.nextInt();
            System.out.print("Bolen sayi:\t");
            int b = klavye.nextInt();
            int c = a / b;
            System.out.println();
            System.out.println(a + " / " + b + " = " + c);
            System.out.println();
            System.out.print("Bir daha denemek ister misin? (e/h) ");
            yanit = klavye.next();
            System.out.println();
        } while ((yanit.equals("e")) || (yanit.equals("E")));
    }
}