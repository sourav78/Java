package OOPS.Abstraction;

public class FunctionalInterface {
    public static void main(String[] args) {

        Person p1 = () -> {
            System.out.println("Person is walking");
        };

        p1.walk();

        Running r1 = (int distance) -> {
            System.out.println("Total running "+distance+" KM.");
            return distance;
        };

        r1.run(50);

        Running r2 = (distance) -> 2*distance;
        System.out.println("Total distance covered "+r2.run(29)+" KM.");

    }
}

@java.lang.FunctionalInterface
interface Person{
    void walk();
}

@java.lang.FunctionalInterface
interface Running{
    int run(int distance);
}
