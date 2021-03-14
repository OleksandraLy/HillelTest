package com.hillel.lesson3homework;

import java.util.Scanner;

public class Poll {
    public static void main(String[] args) {

        System.out.println("Введіть Ваше ім'я :");
        Scanner answer = new Scanner(System.in);
        String name = answer.nextLine();

        System.out.println("Введіть Ваше прізвище :");
        Scanner answer1 = new Scanner(System.in);
        String surname = answer1.nextLine();

        System.out.println("Вкажіть, скільки Вам повних років :");
        Scanner answer2 = new Scanner(System.in);
        String age = answer2.nextLine();

        System.out.println("Введіть Вашу пошту для реєстрації :");
        Scanner answer3 = new Scanner(System.in);
        String email = answer3.nextLine();

        System.out.println("Напишіть кілька слів про себе :");
        Scanner answer4 = new Scanner(System.in);
        String aboutYourself = answer4.nextLine();


        answer.close();
        answer1.close();
        answer2.close();
        answer3.close();
        answer4.close();


    }
}
