package com.hillel.lesson16classwork;

public class ControlSystem {
    private int speed;
    private boolean turn;

    public ControlSystem(int speed, boolean turn) {
        this.speed = speed;
        this.turn = turn;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isTurn() {
        return turn;
    }

    public void setTurn(boolean turn) {
        this.turn = turn;
    }

    @Override
    public String toString() {
        return "ControlSystem{" +
                "speed=" + speed +
                ", turn=" + turn +
                '}';
    }
}
