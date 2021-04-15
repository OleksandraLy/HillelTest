package com.hillel.lesson10homework;

public class Employee implements Work, Serve{
    private String name;
    private int age;

    public Employee() {
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void breath() {

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void serveUsers() {
        System.out.println("How can I help you?");
    }

    @Override
    public void communicate() {
        System.out.println("Hello!");
    }

    @Override
    public void report() {
        System.out.println("The report is in attachment");
    }

    @Override
    public void cooperateWithColleagues() {
        System.out.println("Could you please help me?");

    }
}
