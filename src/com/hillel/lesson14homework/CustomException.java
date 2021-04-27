package com.hillel.lesson14homework;

public class CustomException extends Exception{
    @Override
    public String getMessage() {
        return "Mistake is found";
    }
}
