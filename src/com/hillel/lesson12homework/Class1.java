package com.hillel.lesson12homework;

import java.util.Random;

public class Class1 {
    private int a;
    private int x;
    private int b;
    private int c;
    private int d;
    private int e;
    public Class1 (int a, int x){
        this.a =a;
        this.x=x;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
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
                ", x=" + x +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                ", e=" + e +
                '}';
    }
}
