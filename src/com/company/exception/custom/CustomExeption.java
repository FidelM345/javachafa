package com.company.exception.custom;

public class CustomExeption extends Exception{

    public  CustomExeption(){
        super("An incorrect number has been entered");
    }

    public  CustomExeption(String ileti){
        super(ileti);
    }

}
