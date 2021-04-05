package com.hillel.lesson8homework;

public class House {

    private String size;
    private String material;

    private String name;
    private String backShape;

    private int drawers;
    private String colour;

    private int legs;
    private String shape;

    private String shape1;
    private int legs1;


    public House(String name, String backShape){
        this.name="tulip";
        this.backShape="oval";
    }

    public House(int drawers, String colour) {
        this.drawers = 5;
        this.colour = "soft oak";
    }

    public House(String shape1, int legs1) {
        this.shape1 = "square";
        this.legs1 = 4;
    }

}


