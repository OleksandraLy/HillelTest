package com.hillel.lesson12homework;

public class Class2 {
    private int y;
    private int f;
    private int g;

    public void method2(){
        System.out.println("Welcome to Mars!");
    }
    public Class2 (int y, int f, int g){
        this.y=y;
        this.f=f;
        this.g=g;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getF() {
        return f;
    }

    public void setF(int f) {
        this.f = f;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    @Override
    public String toString() {
        return "Class2{" +
                "y=" + y +
                ", f=" + f +
                ", g=" + g +
                '}';
    }
}
