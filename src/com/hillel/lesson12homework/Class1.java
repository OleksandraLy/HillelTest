package com.hillel.lesson12homework;

import java.util.Random;

public class Class1 {
    private int a;
    private String string;
    private int b;
    private int c;
    private int d;
    private int e;
    public Class1 (int a, String string){
        this.a =a;
        this.string=string;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }

    public void method(){
        Random random = new Random();
        System.out.println("Your number is: " + random.nextInt(200));
    }

    @Override
    public String toString() {
        return "Class1{" +
                "a=" + a +
                ", string='" + string + '\'' +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                ", e=" + e +
                '}';
    }
}
