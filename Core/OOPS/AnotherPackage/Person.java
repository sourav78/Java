package OOPS.AnotherPackage;

public class Person {
    private int age;
    private String name;

    boolean accessAge = false;

    public void setAge(int age){
        if(accessAge){
            this.age = age;
        }else {
            System.out.println("Age can not changed.");
        }
    }

    public int getAge(){
        return this.age;
    }
}
