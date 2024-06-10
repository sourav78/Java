package OOPS;

public class FinalKeyword extends Cow {

    //This method override gives error because speed is initialized as final.
//    void speed(){
//        System.out.println("Cow can run only speed of 10 km/h.");
//    }
    public static void main(String[] args) {
        FinalKeyword cow = new FinalKeyword();
//        cow.legs = 5; // it gives error because legs is initialized as final.
        cow.printCow();
        cow.speed();
    }
}

class Cow{
    final int legs = 4;

    void printCow(){
        System.out.println("Cow has "+legs+" legs.");
    }

    final void speed(){
        System.out.println("Cow can run at the speed of 40 km/h.");
    }
}