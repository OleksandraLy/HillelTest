package com.hillel.lesson7homework;

public class Dog {
    public  String name;
    public  int energy;
    public  int appetite;
    public Dog(){

    }
    public Dog(String name){
        this.name=name;
    }
    public Dog(String name, int energy) {
        this.name=name;
        this.energy=energy;
    }
    public Dog(String name, int energy, int appetite) {
        this.name=name;
        this.energy=energy;
        this.appetite=appetite;
    }
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getEnergy(){
        return energy;
    }
    public void setEnergy(int energy){
        this.energy=energy;
    }
    public int getAppetite(){
        return appetite;
    }
    public void setAppetite(int appetite){
        this.appetite = appetite;
    }
}
