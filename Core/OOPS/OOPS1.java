package OOPS;

public class OOPS1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.name = "GTR";
        car1.run();
    }
}

class Car{
    String name;
    int whele;
    int speed;

    public void run(){
        System.out.println(name+" is running.");
    }
}
