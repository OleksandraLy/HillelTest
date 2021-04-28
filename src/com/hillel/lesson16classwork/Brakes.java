package com.hillel.lesson16classwork;

public class Brakes {
    private boolean stop;

    public Brakes(boolean stop) {
        this.stop = stop;
    }

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    @Override
    public String toString() {
        return "Brakes{" +
                "stop=" + stop +
                '}';
    }
}
