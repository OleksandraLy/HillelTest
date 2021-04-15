package com.hillel.lesson10homework;

public final class Neville extends Wizard{
    int friendliness;
    String pet;
    public void searchPet(){
        System.out.println("Have you seen my toad?");
    }
    public Neville (){

    }
    public Neville (int friendliness, String pet){
        this.friendliness = friendliness;
        this.pet = pet;
    }

    public int getFriendliness() {
        return friendliness;
    }

    public void setFriendliness(int friendliness) {
        this.friendliness = friendliness;
    }

    public String getPet() {
        return pet;
    }

    public void setPet(String pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Neville{" +
                "friendliness=" + friendliness +
                ", pet='" + pet + '\'' +
                '}';
    }
}
