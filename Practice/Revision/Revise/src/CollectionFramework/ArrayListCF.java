package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCF {
    public static void main(String[] args) {

        // Create New Arraylist
        ArrayList<Integer> list = new ArrayList<>();
        
        // Add new element to array
        list.add(1);
        list.add(3);
        list.add(2);
        System.out.println("After Add "+list);

        // Add new element in specific position
        list.add(1, 4);
        System.out.println("Specific index "+list);

        // Get size of the list -> size
        System.out.println("List size: "+list.size());

        // add a whole new list in array -> addAll()
        ArrayList<Integer> shortList = new ArrayList<>();
        shortList.add(5);
        shortList.add(6);

        list.addAll(shortList);
        System.out.println("Adding whole list"+list);

        // add a whole new list in array in specific position -> addAll()
        ArrayList<Integer> shortList2 = new ArrayList<>();
        shortList2.add(7);
        shortList2.add(8);

        list.addAll(2, shortList2);
        System.out.println("Adding whole list specific "+list);

        // Get a value from a specific index -> get()
        System.out.println("Get Value "+list.get(2));
        System.out.println("Get 1st Value "+list.getFirst());
        System.out.println("Get last Value "+list.getLast());

        // Remove element from a specific index the list
//        list.remove(1);
//        System.out.println("After remove "+list);
//
//        // Remove specific element from the list
//        list.remove(Integer.valueOf(6));
//        System.out.println("Remove specific "+list);
//
//        // Remove all the elements from the list -> clear()
//        list.clear();
//        System.out.println("After Clear "+list);

        // Update value in a specific position in the array
        list.set(list.size()-2, 222);
        System.out.println("After set "+list);

        // Check if element present in the array or not
        System.out.println("Contains 7: "+list.contains(7));
        System.out.println("Contains 38: "+list.contains(38));

        // Iterate through the list
//        for (int i = 0; i < list.size(); i++){
//            System.out.println("ele: "+ list.get(i));
//        }

        // Iterate using for each loop
//        for (Integer element: list){
//            System.out.println("E: " + element);
//        }

        // Iterate using Iterator
        Iterator<Integer> elements = list.iterator();
//        while (elements.hasNext()){
//            System.out.println("Iterate: "+elements.next());
//        }

        // Check if list is empty or not
        System.out.println("Empty? "+list.isEmpty());

        //
        System.out.println("Sublist: "+list.subList(0, 3));

        System.out.println(list);
    }
}
