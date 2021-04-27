package com.hillel.lesson12homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class OperationsWithList {
    Class1 class1 = new Class1(24, "String");
    Class2 class2 = new Class2("Some string", 23, 19);
    Class3 class3 = new Class3 ("Some more string", 107, 11);
    static List<Object> myArrayList = new ArrayList<Object>(6);
    Iterator<Object> iterator = myArrayList.iterator();

  /*  Создайте метод, который будет принимать и возвращать Список, и проводить с ним следующе
    итерации:
    а). Если список пустой, добавьте в него 6 объектов 1го Вашего класса;
    б). После добавьте в начало списка 3 объекта 2го Вашего класса;
    в). После замените последние 3 элемента списка на 3 объекта 3го Вашего
    класса;*/

    public List<Object> method1(List<Object> myArrayList) {

        if (myArrayList.isEmpty()) {
            Collections.addAll(myArrayList, class1.getString(), class1.getA(), class1.getB(), class1.getC(), class1.getD(), class1.getE());
        }
        myArrayList.add(0,class2.getSomeString());
        myArrayList.add(1,class2.getF());
        myArrayList.add(2,class2.getG());

        myArrayList.set(7, class3.getOneMoreString());
        myArrayList.set(8, class3.getH());
        myArrayList.set(9, class3.getI());
return myArrayList;
    }
    /*Создайте второй метод, который на вход будет принимать Список и возвращать список и
    будет выполнять следующую логику: Проверять количество экземпляров класса в принятом
    Списке и оставлять только по 2 экземпляра каждого из 3 Ваших классов(то есть, 6 объектов в сумме).*/
    public static List<Object> method2 (List<Object> listName){
        Iterator<Object> iterator2 = myArrayList.iterator();
        while (iterator2.hasNext()){
            if (myArrayList instanceof Class1) {
                System.out.println("Item is found");
            }
        }
return myArrayList;
    }
}
