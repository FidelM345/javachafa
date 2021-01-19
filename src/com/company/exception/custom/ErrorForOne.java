package com.company.exception.custom;

public class ErrorForOne extends Exception{
    public ErrorForOne(){
        super("The value 1 cannot be a Divisor");
    }
}
