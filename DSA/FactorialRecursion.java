import java.util.ArrayList;

public class FactorialRecursion {

    static long factorial(int i)
    {
        if(i==0 || i==1)
        return 1;
        else
        return i*factorial(i-1);
    }
    static ArrayList<Long> factorialNumbers(long n) {
        // code here
        ArrayList <Long> list = new ArrayList<>();
        int i=1;
        while(true)
        {
            long ans=factorial(i);
            if(ans>n)
            break;
            list.add(ans);
            i++;
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(factorialNumbers(888));
    }
}
