package org.example;

public class Car {

    Engine engine;

    public Car(){
        System.out.println("Car constructor");
    }
    public Car(Engine engine) {
        System.out.println("Car parametere constructor");
        this.engine = engine;
    }

    //Dependency injection USING Setter method
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
