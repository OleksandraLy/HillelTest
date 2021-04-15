package com.hillel.lesson10homework;

public interface Play extends Interact{
    void playChess();
    void playQuidditch();

    @Override
    void withFriend();

    @Override
    void withEnemy();
}
