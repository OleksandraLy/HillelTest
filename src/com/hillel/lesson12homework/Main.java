package com.hillel.lesson12homework;

import java.util.List;

public class Main {
    public static List<Object> myArrayList;
    public static void main(String[] args) {
        OperationsWithList operationsWithList = new OperationsWithList();
        operationsWithList.method1(myArrayList);
        System.out.println(operationsWithList.myArrayList);
        //operationsWithList.method2(myArrayList);
    }
}
