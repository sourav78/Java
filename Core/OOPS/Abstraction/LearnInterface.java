package OOPS.Abstraction;

public class LearnInterface {
    public static void main(String[] args) {

        Monkey monkey = new Monkey();
        monkey.eat();
        monkey.drink();

        monkey.BePet();
    }
}

interface Pet{
    void BePet();
    void eat();
}

interface Animal{
    void eat();
    default void drink(){
        System.out.println("Drinks Water");
    }
}

class Monkey implements Animal, Pet{

    @Override
    public void eat() {
        System.out.println("Monkey eats Banana");
    }

    @Override
    public void BePet() {
        System.out.println("Monkey might be a pet");
    }
}