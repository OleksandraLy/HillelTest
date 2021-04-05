package com.hillel.lesson8homework;

public class Bed {
    private String size;
    private String material;

    public Bed() {
    }

    public Bed (String size, String material){
        this.size=size;
        this.material=material;
    }
    public String getSize(){
        return size;
    }
    public void setSize (String size){
        this.size=size;
    }
    public String getMaterial(){
        return material;
    }
    public void setMaterial(String material){
        this.material=material;
    }
}
