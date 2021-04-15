package com.hillel.lesson10homework;

public final class CirculationLibrarian extends Librarian{
    private int patience;
    private int energy;
    public void checkOutBooks(){
        System.out.println("You received a book from the library. Please return it on time. Have nice reading :)");
    }

    public CirculationLibrarian() {
    }

    public CirculationLibrarian(int patience, int energy) {
        this.patience = patience;
        this.energy = energy;
    }

    public int getPatience() {
        return patience;
    }

    public void setPatience(int patience) {
        this.patience = patience;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    @Override
    public String toString() {
        return "CirculationLibrarian{" +
                "patience='" + patience + '\'' +
                ", energy=" + energy +
                '}';
    }
}
