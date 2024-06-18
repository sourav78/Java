public class Resursion {

    static int count = 0; //Global variable

    static void printCount(){
        if (count == 10) {  //Base condition
            return;
        }
        System.out.println(count);
        count++;
        printCount(); //Function calls itself
    }

    static void printNTo1(int n){
        if(n == 0)return;
        System.out.println(n);
        printNTo1(n-1);
    }

    public static void main(String[] args) {
        // printCount();

        printNTo1(10);
    }
}
