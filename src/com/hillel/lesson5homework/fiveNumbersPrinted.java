package com.hillel.lesson5homework;

import java.util.Scanner;
/*2. Ввести с клавиатуры 5 чисел. Реализовать их
    вывод на консоль одной строчкой в отдельном методе. В логике использовать циклы и массивы.*/
public class fiveNumbersPrinted {
    public static void main(String[] args) {
        Scanner fiveNumbers = new Scanner(System.in);
        int[] someNewArray = new int[5];

        for (int y = 0; y < 5; y++) {
            System.out.println("Введіть число");
            someNewArray[y] = fiveNumbers.nextInt();

        }
        fiveNumbers.close();
        printArray(someNewArray);
    }
    public static void printArray (int[] printedArray){
        System.out.println(java.util.Arrays.toString(printedArray));
    }
    }
