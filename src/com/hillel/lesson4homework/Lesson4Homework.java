package com.hillel.lesson4homework;

import java.util.Scanner;

public class Lesson4Homework {
    public static void main(String[] args) {

        int result = task1();
        task2();
        int result3 = task3();
        taskWithFor2();
        taskWithMaximumDigit();
        taskWithMinimumDigit();
        taskWithEvenDigits();
        enterSite();
    }
/* 1) Вывести на экран числа от 1 до 10 используя while.
Пример: 1 2 3 4 5 6 7 8 9 10
Реализовать в отдельном методе.*/
    public static int task1() {
        int a = 0;
        while (a < 10) {
            a++;
            System.out.println(a);
        }
        return a;
    }
/*2)   Вывести на экран числа от 1 до 10 используя for.
Пример: 1 2 3 4 5 6 7 8 9 10
Реализовать в отдельном методе.*/
    public static void task2() {
        int[] digitsToTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int digitsToTenLength = digitsToTen.length;
        for (int xx = 0; xx < digitsToTenLength; xx++) {
            int someDigitToTen = digitsToTen[xx];
            System.out.println(digitsToTen[xx]);
        }
        return;
    }
/*3)   Вывести на экран числа в порядке уменьшения от 100 до 0 с шагом в 10 единиц. Использовать while.
Пример: 100, 90, 80, 70, 60, 50, 40, 30, 20, 10, 0
Реализовать в отдельном методе.*/
    public static int task3() {
        int b = 0;
        while (b < 100) {
            b = b + 10;
            System.out.println(b);
        }
        return b;
    }
    /*4)   Вывести на экран числа в порядке уменьшения от 100 до 0 с шагом в 10 единиц. Использовать for.
    Пример: 100, 90, 80, 70, 60, 50, 40, 30, 20, 10, 0
    Реализовать в отдельном методе.*/
    public static void taskWithFor2(){
        int[] fromHundredToZero = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10, 0};
        int fromHundredToZeroLength = fromHundredToZero.length;
        for (int c=0; c<fromHundredToZeroLength; c++) {
            int digitFromArray = fromHundredToZero[c];
            System.out.println(fromHundredToZero[c]);
        }
    }
    /*5)   Дано 10 чисел (возможно массив). Напечатайте наибольшее из них в консоль,
    используя циклические и условные операторы.*/
    public static void taskWithMaximumDigit() {
        int[] someArray = {23, 13, 245, 75, 83, 91, 2, 64, 904, 18};
        int someArrayLength = someArray.length;
        int i = 0;
        int max = someArray[i];
        for (i = 0; i < someArrayLength; i++) {
            if (max < someArray[i])
            {
                 max= someArray[i];
            }
        }

        System.out.println("Maximum digit is:" + max);
    }
    /*6)   Дано 10 чисел (возможно массив).
    Напечатайте наименьшее из них в консоль, используя циклические и условные операторы.*/
    public static void taskWithMinimumDigit(){
        int[] anotherArray = {14,25,96,203,28,11,495,16,9,84};
        int anotherArrayLength = anotherArray.length;
        int x = 0;
        int min = anotherArray[x];
        for (x=0; x<anotherArrayLength; x++){
            if (min>anotherArray[x]) {
                min=anotherArray[x];
            }
        }
        System.out.println("Minimum digit is: " + min);
    }
    /*7)   Создайте массив из 10 чисел от 1 до 10.
       В одном из циклических операторов пройдетесь по нему и выведете следующие сообщения:
о Если четное - “{число} - это четно число”
о Если не четное - “{число} - это число не четное”
Пример:
1 - не четное число
2- четное число
3     - не четное число*/
    public static void taskWithEvenDigits() {
        int [] someOtherArray = {12,13,62,18,95,103,21,45,22,9};
        int someOtherArrayLength = someOtherArray.length;
        int y=0;
        for (y=0; y<someOtherArrayLength; y++) {
            if (someOtherArray[y]%2==0) {
                System.out.println(someOtherArray[y] + " - это четное число");
            }
            if (someOtherArray[y]%2>0) {
                System.out.println(someOtherArray[y] + " - это нечетное число");
            }
        }
    }
    /*8)   Предположим что у нас есть сайт, где ограничено посещение пользователей от 18 до 50 лет. Необходимо написать программу, которая
    будет запрашивать год Вашего рождения и выдавать следующие ответы:
    о “Вход строго с 18 лет” (Если пользователю меньше 18 лет);
    о “Добро пожаловать” (Если возраст от 18 до 50 лет);
    о “Вам будет не интересно на этом сайте(Если больше 50);*/
    public static void enterSite() {
        System.out.println("Введите год вашего рождения:");
        Scanner yearOfBirth = new Scanner (System.in);
        int yourYearOfBirth = yearOfBirth.nextInt();
        yearOfBirth.close();
        int yourAge = 2021-yourYearOfBirth;
        if (yourAge<18) {
            System.out.println("Вход сторого с 18 лет");
        }
        else if (yourAge>50) {
            System.out.println("Вам будет неинтересно на этом сайте");
        }
        else if  (yourAge<50) {
            System.out.println("Добро пожаловать");
        }
    }
            }





