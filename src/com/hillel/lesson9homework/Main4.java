package com.hillel.lesson9homework;

import com.hillel.lesson9classwork.Animal;

import java.io.IOException;
import java.util.Scanner;

public class Main4 {
    /*Далее имея все необходимые классы, зная принцип “динамической диспетчеризации методов” и
    команду “instanceof” создайте метод, который будет принимать на вход User(какого-то) и
    в зависимости от типа вызывать методы:
    User = написать строку
    Support = написать строку + проверить наличие этой строки в файле
    Admin = написать строку + проверить + удалить файл, если такая строка найдена.
*/

    public static void main(String[] args) throws IOException {
User user = new User ("Evelynne","Joyce");
Admin admin = new Admin("Flora", "Owens");
Support support = new Support ("Olivia","Price");

        if (user instanceof User){
            System.out.println(user);;
        }
        if (admin instanceof Admin){
            Admin.deleteFileMethod();
        }
        if (support instanceof Support){
            Support.checkStringMethod();
        }
    }

}
