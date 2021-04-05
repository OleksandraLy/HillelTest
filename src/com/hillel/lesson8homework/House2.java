package com.hillel.lesson8homework;

public class House2 {
    public static void main(String[] args) {
        Mirror theMirror = new Mirror();
        theMirror.setLegs(3);
        theMirror.setShape("oval");
        System.out.println(theMirror.getLegs());
        System.out.println(theMirror.getShape());

        Chair theChair = new Chair();
        theChair.setName("tulip");
        theChair.setBackShape("triangular");
        System.out.println(theChair.getName());
        System.out.println(theChair.getBackShape());

        Bed theBed= new Bed();
        theBed.setSize("double");
        theBed.setMaterial("wooden");
        System.out.println(theBed.getSize());
        System.out.println(theBed.getMaterial());

        Table theTable=new Table();
        theTable.setShape1("square");
        theTable.setLegs1(4);
        System.out.println(theTable.getShape1());
        System.out.println(theTable.getLegs1());

        Dresser theDresser = new Dresser();
        theDresser.setDrawers(5);
        theDresser.setColour("soft oak");
        System.out.println(theDresser.getDrawers());
        System.out.println(theDresser.getColour());

    }

}
