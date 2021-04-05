package com.hillel.lesson8homework;

public class Homework8 {
    /*Создайте новый класс, у которого должно быть 9 переменных (8 примитивов + String);
    Для каждой переменной напишите getter и setter;
    Напишите конструкторы начиная от конструктора по-умолчанию до конструктора с 9 параметрами;*/
    byte bytePrimitive;
    public byte getBytePrimitive(){
        return bytePrimitive;
    }
    public void setBytePrimitive(byte bytePrimitive){
        this.bytePrimitive=bytePrimitive;
    }

    short shortPrimitive;
    public short getShortPrimitive(){
        return shortPrimitive;
    }
    public void setShortPrimitive(short shortPrimitive){
        this.shortPrimitive=shortPrimitive;
    }

    int intPrimitive;
    public int getIntPrimitive(){
        return intPrimitive;
    }
    public void setIntPrimitive(int intPrimitive){
        this.intPrimitive=intPrimitive;
    }

    long longPrimitive;
    public long getLongPrimitive(){
        return longPrimitive;
    }
    public void setLongPrimitive(long longPrimitive){
        this.longPrimitive=longPrimitive;
    }

    float floatPrimitive;
    public float getFloatPrimitive(){
        return floatPrimitive;
    }
    public void setFloatPrimitive(float floatPrimitive){
        this.floatPrimitive=floatPrimitive;
    }

    double doublePrimitive;
    public double getDoublePrimitive(){
        return doublePrimitive;
    }
    public void setDoublePrimitive(double doublePrimitive) {
        this.doublePrimitive = doublePrimitive;
    }

    char charPrimitive;
    public char getCharPrimitive(){
        return charPrimitive;
    }
    public void setCharPrimitive(char charPrimitive){
        this.charPrimitive=charPrimitive;
    }

    boolean booleanPrimitive;
    public boolean getBooleanPrimitive(){
        return booleanPrimitive;
    }
    public void setBooleanPrimitive(boolean booleanPrimitive){
        this.booleanPrimitive=booleanPrimitive;
    }
    String someString;
    public String getSomeString(){
        return someString;
    }
    public void setSomeString(String someString){
        this.someString=someString;
    }
    public Homework8(){

    }
    public Homework8(byte bytePrimitive){
        this.bytePrimitive= bytePrimitive;
    }
    public Homework8(byte bytePrimitive, short shortPrimitive){
        this.bytePrimitive=bytePrimitive;
        this.shortPrimitive=shortPrimitive;
    }
    public Homework8(byte bytePrimitive, short shortPrimitive, int intPrimitive) {
        this.bytePrimitive = bytePrimitive;
        this.shortPrimitive = shortPrimitive;
        this.intPrimitive = intPrimitive;
    }
    public Homework8(byte bytePrimitive, short shortPrimitive, int intPrimitive, long longPrimitive) {
        this.bytePrimitive = bytePrimitive;
        this.shortPrimitive = shortPrimitive;
        this.intPrimitive = intPrimitive;
        this.longPrimitive = longPrimitive;
    }
    public Homework8(byte bytePrimitive, short shortPrimitive, int intPrimitive, long longPrimitive, float floatPrimitive) {
        this.bytePrimitive = bytePrimitive;
        this.shortPrimitive = shortPrimitive;
        this.intPrimitive = intPrimitive;
        this.longPrimitive = longPrimitive;
        this.floatPrimitive=floatPrimitive;
    }
    public Homework8(byte bytePrimitive, short shortPrimitive, int intPrimitive, long longPrimitive, float floatPrimitive, double doublePrimitive) {
        this.bytePrimitive = bytePrimitive;
        this.shortPrimitive = shortPrimitive;
        this.intPrimitive = intPrimitive;
        this.longPrimitive = longPrimitive;
        this.floatPrimitive=floatPrimitive;
        this.doublePrimitive=doublePrimitive;
    }
    public Homework8(byte bytePrimitive, short shortPrimitive, int intPrimitive, long longPrimitive, float floatPrimitive, double doublePrimitive, char charPrimitive) {
        this.bytePrimitive = bytePrimitive;
        this.shortPrimitive = shortPrimitive;
        this.intPrimitive = intPrimitive;
        this.longPrimitive = longPrimitive;
        this.floatPrimitive=floatPrimitive;
        this.doublePrimitive=doublePrimitive;
        this.charPrimitive=charPrimitive;
    }
    public Homework8(byte bytePrimitive, short shortPrimitive, int intPrimitive, long longPrimitive, float floatPrimitive, double doublePrimitive, char charPrimitive, boolean booleanPrimitive) {
        this.bytePrimitive = bytePrimitive;
        this.shortPrimitive = shortPrimitive;
        this.intPrimitive = intPrimitive;
        this.longPrimitive = longPrimitive;
        this.floatPrimitive=floatPrimitive;
        this.doublePrimitive=doublePrimitive;
        this.charPrimitive=charPrimitive;
        this.booleanPrimitive=booleanPrimitive;
    }
    public Homework8(byte bytePrimitive, short shortPrimitive, int intPrimitive, long longPrimitive, float floatPrimitive, double doublePrimitive, char charPrimitive, boolean booleanPrimitive, String someString) {
        this.bytePrimitive = bytePrimitive;
        this.shortPrimitive = shortPrimitive;
        this.intPrimitive = intPrimitive;
        this.longPrimitive = longPrimitive;
        this.floatPrimitive=floatPrimitive;
        this.doublePrimitive=doublePrimitive;
        this.charPrimitive=charPrimitive;
        this.booleanPrimitive=booleanPrimitive;
        this.someString=someString;
    }
}
