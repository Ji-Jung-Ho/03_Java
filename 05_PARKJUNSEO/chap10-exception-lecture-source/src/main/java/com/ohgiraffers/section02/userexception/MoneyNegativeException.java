package com.ohgiraffers.section02.userexception;

public class MoneyNegativeException  extends NegativeException {


    public MoneyNegativeException() {
    }
    
    public MoneyNegativeException(String message) {
        super(message);
    }
}
