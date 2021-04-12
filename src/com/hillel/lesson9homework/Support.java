package com.hillel.lesson9homework;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public final class Support extends User{
    /*У класса Support определить дополнительный метод-проверки строки.

    Этот метод должен на вход принимать строку и проверять наличие этой строки в файле.
     Обратно возвращать значение “содержит/не содержит”
        (подумайте какая переменная лучше всего подходит для данного типа)*/
    public Support(String name, String surname) {
        super(name, surname);
    }
    public Support(String name, String surname, String email, String password, String sex, String country) {
        super(name, surname,email, password,sex,country);
    }
    public static void main(String[] args) throws IOException {
        checkStringMethod();
    }

public static void checkStringMethod() throws IOException {
    System.out.println("Please enter check word:");
    Scanner checkString = new Scanner (System.in);
    String stringToCheck = checkString.nextLine();
    checkString.close();


    FileReader readFromTheFile = new FileReader(pathToFile);
    System.out.println("Start comparing with file");
    Scanner enterInformationHere = new Scanner(readFromTheFile);


    while (enterInformationHere.hasNextLine()) {
        String informationString = enterInformationHere.nextLine();
        if (stringToCheck.contains(informationString)) {
            System.out.println("Содержит");
        } else {
            System.out.println("Не содержит");
        }
    }

    enterInformationHere.close();
    readFromTheFile.close();


}


}
