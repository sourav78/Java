package CollectionFramework;

import java.util.Enumeration;
import java.util.Vector;

public class Vectors {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();

        vector.addElement(10);
        vector.addElement(30);
        vector.addElement(60);
        vector.addElement(90);

        System.out.println(vector);

        //Iterating over vector
        Enumeration<Integer> vec = vector.elements();
        while (vec.hasMoreElements()){
            System.out.println(vec.nextElement());
        }
    }
}
