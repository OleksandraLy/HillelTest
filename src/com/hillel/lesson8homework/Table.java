package com.hillel.lesson8homework;

public class Table {
    private String shape1;
    private int legs1;

    public Table() {
    }

    public Table (String shape1, int legs1){
        this.shape1=shape1;
        this.legs1=legs1;
    }
    public String getShape1(){
        return shape1;
    }
    public void setShape1 (String shape1){
        this.shape1=shape1;
    }
    public int getLegs1(){
        return legs1;
    }
    public void setLegs1(int legs1){
        this.legs1=legs1;
    }
}
