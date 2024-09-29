package org.example;

public class PetrolEngine implements Engine {

    public PetrolEngine() {
        System.out.println("Petrol constructor.");
    }


    @Override
    public int start() {
        System.out.println("Petrol engine");
        return 1;
    }
}
