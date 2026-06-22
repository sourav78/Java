package Encapsulation1;

class BikeSafety{

    public static String helmet = "My Helmet";
    public String CertificationNumber = "ISP1393jj";

    static {
        System.out.println("Wearing helmet"+helmet);
    }

    public void helmetName(){
        System.out.println(helmet);
    }

    public static void getHelmet(){
        System.out.println("Helmet is "+helmet);
//        System.out.println("Cerfti"+CertificationNumber); // Gives error that -> Non-static field 'CertificationNumber' cannot be referenced from a static contex
    }
}

public class StaticExample {
    public static void main(String[] args) {

        System.out.println("Helmet name is: "+BikeSafety.helmet);
    }
}
