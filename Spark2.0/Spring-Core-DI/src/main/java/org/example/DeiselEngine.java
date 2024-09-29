package org.example;

public class DeiselEngine implements Engine {

    public DeiselEngine() {
        System.out.println("Diesel constructor");
    }

    @Override
    public int start() {
        System.out.println("Diesel engine");
        return 1;
    }
}