public class TypeCasting {
    public static void main(String[] args) {
        
        double price = 111.90;

        int newPrice = (int) price;

        System.out.println(newPrice);

        int myNum = 192;
        String strNum = Integer.toString(myNum);
        System.out.println(strNum);
    }
}
