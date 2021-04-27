package com.hillel.lesson12homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class OperationsWithList {
    Class1 class1 = new Class1(24, 7013);
    Class2 class2 = new Class2(49, 23, 19);
    Class3 class3 = new Class3 (205, 107, 11);
    static List<Integer> myArrayList = new ArrayList<>(6);

  /*  Создайте метод, который будет принимать и возвращать Список, и проводить с ним следующе
    итерации:
    а). Если список пустой, добавьте в него 6 объектов 1го Вашего класса;
    б). После добавьте в начало списка 3 объекта 2го Вашего класса;
    в). После замените последние 3 элемента списка на 3 объекта 3го Вашего
    класса;*/

    public List<Integer> method1(List<Integer> myArrayList) {

        if (myArrayList.isEmpty()) {
            Collections.addAll(myArrayList, class1.getX(), class1.getA(), class1.getB(), class1.getC(), class1.getD(), class1.getE());
        }
        myArrayList.add(0,class2.getY());
        myArrayList.add(1,class2.getF());
        myArrayList.add(2,class2.getG());

        myArrayList.set(7, class3.getZ());
        myArrayList.set(8, class3.getH());
        myArrayList.set(9, class3.getI());
return myArrayList;
    }
    /*Создайте второй метод, который на вход будет принимать Список и возвращать список и
    будет выполнять следующую логику: Проверять количество экземпляров класса в принятом
    Списке и оставлять только по 2 экземпляра каждого из 3 Ваших классов(то есть, 6 объектов в сумме).*/
    public static List<Integer> method2 (List<Integer> myArrayList){
        Iterator<Integer> iterator = myArrayList.iterator();
        while (iterator.hasNext()){
            for (int n=1; n<=2; n++) {
                if (myArrayList instanceof Class1) {
                    iterator.next();
                    n++;
                } if (n> 2) iterator.remove();
            }
            for (int n=1; n<=2; n++) {
            if (myArrayList instanceof Class2){
            iterator.next();
            n++;} if (n> 2) iterator.remove();
            }
            for (int n=1; n<=2; n++) {
                if (myArrayList instanceof Class3){
                    iterator.next();
                    n++;} if (n> 2) iterator.remove();
                }
            }
return myArrayList;
    }
}
