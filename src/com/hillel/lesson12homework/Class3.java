package com.hillel.lesson12homework;

import java.util.Scanner;

public class Class3 {
    private int z;
    private int h;
    private int i;
    public void method3(){
        System.out.println("Введіть ваше ім'я");
        Scanner scanner= new Scanner(System.in);
        String string = scanner.toString();
        System.out.println(string);
        scanner.close();
    }
    public Class3 (int z, int h, int i){
        this.z=z;
        this.h=h;
        this.i=i;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
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
                "z=" + z +
                ", h=" + h +
                ", i=" + i +
                '}';
    }
}
