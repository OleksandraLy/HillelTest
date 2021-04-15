package com.hillel.lesson10homework;

public final class Hermione extends Wizard{
    private int knowledge;
    private String favouriteBook;
    public void preach(){
        System.out.println("You should read the books professor Flitwick recommended!");
    }
    public Hermione (){};
    public Hermione (int knowledge, String favouriteBook){
        this.knowledge=knowledge;
        this.favouriteBook=favouriteBook;
    }

    public int getKnowledge() {
        return knowledge;
    }

    public void setKnowledge(int knowledge) {
        this.knowledge = knowledge;
    }

    public String getFavouriteBook() {
        return favouriteBook;
    }

    public void setFavouriteBook(String favouriteBook) {
        this.favouriteBook = favouriteBook;
    }

    @Override
    public String toString() {
        return "Hermione{" +
                "knowledge=" + knowledge +
                ", favouriteBook='" + favouriteBook + '\'' +
                '}';
    }
}
