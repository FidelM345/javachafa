package com.company;


interface Counter{
    abstract int calculateSum();
}

class Kuslar{

    public int gostermek(int n01, int no2){


         class Tavuk implements Counter{
             int a,b;

               public Tavuk(int a, int b){
                   this.a=a;
                   this.b=b;

               }

             @Override
             public int calculateSum() {
                 return a+b;
             }
         }

         Tavuk tavuk=new Tavuk(n01, no2);

         return tavuk.calculateSum();

    }


}



public class LocalClasses {



    public static void main(String[]args){

        Kuslar kuslar=new Kuslar();

        System.out.println("The sum is: "+kuslar.gostermek(5,4));

    }

}
