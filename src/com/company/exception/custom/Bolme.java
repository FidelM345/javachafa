package com.company.exception.custom;

import java.util.Scanner;

public class Bolme {

    public static void main(String[]args) {
        Scanner klavye = new Scanner(System.in);
        ErrorForOne errorForOne=new ErrorForOne();
        String yanit;

        do {

            try {
                System.out.println("Enter the dividend");
                int num1 = klavye.nextInt();

                System.out.println("Enter the divisor");
                int num2 = klavye.nextInt();


                if (num2 == 0) {
                    throw new CustomExeption();
                }
                else if (num2==1){

                    throw errorForOne;
                }

                else {

                    System.out.println("The answer of "+num1+" divide by "+num2+"="+(num1/num2));
                }


            }catch (Exception e){

                System.out.println(e.getMessage());

            }

            System.out.println("Bir daha denemek ister misin? (e/h) ");
            yanit = klavye.next();
        }while (yanit.equals("e")||yanit.equals("E"));

    }

}
