package OOPS;

public class ThisKeyword {
    public static void main(String[] args) {

        Algo algo = new Algo(2, 3);
        algo.add();

    }
}

class Algo{
    int num1;
    int num2;

    public Algo(){
        System.out.println("Hello");
    }

    public Algo(int num1, int num2){
        this();
        this.num1 = num1;
        this.num2 = num2;

        this.add();
//        System.out.println(this); //OOPS.Algo@65ab7765
    }

    public void add(){
        System.out.println("Sum is: "+(num1+num2));
    }
}
