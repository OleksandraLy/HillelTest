package com.hillel.lesson12homework;

import java.util.Scanner;

public class Class3 {
    private String oneMoreString;
    private int h;
    private int i;
    public void method3(){
        System.out.println("Введіть ваше ім'я");
        Scanner scanner= new Scanner(System.in);
        String string = scanner.toString();
        System.out.println(string);
        scanner.close();
    }
    public Class3 (String oneMoreString, int h, int i){
        this.oneMoreString=oneMoreString;
        this.h=h;
        this.i=i;
    }

    public String getOneMoreString() {
        return oneMoreString;
    }

    public void setOneMoreString(String oneMoreString) {
        this.oneMoreString = oneMoreString;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "Class3{" +
                "oneMoreString='" + oneMoreString + '\'' +
                ", h=" + h +
                ", i=" + i +
                '}';
    }
}
