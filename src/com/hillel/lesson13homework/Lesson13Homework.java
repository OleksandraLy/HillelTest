package com.hillel.lesson13homework;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Lesson13Homework<method2> {
    static String pathToFile= "C:\\Users\\Олександра\\IdeaProjects\\HillelJavaCourse\\src\\com\\hillel\\lesson13homework\\maps.txt";
    public static void main(String[] args) throws IOException {
        questionMethod();
        method2();
    }
  /*  Задача 1:
    Создайте
    программу-опросник(Можно  вынести  в  отдельный класс с  необходимым(и) методом(ами)).
    Данная программа должна просить ввести пользователя свое имя, после чего проводить опрос(достаточно 2-3 вопроса).
    Введенные данные  сохраняются в виде ключ-значение,  где ключ - это имя пользователя, а значение это данные  в  виде
    тоже ключ-значение(где ключ - это вопрос,
    а значение - ответ). Тип значения ответа на  вопрос указать на  свое усмотрение.После проведенного опроса программа должна записать результат в файл.
   */
    public static void questionMethod() throws IOException {
        String answer;
        String question1="Please enter your name";
        String question2= "Please enter your surname";
        String question3= "Please enter your age";
        System.out.println(question1);
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(question2);
        String surname = scanner.nextLine();
        System.out.println(question3);
        String age = scanner.nextLine();

        FileWriter fileWriter = new FileWriter(pathToFile);
        fileWriter.write(name.concat(surname.concat(age)));
        fileWriter.close();

        Map<String, String> hashMap = new HashMap<>();
        hashMap.put(question1, name);
        hashMap.put(question2, surname);
        hashMap.put(question3, age);
        System.out.println(hashMap);
        scanner.close();
        Map<String, Map> hashMap2= new HashMap<>();
        hashMap2.put(name, hashMap);
    }
   /* Создайте 3 класса, которые линейно наследуются друг от друга. Должна быть возможность  создать экземпляр класса каждого
    из наследников(подумайте  какой тип класса должен быть). В каждом из классов должно быть 3 поля(на свое усмотрение), которые
    имеют тип переменной List/Set/Map, то есть будут по 1 переменной с типом List, Set и Map.(Зная принципы ООП будьте внимательны
    реализуя переменные в классах!). Далее зная проWildcards реализуйте метод, который на вход будет принимать 2 List/Set/Map
            (На Ваше усмотрение, не принципиально), один из которых будет разрешать передать всех наследников от среднего  класса(Вашего),
    второй - будет разрешать передать всех кто выше в наследовании от среднего класса(Вашего).
    Логика внутри данного метода: заполнение из одной коллекции данными в другую коллекцию.*/
    public static void method2(){
        ArrayList<? extends Class2> arrayList2 = new ArrayList<>();
        ArrayList<? extends Class1> arrayList3= new ArrayList<>();
    }
}
