package org.example;

public class Car {

    Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    //Dependecu injection USING Setter method
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    void drive(){
        int start = engine.start();
        if(start > 0){
            System.out.println("Car started");
        }else {
            System.out.println("Car not started.");
        }
    }
}
