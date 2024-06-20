import java.util.ArrayList;
import java.util.Arrays;

public class Q10ArrayListInsert {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        System.out.println(list);

        list.add(0, 100);
        System.out.println(list);
    }
}
