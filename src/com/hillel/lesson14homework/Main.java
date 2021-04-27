package com.hillel.lesson14homework;

public class Main {
    /*Используя методы второго класса(промежуточного), в классе Main реализуйте методы использования следующих конструкций обработки ошибок:

    а) try-catch-finally;

    б) try-catch-catch-finally;

    в) try-catch-catch-catch-finally;

    г) try(with resources)-catch-finally;

    д) try-finally (в каждой конструкции try должны быть

    вызовы 3х методов промежуточного класса с разными ошибками).*/
    public static void catchMistake()throws CustomException{
        try {
            SecondClassWithMistakes.method4();
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally exception is caught");
        }
    }
    public static void catchCatchMistake() throws CustomException{
        try {
    }
}
