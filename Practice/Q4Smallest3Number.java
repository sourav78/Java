public class Q4Smallest3Number {
    public static void main(String[] args) {
        
        System.out.println(smallestAmong3Number(3, 8, 1));
    }

    public static int smallestAmong3Number(int a, int b, int c){
        return Math.min(Math.min(a, b), c);
    }
}
