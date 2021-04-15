package com.hillel.lesson10homework;

import java.util.Scanner;

public class Librarian extends Employee {
    private boolean librarianEducation;
    private String additionalFieldOfKnowledge;
    public void loveBooks(){
        System.out.println("Enter your favourite book title:");
        Scanner scanner = new Scanner (System.in);
        String favouriteBook = scanner.nextLine();
        System.out.println("Your favourite book is " + favouriteBook);
        scanner.close();
    }

    public Librarian() {
    }

    public Librarian(boolean librarianEducation, String additionalFieldOfKnowledge) {
        this.librarianEducation = librarianEducation;
        this.additionalFieldOfKnowledge = additionalFieldOfKnowledge;
    }

    public boolean isLibrarianEducation() {
        return librarianEducation;
    }

    public void setLibrarianEducation(boolean librarianEducation) {
        this.librarianEducation = librarianEducation;
    }

    public String getAdditionalFieldOfKnowledge() {
        return additionalFieldOfKnowledge;
    }

    public void setAdditionalFieldOfKnowledge(String additionalFieldOfKnowledge) {
        this.additionalFieldOfKnowledge = additionalFieldOfKnowledge;
    }

    @Override
    public void breath() {
        super.breath();
    }


    @Override
    public void report() {

    }

    @Override
    public void cooperateWithColleagues() {

    }
}
