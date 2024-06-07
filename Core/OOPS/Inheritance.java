package OOPS;

public class Inheritance extends Vehicle {

    public static void main(String[] args) {

        Inheritance car = new Inheritance();
        car.numberOfWheel = 4;
        car.model = "Swift";
        car.running();

    }
}

class Vehicle {
    int numberOfWheel;
    String model;

    void running(){
        System.out.println(model+" is running.");
    }
}