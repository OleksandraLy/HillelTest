package com.hillel.lesson4homework;

public class Lesson4Homework {
    public static void main(String[] args) {

        int result = task1();
        task2();
        int result3 = task3();
        taskWithFor2();
        taskWithMaximumDigit();
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
            }



        /*7)   Создайте массив из 10 чисел от 1 до 10.
        В одном из циклических операторов пройдетесь по нему и выведете следующие сообщения:
о Если четное - “{число} - это четно число”
о Если не четное - “{число} - это число не четное”
Пример:
1 - не четное число
2- четное число
3     - не четное число*/
    /*public static void taskWithEvenDigits() {
        int [] someOtherArray = {12,13,62,18,95,103,21,45,22,9};
        int somOtherArrayLength = someOtherArray.length;
        while (someOtherArray[i]%2==0); {
            System.out.println(someOtherArray[i] + "- это четное число");
        }
        while
    }
    }*/

