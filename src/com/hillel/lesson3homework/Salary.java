package com.hillel.lesson3homework;

import java.util.Random;

public class Salary {
    public static void main(String[] args) {
        Random result = mySalary1();
        Double result1 = mySalary2();

    }
    public static Random mySalary1(){
        Random randomSalary1 = new Random();
        randomSalary1.ints(7000, 12000)
                .findFirst()
                .getAsInt();
        return randomSalary1;
    }
    public static double mySalary2(){
    double randomSalary2 = java.lang.Math.ceil(java.lang.Math.random());
    return randomSalary2;

    }
}
