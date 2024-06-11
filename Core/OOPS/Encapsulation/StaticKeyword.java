package OOPS.Encapsulation;

public class StaticKeyword {
    public static int count = 30;

    private static int numberOfInstanceCreated = 0;

    public StaticKeyword(){
        numberOfInstanceCreated += 1;
    }

    public void printCount(){
        System.out.println(count);
    }

    public static int getNumberOfInstanceCreated(){
//        printCount(); //Non-static method 'printCount()' cannot be referenced from a static context
        return numberOfInstanceCreated;
    }
}
