package org.example;

public class DeiselEngine implements Engine {

    @Override
    public int start() {
        System.out.println("Diesel engine");
        return 1;
    }
}