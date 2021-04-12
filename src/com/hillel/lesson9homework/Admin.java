package com.hillel.lesson9homework;

import java.io.File;
import java.util.Scanner;

public final class Admin extends User{
    /*У класса Admin реализовать другой метод-удаления. Данный метод на вход получает
    значение “содержит/ не содержит” и в зависимости от этого значения удаляет файл(если содержит).*/
    public Admin (String name, String surname){
        super(name,surname);
    }
    public Admin(String name, String surname, String email, String password, String sex, String country) {
        super(name, surname,email, password,sex,country);
    }
    public static void main(String[] args) {
        deleteFileMethod();
    }
    public static void deleteFileMethod(){
        System.out.println("Enter Содержит/не содержит:");
        Scanner check2 = new Scanner (System.in);
        String containsOrNot= check2.nextLine();
        if (containsOrNot.equalsIgnoreCase("Содержит")){
            File checkedFile = new File (pathToFile);
            checkedFile.delete();
        } else {
            System.out.println("File does not contain the string");
        }
        check2.close();
    }

}
