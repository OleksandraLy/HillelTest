package com.hillel.lesson8homework;

public class House3 {
    private Mirror theMirror;
    private Bed theBed;
    private Chair theChair;
    private Dresser theDresser;
    private Table theTable;

    public House3 (Mirror theMirror) {
        this("wooden","triangular");
        this.theMirror=theMirror;
    }

    public House3(Bed theBed, Chair theChair) {
        this.theBed = theBed;
        this.theChair = theChair;
    }


    public House3 (Mirror theMirror, Bed theBed, Chair theChair, Dresser theDresser, Table theTable){
        this.theMirror=theMirror;
        this.theBed = theBed;
        this.theChair=theChair;
        this.theDresser=theDresser;
        this.theTable=theTable;
    }

    public Mirror getTheMirror() {
        return theMirror;
    }

    public void setTheMirror(Mirror theMirror) {
        this.theMirror = theMirror;
    }
    public Bed getTheBed(){
        return theBed;
    }
    public void setTheBed(Bed theBed) {
        this.theBed=theBed;
    }
    public Chair getTheChair() {
        return theChair;
    }
    public void setTheChair() {
        this.theChair=theChair;
    }
    public Dresser getTheDresser() {
        return theDresser;
    }
    public void setTheDresser() {
        this.theDresser=theDresser;
    }
    public Table getTheTable() {
        return theTable;
    }
    public Table setTheTable() {
        this.theTable=theTable;
    }
}
