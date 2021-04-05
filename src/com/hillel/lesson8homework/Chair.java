package com.hillel.lesson8homework;

public class Chair {
    private String name;
    private String backShape;

    public Chair() {
    }

    public Chair (String name, String backShape){
        this.name=name;
        this.backShape=backShape;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getBackShape(){
        return backShape;
    }
    public void setBackShape(String backShape) {
        this.backShape=backShape;
    }
}
