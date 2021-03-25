package com.hillel.lesson6homework;

import java.util.Locale;

public class Lesson6HomeTask {
    public static void main(String[] args) {
        operationsWithString();

    }
    //Проверить не пустой ли заданный текст;
    private static void operationsWithString() {
        String mainString = new String("  Hillel is my feature. I will be developer      ");
        boolean isMainStringEmpty = mainString.isEmpty();
        System.out.println("Is the text empty?\n" + isMainStringEmpty);

        //Вывести длину данного текста;
        int lengthOfMainString= mainString.length();
        System.out.println("The length of the text is: " + lengthOfMainString);

        //Вывести длину данного текста убрав лишние пробелы вначале и конце текста;
        String mainStringTrimmed = mainString.trim();
        System.out.println("Length of the trimmed string is: " + mainStringTrimmed.length());

        //Используя команду получения значения из строки по индексу вывести “I”;
        char mainStringChar = mainString.charAt(4);
        System.out.println(mainStringChar);

        //Используя команду обрезания вывести “developer”;
        System.out.println(mainString.substring(34,43));

        //Добавить в конце строки знак “!”;
        String exclamationMark= new String("!");
        System.out.println(mainString.concat(exclamationMark));

        /*Выполните сравнение заданной строки со строкой:
        “Hillel is my feature. I will be DEVELOPER” так, чтобы в одном случае они были равны, а в другом не равны;*/
        String stringToCompare = new String("Hillel is my feature. I will be DEVELOPER");
        boolean areComparedStringsEqual = mainStringTrimmed.equals(stringToCompare);
        boolean areComparedStringsEqualIgnoringCase = mainStringTrimmed.equalsIgnoreCase(stringToCompare);
        System.out.println(areComparedStringsEqual);
        System.out.println(areComparedStringsEqualIgnoringCase);

        //Выведите данную строку в нижнем регистре;
        System.out.println(mainString.toLowerCase(Locale.ROOT));
        //Выведите данную строку в верхнем регистре;
        System.out.println(mainString.toUpperCase(Locale.ROOT));
    }
}
