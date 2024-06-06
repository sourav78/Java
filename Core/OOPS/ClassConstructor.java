package OOPS;

public class ClassConstructor {
    public static void main(String[] args) {

        Complex num1 = new Complex(3, 8);
        num1.printComplexNumber();

        //Constructor overloading

        ConstructorOverloadding overloadding = new  ConstructorOverloadding();
        ConstructorOverloadding overloadding2 = new  ConstructorOverloadding("Sourav");

    }
}

class Complex{
    int a;
    int b;

    public Complex(int num1, int num2){
        a = num1;
        b = num2;
    }

    public void printComplexNumber(){
        System.out.println(a+"+"+b+"i");
    }
}

class ConstructorOverloadding{
    public ConstructorOverloadding(){
        System.out.println("Hello, good morning");
    }

    public ConstructorOverloadding(String name){
        System.out.println("Hello "+name+", good morning");
    }
}