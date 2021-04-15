package com.hillel.lesson10homework;


import java.util.Random;

public final class SubjectLibrarian extends Librarian {
    private String subject;
    private int energy;
    public void recommendBook (){
        Random random = new Random();

        System.out.println("You need book with the number in catalogue:" + random.nextInt(2000));
    }

    public SubjectLibrarian() {
    }

    public SubjectLibrarian(String subject, int energy) {
        this.subject = subject;
        this.energy = energy;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    @Override
    public String toString() {
        return "SubjectLibrarian{" +
                "subject='" + subject + '\'' +
                ", energy=" + energy +
                '}';
    }
}
