package com.company.exception;

import java.util.Scanner;

public class Bolme2
{
    public static void main(String [] args)
    {
        String yanit="";
        do
        {
            Scanner klavye = new Scanner(System.in);
            try
            {
                System.out.print("Bolunecek sayi:\t");
                int a = klavye.nextInt();
                System.out.print("Bolen sayi:\t");
                int b = klavye.nextInt();

                if (b == 0)
                    throw new Exception("Kural Disi Durum: Bolen Sifir!");


                int c = a / b;
                System.out.println();
                System.out.println(a + " / " + b + " = " + c);

            }catch (Exception ozelDurum)
            {
                System.out.println();
                System.out.println(ozelDurum.getMessage());
                System.out.println("Bolen Sifir Olamaz!");
            }
            System.out.println();
            System.out.print("Bir daha denemek ister misin? (e/h) ");
            yanit = klavye.next();
            System.out.println();
        } while ((yanit.equals("e")) || (yanit.equals("E")));
    }
}