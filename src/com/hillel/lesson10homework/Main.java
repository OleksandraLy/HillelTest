package com.hillel.lesson10homework;

public class Main {

    public static void main(String[] args) {
        RowlingCharacter rowlingCharacter= new RowlingCharacter("Ron",17);
        Wizard wizard = new Wizard ("willow",80);
        Hermione hermione = new Hermione (100,"Beadle the Bard tales");
        Neville neville = new Neville (100, "toad");
        Harry harry = new Harry(100,"Lord Voldemort");

        Employee employee = new Employee ("Svitlana", 25);
        Librarian librarian = new Librarian (true,"electronicResources");
        AcquisitionLibrarian acquisitionLibrarian= new AcquisitionLibrarian("online", 95);
        CirculationLibrarian circulationLibrarian = new CirculationLibrarian(80,76);
        SubjectLibrarian subjectLibrarian = new SubjectLibrarian("science",75);

        rowlingCharacter.appearInHarryPotter();
        rowlingCharacter.playChess();
        rowlingCharacter.playQuidditch();
        rowlingCharacter.withFriend();
        rowlingCharacter.withEnemy();
        harry.teaseMalfoy();

        wizard.spells();
        neville.searchPet();
        hermione.preach();
        harry.sympathy();

        employee.breath();
        employee.communicate();
        employee.cooperateWithColleagues();
        employee.report();
        employee.serveUsers();

        librarian.loveBooks();
        acquisitionLibrarian.orderBooks();
        circulationLibrarian.checkOutBooks();
        subjectLibrarian.recommendBook();


    }
}
