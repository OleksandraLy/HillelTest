package com.hillel.lesson2classwork;

public class Arrays {
    public static void main(String[] args) {
        int [] [] myMatrixArray = new int [3] [3];
        int [] [] myMatrixArrayFilled = {{1,2}, {1,3}};
        System.out.println(myMatrixArrayFilled);
        System.out.println(myMatrixArray);

        System.out.println(java.util.Arrays.deepToString(myMatrixArray));
        System.out.println(java.util.Arrays.deepToString(myMatrixArrayFilled));


    }

}
