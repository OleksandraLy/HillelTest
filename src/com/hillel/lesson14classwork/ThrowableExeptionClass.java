package com.hillel.lesson14classwork;

import java.util.ArrayList;
import java.util.List;

public class ThrowableExeptionClass {
    public static void main(String[] args) {
    getException();
    }
    static private void getException(){
        int a = 4;
        int b = 2;
        int c = 0;
        List<String> myArrayList = new ArrayList<>();
        myArrayList.add("firstElement");

       /* try {
            int result = a/b;

            String myArrayListElement=myArrayList.get(11);
            int error_result=b/c;
            //int error_result=6;
            System.out.println(myArrayListElement + result+error_result);
        }
        catch (IndexOutOfBoundsException) {
            System.out.println("Exception is caught: ".concat(e.toString()));
        } catch (Exception e) {
            System.out.println("Exception is caught");
        }*/
    }
}
