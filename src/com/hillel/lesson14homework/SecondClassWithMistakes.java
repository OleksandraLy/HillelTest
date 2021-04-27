package com.hillel.lesson14homework;

public class SecondClassWithMistakes {
   /* Создайте еще один класс, у которого будет также три промежуточных метода, которые просто
    будут вызывать по одному методу первого класса.  Эти методы не должны обрабатывать
    возможные  ошибки, а просто пробрасывают  полученную  ошибку  выше;*/

    public static void method4()throws CustomException{
        ClassWithMistakes.method1();
    }
    public void method5() throws CustomException{
        ClassWithMistakes.method2();
    }
    public void method6() throws CustomException{
        ClassWithMistakes.method3();
    }
}
