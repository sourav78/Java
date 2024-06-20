import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Q9ArrayListIteration {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        for (Integer it : list){
            System.out.println(it);
        }

        Iterator<Integer> iterate = list.listIterator();

        while (iterate.hasNext()){
            System.out.println(iterate.next());
        }

    }
}
