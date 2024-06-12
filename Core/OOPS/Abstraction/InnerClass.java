package OOPS.Abstraction;

public class InnerClass {


    public int data = 10;

    class Game{
        int size;
        String name;

        public Game(String name){
            this.name = name;
            System.out.println("Data is "+data);
        }

        void playing(){
            System.out.println("Now playing "+name);
        }
    }

    static class Playstation{
        int price;

        public Playstation(){
            System.out.println("Playing with playstation.");
//            System.out.println("Data is "+data); // gives error it is because the static nested class does not required you to create an instance of the outer class.
        }
    }

    public static void main(String[] args) {

        InnerClass innerClass = new InnerClass();
        Game game = innerClass. new Game("BGMI");
        game.size = 1500;
        game.playing();

        Playstation pl = new InnerClass.Playstation();
        pl.price = 50000;

    }
}
