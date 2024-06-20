
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Q11ContainsElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the element: ");
        int contain = list.indexOf(sc.nextInt());

        if (contain >= 0){
            System.out.println("Item was found on "+contain+" index.");
        }else {
            System.out.println("Item was not found.");
        }

        //
        if(list.contains(30)){
            System.out.println("Item was found.");
        }else {
            System.out.println("Item was not found.");
        }
    }
}
