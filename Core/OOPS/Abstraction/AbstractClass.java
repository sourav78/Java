package OOPS.Abstraction;

public class AbstractClass {
    public static void main(String[] args) {
//        Vehicle vehicle = new Vehicle(); //'Vehicle' class is abstract, cannot be instantiated

        Car car = new Car();
        car.accelerate(80);
        car.breakes();
    }
}

abstract class Vehicle{
    abstract void accelerate(int speed);

    void breakes(){
        System.out.println("Breaks are pushed.");
    }
}

class Car extends Vehicle{

    @Override
    void accelerate(int speed) {
        System.out.println("Accelerating...Now car can gain speed up to "+speed);
    }
}
