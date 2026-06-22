package Encapsulation1;

public class EncapsulatedPerson {
    String name;
    int age;


    public EncapsulatedPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void personDetails(){
        System.out.println("Person name is "+this.name+" and age is "+this.age+" years.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
