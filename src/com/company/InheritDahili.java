package com.company;



class Motor{

    public void binmek(){
        System.out.println("Arbaya biniyor......");
    }


    public void inmek(){
        System.out.println("Arbadan iniyor......");
    }


}



public class InheritDahili {



    public  class Araba extends Motor{

    }



    public static void main(String[]args){

        InheritDahili inheritDahili=new InheritDahili();

        InheritDahili.Araba araba=inheritDahili.new Araba();

        System.out.println("");
        araba.binmek();
        System.out.println("");
        araba.inmek();


    }
}
