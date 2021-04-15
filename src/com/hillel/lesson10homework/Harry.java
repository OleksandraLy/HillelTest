package com.hillel.lesson10homework;

public final class Harry extends Wizard implements Tease{
    private int bravery;
    private String enemy;
    public void sympathy(){
        System.out.println("I feel sorry for your loss");
    }

    public Harry() {
    }

    public Harry(int bravery, String enemy) {
        this.bravery = bravery;
        this.enemy = enemy;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public String getEnemy() {
        return enemy;
    }

    public void setEnemy(String enemy) {
        this.enemy = enemy;
    }

    @Override
    public String toString() {
        return "Harry{" +
                "bravery=" + bravery +
                ", enemy='" + enemy + '\'' +
                '}';
    }

    @Override
    public void teaseMalfoy() {
            System.out.println("You can't even win Quidditch match!");
    }
}
