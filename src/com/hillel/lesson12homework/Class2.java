package com.hillel.lesson12homework;

public class Class2 {
    private String someString;
    private int f;
    private int g;

    public void method2(){
        System.out.println("Welcome to Mars!");
    }
    public Class2 (String someString, int f, int g){
        this.someString=someString;
        this.f=f;
        this.g=g;
    }

    public String getSomeString() {
        return someString;
    }

    public void setSomeString(String someString) {
        this.someString = someString;
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
                "someString='" + someString + '\'' +
                ", f=" + f +
                ", g=" + g +
                '}';
    }
}
