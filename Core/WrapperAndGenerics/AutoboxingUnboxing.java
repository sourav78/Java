package WrapperAndGenerics;

public class AutoboxingUnboxing {
    public static void main(String[] args) {
        //Integer Autoboxing
        Integer i1 = Integer.valueOf(15);
        Integer i2 = Integer.valueOf("16"); //It also convert number string to number
        Integer i3 = 15;

        Character ch = Character.valueOf('c');
        Character ch2 = 'I';

        Boolean b1 = Boolean.valueOf(true);
        Boolean b2 = Boolean.valueOf("false");

        //Unboxing

        Integer it = Integer.valueOf("10");
        int pIt = it;

        Double dt = Double.valueOf(45.90);
        double pDt = dt;

        Boolean bt = Boolean.valueOf("false");
        boolean pBt = bt;

    }
}
