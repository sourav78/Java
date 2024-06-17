package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListCollection {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        //add()
        list.add(1);
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        //size()
        System.out.println(list.size());

        //isEmpty()
        System.out.println(list.isEmpty());

        //contains()
        System.out.println(list.contains(20));
        System.out.println(list.contains(200));

        //remove()
        list.remove(Integer.valueOf(20)); //Remove the Object from the list
//        list.remove(1); //Remove index from the array list
        System.out.println(list);

        //containsAll()
        List<Integer> l1 = new ArrayList<>(Arrays.asList(5, 6, 7, 8));
        System.out.println(list.containsAll(l1));

        //addAll()
        list.addAll(l1);
        System.out.println(list);

        //removeAll()
        list.removeAll(new ArrayList<>(Arrays.asList(1, 6)));
        System.out.println(list);

        //retainAll()
        list.retainAll(new ArrayList<>(Arrays.asList(10, 30, 8)));
        System.out.println(list);

        //clear()
        list.clear();
        System.out.println(list);
    }
}
