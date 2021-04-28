package com.hillel.lesson14homework;

import java.io.File;
import java.lang.reflect.Array;
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
        Scanner scanner = new Scanner(new File("C:\\Users\\Олександра\\IdeaProjects\\HillelJavaCourse\\src\\com\\hillel\\lesson13homework\\mistakes.txt"
        }
    public static void method3(){
        String[] stringArray={24, 25,19,3,104};
    }
}
