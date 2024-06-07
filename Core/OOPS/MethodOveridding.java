package OOPS;

public class MethodOveridding extends Wish {

    void greeting(){
        super.greeting();
        System.out.println("Byy, Good night.");
    }

    public static void main(String[] args) {
        MethodOveridding greet = new MethodOveridding();
        greet.greeting();
    }
}

class Wish{
    void greeting(){
        System.out.println("Hello, good morning.");
    }
}
