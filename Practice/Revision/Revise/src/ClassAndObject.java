public class ClassAndObject {
    public static void main(String[] args) {
        System.out.println("Hello Java");

        Car bmw = new Car("BMW M4", 1999, "dd");

//        bmw.showDetails();
        bmw.showDetails(false);
    }
}

class Car{
    String carName;
    int modelYear;
    String carNumber;

    //Create Constructor
    public Car(String carName, int modelYear) {
        this.carName = carName;
        this.modelYear = modelYear;
    }

    //Constructor Overriding
    public Car(String carName, int modelYear, String carNumber) {
        this.carName = carName;
        this.modelYear = modelYear;
        this.carNumber = carNumber;
    }

    public void showDetails(){
        String carInfo = "Car name is "+this.carName+" and manufactured in "+this.modelYear+" year";

        carInfo = (carNumber != null && !carNumber.isEmpty()) ? carInfo+" and car number is \""+carNumber+"\"" : carInfo;

        System.out.println(carInfo);
    }

    // Method Overriding
    public void showDetails(boolean isExtended){
        if(!isExtended){
            this.showDetails();
        }else {
            System.out.println("Car name is "+this.carName+". -----------");
            System.out.println("Manufactured in "+this.modelYear+" year. -------------");
            System.out.println("Car number is \""+carNumber+"\". ------------");
        }
    }
}
