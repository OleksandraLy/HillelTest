package com.hillel.lesson8homework;

public class Dresser {
    private int drawers;
    private String colour;

    public Dresser() {
    }

    public Dresser (int drawers, String colour){
        this.drawers=drawers;
        this.colour=colour;
    }
    public int getDrawers(){
        return drawers;
    }
    public void setDrawers(int drawers){
        this.drawers=drawers;
    }
    public String getColour(){
        return colour;
    }
    public void setColour(String colour){
        this.colour=colour;
    }
}
