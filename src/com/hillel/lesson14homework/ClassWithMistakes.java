package com.hillel.lesson14homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ClassWithMistakes {
    /*Создайте класс, в которому будут 3 отдельных метода, логика которых будет вызывать 3
    разные “проверяемые”(checked) ошибки. Ошибки можете вызвать принудительно в ходе какой-то логики(не принципиально);*/
    public static void method1(){
        System.out.println("Enter your name:");
        Scanner scanner = new Scanner (System.in);
        scanner.close();
        String string = scanner.nextLine();
    }
    public static void method2(){
        List<String> stringArrayList = new ArrayList<>(2);
        String string2= "Weather forecast is";
        String string3= "Traffic on the roads is";
        if (stringArrayList.isEmpty()){
            Collections.addAll(stringArrayList, string2, string3);
        }
    }
    public static void method3(){
        List<String> stringArrayList2 = new ArrayList<>(3);
        int a = 20;
        stringArrayList2.add(a);
    }
}
