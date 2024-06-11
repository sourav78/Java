package OOPS.Encapsulation;

import OOPS.AnotherPackage.Person;

public class MainInEncapsulation {

    //Static block is called before main method.
    static {
        System.out.println("Static block is called ");
    }

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.setAge(10);

        System.out.println(p1.getAge());


        //Static keyword example

        StaticKeyword.count = 25;

        StaticKeyword s2 = new StaticKeyword();
        System.out.println(s2.count);

        StaticKeyword s3 = new StaticKeyword();
        StaticKeyword s4 = new StaticKeyword();
        StaticKeyword s5 = new StaticKeyword();

        System.out.println("Total number of instance created: "+StaticKeyword.getNumberOfInstanceCreated());
    }
}
