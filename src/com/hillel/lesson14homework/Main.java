package com.hillel.lesson14homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

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
            SecondClassWithMistakes.method5();
            SecondClassWithMistakes.method6();
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally exception is caught");
        }
    }
    public static void catchCatchMistake() throws CustomException{
        try {
            SecondClassWithMistakes.method4();
            SecondClassWithMistakes.method5();
            SecondClassWithMistakes.method6();
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally exception is caught");
        }
    }
    public static void catchCatchCatchMistake()throws CustomException{
        try{
            SecondClassWithMistakes.method4();
            SecondClassWithMistakes.method5();
            SecondClassWithMistakes.method6();
    } catch (CustomException e) {
            System.out.println(e.getMessage());
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        } catch (ArrayStoreException e) {
            System.out.println("ArrayStoreException is caught: ".concat(e.toString()));
        }
        finally {
            System.out.println("finally exception is caught");
        }
        }
    public static void tryWithResources(){
        try(Scanner scanner = new Scanner(new File("C:\\Users\\Олександра\\IdeaProjects\\HillelJavaCourse\\src\\com\\hillel\\lesson13homework\\mistakes.txt"))) {
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    public static void tryFinally() throws CustomException {
        try {
            SecondClassWithMistakes.method4();
            SecondClassWithMistakes.method5();
            SecondClassWithMistakes.method6();
        }
        finally {
            System.out.println("finally exception is caught");
        }
    }
}
