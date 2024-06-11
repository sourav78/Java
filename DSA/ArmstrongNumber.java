public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println(arm(371));
        System.out.println(arm(7292));
    }

    public static boolean arm (int n){
        int sum = 0;
        int temp = n;
        while(temp > 0){
          int ld = temp % 10;
          sum = sum + (ld*ld*ld);
          temp /= 10;
        }
    
        return n == sum ? true : false;
    }
}
