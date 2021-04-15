package com.hillel.lesson10homework;

import java.util.Random;

public class RowlingCharacter implements Interact, Play{
    private String name;
    private int age;
    public void appearInHarryPotter (){
        Random random = new Random ();
        System.out.println("This character appears in Harry Potter cycle: " + random.nextBoolean());
    }

    public RowlingCharacter() {
    }

    public RowlingCharacter(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "RowlingCharacter{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void playChess() {
        System.out.println("Game is on!");
    }

    @Override
    public void playQuidditch() {
        System.out.println("On the broomsticks!");
    }

    @Override
    public void withFriend() {
        System.out.println("Glad to see you");
    }

    @Override
    public void withEnemy() {
        System.out.println("Nothing in your appearance makes me happy");
    }
}
