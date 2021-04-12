package com.hillel.lesson9homework;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class User {
    static String pathToFile= "C:\\Users\\Олександра\\IdeaProjects\\HillelJavaCourse\\src\\com\\hillel\\lesson9homework\\user.txt";

    public static void main(String[] args) throws IOException {
        writeText();
        readText();

    }
    private String name;
    private String surname;
    private String email;
    private String password;
    private String sex;
    private String country;

    public User (){

    }
    public User (String name){
        this.name=name;
    }
    public User (String name, String surname){
        this.name = name;
        this.surname=surname;
    }
    public User (String name, String surname, String email){
        this.name=name;
        this.surname=surname;
        this.email=email;
    }
    public User (String name, String surname, String email, String password){
        this.name=name;
        this.surname=surname;
        this.email=email;
        this.password=password;
    }
    public User (String name, String surname, String email, String password, String sex){
        this.name=name;
        this.surname=surname;
        this.email=email;
        this.password=password;
        this.sex=sex;
    }

    public User (String name, String surname, String email, String password, String sex, String country){
        this.name=name;
        this.surname=surname;
        this.email=email;
        this.password=password;
        this.sex=sex;
        this.country=country;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
   /* Так же у данного класса должно быть 2 метода:

    а). Читать. Принимает текст, ничего не возвращает, выводит сообщение
    принятое в консоль. Данный метод необходимо задать как “неизменяемый”.

    б). Писать. Ничего не принимает, просто считывает текст с клавиатуры и
    сохраняет введенный текст в файл.*/

    public final static void readText() throws IOException {
        System.out.println("Start reading from file:");

        FileReader informationReader = new FileReader(pathToFile);
        Scanner enterInformationHere = new Scanner(informationReader);


        while (enterInformationHere.hasNextLine()) {
            String informationEntered = enterInformationHere.nextLine();
            System.out.println("Read one string from file:");
            System.out.println(informationEntered);
        }

        enterInformationHere.close();
        informationReader.close();
    }
        public static void writeText() throws IOException {
        System.out.println("Please, enter your information here:");
        Scanner enterYourInformation= new Scanner(System.in);
        String moreEnteredInformation = enterYourInformation.nextLine();


        FileWriter userFileWriter= new FileWriter(pathToFile);
        userFileWriter.write(moreEnteredInformation);
        enterYourInformation.close();
        userFileWriter.close();

    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
