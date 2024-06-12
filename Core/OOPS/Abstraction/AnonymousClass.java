package OOPS.Abstraction;

public class AnonymousClass {

    Outer obj = new Outer(){
       void anonymousMethod(){
           System.out.println("This is anonymous method.");
       }
    };

    public static void main(String[] args) {

        MainInterface inter = new MainInterface() {
            @Override
            public void interfaceMethod() {
                System.out.println("This is interface method");
            }
        };

        inter.interfaceMethod();
    }

}

class Outer{
    void outerMethod(){
        System.out.println("This is outer method.");
    }
}

interface MainInterface{
    void interfaceMethod();
}
