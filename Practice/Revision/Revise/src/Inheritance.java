public class Inheritance {
    public static void main(String[] args) {

        Bike bike = new Bike();

        bike.startBike();
    }
}

class Engine{
    public Engine() {
        System.out.println("Engine Mounted");
    }

    public void startEngine(){
        System.out.println("Engine Started");
    }
}

class Bike extends Engine{

    public Bike() {
    }

    public void startBike(){
        System.out.println("Starting Bike");
        this.startEngine();
        System.out.println("Bike Running");
    }
}