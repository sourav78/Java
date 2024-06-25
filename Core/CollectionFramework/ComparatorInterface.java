package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ComparatorInterface {
    public static void main(String[] args) {
        Animal a1 = new Animal(9, "Bruno", 43);
        Animal a2 = new Animal(10, "Leo", 54);
        Animal a3 = new Animal(8, "Tommy", 13);
        Animal a4 = new Animal(13, "Chini", 53);
        Animal a5 = new Animal(8, "Muna", 13);

        ArrayList<Animal> dogs = new ArrayList<>();
        dogs.add(a1);
        dogs.add(a2);
        dogs.add(a3);
        dogs.add(a4);
        dogs.add(a5);

//        dogs.sort(new Comparator<Animal>() {
//            @Override
//            public int compare(Animal o1, Animal o2) {
//                if (Integer.compare(o1.weight, o2.weight) == 0){
//                    return o1.name.compareTo(o2.name);
//                }
//                return Integer.compare(o1.weight, o2.weight);
//            }
//        });


        //sort using custom comparator class
//        dogs.sort(new customComparator());

        //Lambda expression using comparator
//        dogs.sort((o1, o2) -> o1.name.compareTo(o2.name));

        //comparing
        dogs.sort(Comparator.comparing(Animal::getAge));

        //thenComparing() -> This method is used for chaining
        dogs.sort(Comparator.comparing(Animal::getAge).thenComparing(Animal::getName));

        System.out.println(dogs);

        int[][] arr = {
                {4, 3, 1},
                {5, 3, 1},
                {4, 6, 2}
        };

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[0] - o1[0];
            }
        });

        System.out.println(Arrays.deepToString(arr));
    }
}

class customComparator implements Comparator<Animal>{
    @Override
    public int compare(Animal o1, Animal o2) {
        if (Integer.compare(o1.age, o2.age) == 0){
            return o1.name.compareTo(o2.name);
        }
        return Integer.compare(o1.age, o2.age);
    }
}
