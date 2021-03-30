package com.hillel.lesson5homework;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson5Hometask {
    public static void main(String[] args) {
        sameName();
    }

    /*1. реализовать ввод имени (string) с консоли, выполнить проверку имени на равенство к слову Hillel.
    если равно - "добро пожаловать на курс + имя", если нет - "дoбро пожаловать + имя"*/
    public static void sameName() {
        Scanner someWord = new Scanner(System.in);
        String name = someWord.nextLine();
        someWord.close();
        String checkWord = "Hillel";
        if (name.equals("Hillel")) {
            System.out.println("Добро пожаловать на курс" + name);
        } else {
            System.out.println("Добро пожаловать," + name);
        }
    }

    }