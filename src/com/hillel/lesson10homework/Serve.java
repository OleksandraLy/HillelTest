package com.hillel.lesson10homework;

public interface Serve extends Work{
    void serveUsers();
    void communicate();

    @Override
    void report();

    @Override
    void cooperateWithColleagues();
}
