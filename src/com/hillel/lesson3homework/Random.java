package com.hillel.lesson3homework;

public class Random {
    public static void main(String[] args) {
        double random1 = java.lang.Math.random();
        double random2 = java.lang.Math.random();
        double random3 = java.lang.Math.random();
        System.out.println(random1);
        System.out.println(random2);
        System.out.println(random3);

        int random = new java.util.Random(10L).nextInt(12);
        System.out.println(random);
        int random4 = new java.util.Random(10L).nextInt(56);
        System.out.println(random4);
        int random5 = new java.util.Random(10L).nextInt(97);
        System.out.println(random5);

        double summary = random + random1 + random2 + random3 + random4 + random5;
        System.out.println(summary);
    }

    }
