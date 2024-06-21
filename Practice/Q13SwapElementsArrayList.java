import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q13SwapElementsArrayList {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Mango", "Orange", "Banana", "Kiwi", "Avocado", "Berry"));

        String fruit1 = "Banana";
        String fruit2 = "Mango";

        int fr = fruits.indexOf(fruit1);
        int sw = fruits.indexOf(fruit2);

        //Using Set method
//        fruits.set(fr, fruit2);
//        fruits.set(sw, fruit1);
//
//        System.out.println(fruits);

        //Using Collections Class
        Collections.swap(fruits, fr, sw);
        System.out.println(fruits);
    }
}
