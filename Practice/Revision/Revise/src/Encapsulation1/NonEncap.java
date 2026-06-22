package Encapsulation1;

//No need to write import statement But when we try to call outside of the package thne we have to call import statement.

public class NonEncap {

    public static void main(String[] args) {
        EncapsulatedPerson encapsulatedPerson = new EncapsulatedPerson("so", 109);
        encapsulatedPerson.personDetails();
    }
}
