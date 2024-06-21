import java.util.ArrayList;
import java.util.Arrays;

public class Q12Compare2ArrayList {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Mango", "Orange", "Banana", "Kiwi", "Avocado", "Berry"));

        ArrayList<String> subFruits = new ArrayList<>(Arrays.asList("Mango", "Banana", "Kiwi", "Berry"));

        for (String fruit : fruits){
            boolean available = subFruits.contains(fruit);
            System.out.println(fruit+" : "+available);
        }

    }
}
