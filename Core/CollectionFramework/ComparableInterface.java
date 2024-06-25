package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableInterface {
    public static void main(String[] args) {

        Animal a1 = new Animal(9, "Bruno", 43);
        Animal a2 = new Animal(10, "Leo", 54);
        Animal a3 = new Animal(8, "Tommy", 13);
        Animal a4 = new Animal(13, "Chini", 53);
        Animal a5 = new Animal(8, "Muna", 14);

        ArrayList<Animal> dogs = new ArrayList<>();
        dogs.add(a1);
        dogs.add(a2);
        dogs.add(a3);
        dogs.add(a4);
        dogs.add(a5);



//        dogs.sort();
        Collections.sort(dogs);
        System.out.println(dogs);
    }
}

class Animal implements Comparable<Animal> {
    int age;
    String name;
    int weight;

    public Animal(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                "}\n";
    }

    @Override
    public int compareTo(Animal o) {
        if(this.age == o.age){
            return this.weight - o.weight;
        }
        return this.age - o.age;
    }
}
