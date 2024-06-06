package OOPS;

public class MethodOverloading {
    public static void main(String[] args) {

        Greet greet = new Greet();
        greet.greeting();
        greet.greeting("Sourav");
        greet.greeting(5);
    }
}

class  Greet{

    void greeting(){
        System.out.println("Hello, good morning.");
    }

    void greeting(String name){
        System.out.println("Hello "+name+", Good morning.");
    }

    void greeting(int num){
        for (int i = 0; i < num; i++) {
            System.out.println("Hello, good morning.");
        }
    }
}
