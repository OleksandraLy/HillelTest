package com.hillel.lesson16classwork;

public class Auto {
  private Engine engine = new Engine("petrol", 15);
  private Brakes brakes = new Brakes(true);
  private Body body = new Body ("sedan", 2);
  private ControlSystem controlSystem = new ControlSystem (230, true);

    public Auto(Engine engine, Brakes brakes, Body body, ControlSystem controlSystem) {
        this.engine = engine;
        this.brakes = brakes;
        this.body = body;
        this.controlSystem = controlSystem;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Brakes getBrakes() {
        return brakes;
    }

    public void setBrakes(Brakes brakes) {
        this.brakes = brakes;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public ControlSystem getControlSystem() {
        return controlSystem;
    }

    public void setControlSystem(ControlSystem controlSystem) {
        this.controlSystem = controlSystem;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "engine=" + engine +
                ", brakes=" + brakes +
                ", body=" + body +
                ", controlSystem=" + controlSystem +
                '}';
    }
}
