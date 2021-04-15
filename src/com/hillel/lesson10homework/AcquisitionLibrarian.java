package com.hillel.lesson10homework;

public final class AcquisitionLibrarian extends Librarian {
    private String typeOfResources;
    private int energy;
    public void orderBooks(){
        System.out.println("Your book has been ordered by the library. Thank you for cooperation");
    }

    public AcquisitionLibrarian() {
    }

    public AcquisitionLibrarian(String typeOfResources, int energy) {
        this.typeOfResources = typeOfResources;
        this.energy = energy;
    }

    public String getTypeOfResources() {
        return typeOfResources;
    }

    public void setTypeOfResources(String typeOfResources) {
        this.typeOfResources = typeOfResources;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    @Override
    public String toString() {
        return "AcquisitionLibrarian{" +
                "typeOfResources='" + typeOfResources + '\'' +
                ", energy=" + energy +
                '}';
    }
}
