package com.hillel.lesson7homework;

public class MainForCatAndDog {
    Cat fialka = new Cat();
    Cat gavria = new Cat("gavria");
    Cat murka = new Cat("murka", 98);
    Cat boria = new Cat("boria", 77, 99);

    Dog shanel = new Dog();
    Dog bars = new Dog ("bars");
    Dog bilka = new Dog ("bilka", 99);
    Dog zefir = new Dog ("zefir", 90, 92);

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name="quinto";
        System.out.println(cat.name);
        cat.setName("quinto");
        System.out.println(cat.getName());
        cat.energy=60;
        System.out.println(cat.energy);
        cat.setEnergy(60);
        System.out.println(cat.getEnergy());
        cat.appetite=75;
        System.out.println(cat.appetite);
        cat.setAppetite(75);
        System.out.println(cat.getAppetite());
        Dog dog = new Dog ();
        dog.name = "dzhulai";
        System.out.println(dog.name);
        dog.setName("dzhulai");
        System.out.println(dog.getName());
        dog.energy=99;
        System.out.println(dog.energy);
        dog.setEnergy(99);
        System.out.println(dog.getEnergy());
        dog.appetite=87;
        System.out.println(dog.appetite);
        dog.setAppetite(87);
        System.out.println(dog.getAppetite());
    }
}


