package com.hillel.lesson3homework;

import java.util.Random;
import java.util.Scanner;

public class Giveaway {
    public static void main(String[] args) {
        int result = randomGiveaway();
    }
    public static int randomGiveaway() {
        System.out.println("Введіть кількість учасників :");
        Scanner enteredNumberOfParticipants = new Scanner(System.in);
        String surname = enteredNumberOfParticipants.nextLine();

        Random numberOfParticipants = new Random(4L);
        int winnerNumber = numberOfParticipants.nextInt(10);
        System.out.println("Переможець під номером :" + winnerNumber);
        return winnerNumber;
    }
}
