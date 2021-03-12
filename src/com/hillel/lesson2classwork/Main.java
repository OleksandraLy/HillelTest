package com.hillel.lesson2classwork;

import java.util.Arrays;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        /*System.out.println("Hello lesson 2");
	boolean trueValue = true;
	boolean falseValue = false;
	boolean result = trueValue && falseValue;
	boolean result_2 = trueValue || falseValue;
        System.out.println(result);
        System.out.println(result_2);
        //TODO: revise some knowledge and implement in this method*/
        /*int a = 1;
        int b = ++a;

        int c=1;
        int d = c++;
        System.out.println(a);
        System.out.println(b);

        System.out.println(c);
        System.out.println(d);

        int x = 10;
        int y = --x;

        int x2=10;
        int y2= x2--;

        int bcd;
        bcd=123;

        System.out.println(x);
        System.out.println(y);

        System.out.println(x2);
        System.out.println(y2);*/

        byte byteVariable = 10;
        short shortVariable = 100;
        int intVariable = 1000;
        long longVariable = 100000;
        System.out.println(byteVariable + shortVariable);
        System.out.println(intVariable + longVariable);
        float floatVariable = 10.5f;
        double doubleVariable = 15.5;
        doubleVariable = floatVariable;
        floatVariable = (float) doubleVariable;

        int[] myArray = new int[10];
        int[] myArrayFilled = {12,232,456,1,54,32,98,112};
        String[] names = {"Nikolay", "Alena", "Dima", "Sasha"};

        System.out.println(Arrays.toString(names));

        System.out.println(names.length);
        String myName = names [2];
        System.out.println(myName);
        Arrays.sort(myArrayFilled);
        System.out.println(Arrays.toString(myArrayFilled));
        char c ='3';
        char b = 'c';
        int d = 10;
        System.out.println(d+c);
//        Arrays.binarySearch(myArrayFilled, key 54);

        // write your code here
    }
}
