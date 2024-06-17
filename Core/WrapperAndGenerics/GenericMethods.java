package WrapperAndGenerics;

public class GenericMethods {

    static <S> void printData(S data){
        System.out.println(data);
        System.out.println(data.getClass());
    }

    public static void main(String[] args) {

        printData("sourav");
        printData(20);

        User user = new User();
        user.printUser("Jkkks");
        user.printUser(90973);
    }
}

class User{

    String s = new String();

    <U> void printUser(U user){
        System.out.println(user);
    }
}
