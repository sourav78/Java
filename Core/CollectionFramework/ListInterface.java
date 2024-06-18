package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListInterface {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 6, 7, 5, 8));
        System.out.println(list);

        //get()
        System.out.println(list.get(0));
        System.out.println(list.get(1));

        //set()
        list.set(1, 100);
        list.set(list.size()-1, 1000);
        System.out.println(list);

        //add()
        list.add(2, 200);
        System.out.println(list);

        //remove()
        list.remove(0);
        System.out.println(list);

        //indexOf()
        System.out.println(list.indexOf(5));
        System.out.println(list.indexOf(500));

        //lastIndexOf()
        System.out.println(list.lastIndexOf(5));
        System.out.println(list.lastIndexOf(500));

        //iterator()
        Iterator<Integer> nums = list.iterator();
        while (nums.hasNext()){
            System.out.print(nums.next()+" ");
        }

        //listIterator()
        Iterator<Integer> nums2 = list.listIterator();
        System.out.println();
        while (nums2.hasNext()){
            System.out.print(nums2.next()+" ");
        }

        Iterator<Integer> nums3 = list.listIterator(4);
        System.out.println();
        while (nums3.hasNext()){
            System.out.print(nums3.next()+" ");
        }
        System.out.println();

        //subList()
        List<Integer> smallList = list.subList(4, list.size());
        System.out.println(smallList);

    }
}
