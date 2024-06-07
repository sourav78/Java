public class Q7AnimalSound {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();

        animal.makeSound();
        cat.makeSound();
    }
}

class Cat extends Animal {
    void makeSound(){
        System.out.println("Cat make cute sound.");
    }
}

class Animal{
    void makeSound(){
        System.out.println("Animals make different sound.");
    }
}
