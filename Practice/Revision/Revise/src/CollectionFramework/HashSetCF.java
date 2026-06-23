package CollectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetCF {
    public static void main(String[] args) {

        // Creation of set
        Set<Integer> set = new TreeSet<>();

        // Add elements to set
        set.add(10);
        set.add(20);
        set.add(40);
        set.add(30);
        System.out.println("Set: "+set);

        set.add(10);

        // Remove elements from the set
        set.remove(30);
        System.out.println("After remove: "+set);

        // Contains -> check if anu element present in set or not
        System.out.println("Contains 20: "+set.contains(20));
        System.out.println("Contains 30: "+set.contains(30));

        // Check id set is empty or not
        System.out.println("Empty? "+set.isEmpty());

        // Size of the set
        System.out.println("Size: "+set.size());

        // Clear all value from the set
        set.clear();
        System.out.println("After clear: "+set);
        System.out.println("Empty? "+set.isEmpty());

        HashSet<DemoStudent> students = new HashSet<>();
        students.add(new DemoStudent("Sourav", 11));
        students.add(new DemoStudent("Sourav2", 12));
        students.add(new DemoStudent("Sourav3", 13));

        System.out.println(students);
    }
}
