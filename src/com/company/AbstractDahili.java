package com.company;



class Hayvan{

    abstract class Kus{
        abstract void uc();
        abstract void kon();
    }


    void avlan(){
        System.out.println("Hayvan avlaniyor.........");
    }
}






public class AbstractDahili extends Hayvan.Kus {

    @Override
    void uc() {
        System.out.println("Kush ucuyor.........");
    }

    @Override
    void kon() {
        System.out.println("Kush Kontroluyor.........");
    }

    //this piece of code is mandatory it is the enclosing instance for Hayvan class
    public AbstractDahili(Hayvan hayvan){
        hayvan.super();//without this a compile-time error will be thrown
    }

    public static void main(String[]args){

        Hayvan hayvan=new Hayvan();
        AbstractDahili abstractDahili=new AbstractDahili(hayvan);

        abstractDahili.uc();
        System.out.println("");
        abstractDahili.kon();



    }
}
