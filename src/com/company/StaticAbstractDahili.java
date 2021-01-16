package com.company;


class Hayvan1{

    static abstract class Kopek{
        abstract void kos();
        abstract void bak();

    }

}





public class StaticAbstractDahili extends Hayvan1.Kopek{



    @Override
    void kos() {
        System.out.println("Kopek kosuyor.....");
    }

    @Override
    void bak() {
        System.out.println("Kopek bakiyor.....");
    }


    public static void main(String[]args){

        StaticAbstractDahili staticAbstractDahili=new StaticAbstractDahili();
        System.out.println("");
        staticAbstractDahili.kos();
        System.out.println("");
        staticAbstractDahili.bak();

    }
}
