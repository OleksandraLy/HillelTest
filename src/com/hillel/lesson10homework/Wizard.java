package com.hillel.lesson10homework;

public class Wizard extends RowlingCharacter{
    private String wandMaterial;
    int power;
    public void spells(){
        System.out.println("I put a spell on you!");
    }

    public Wizard() {
    }

    public Wizard(String wandMaterial, int power) {
        this.wandMaterial = wandMaterial;
        this.power = power;
    }

    public String getWandMaterial() {
        return wandMaterial;
    }

    public void setWandMaterial(String wandMaterial) {
        this.wandMaterial = wandMaterial;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Wizard{" +
                "wandMaterial='" + wandMaterial + '\'' +
                ", power=" + power +
                '}';
    }

}
