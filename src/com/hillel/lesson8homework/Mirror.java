package com.hillel.lesson8homework;

public class Mirror {
    private int legs;
    private String shape;

    public Mirror() {
    }

    public Mirror (int legs, String shape) {
        this.legs=legs;
        this.shape=shape;
    }
    public int getLegs(){
        return legs;
    }
    public void setLegs(int legs){
        this.legs=legs;
    }
    public String getShape(){
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    }
