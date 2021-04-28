package com.hillel.lesson16classwork;

public class Body {
    private String bodyType;
    private int size;

    public Body(String bodyType, int size) {
        this.bodyType = bodyType;
        this.size = size;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Body{" +
                "bodyType='" + bodyType + '\'' +
                ", size=" + size +
                '}';
    }
}
