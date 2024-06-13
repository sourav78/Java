package OOPS.ObjectClass;

import java.util.Objects;

class OneCar{
    String model;
    int year;

    public OneCar(String model, int year) {
        this.year = year;
        this.model = model;
    }

    //Here we override the equals method
    //Logic:- If the model and year have same value then return true otherwise false
    @Override
    public boolean equals(Object obj){
        OneCar othCar = (OneCar) obj;

        return this.model.equals(othCar.model) && this.year == othCar.year;
    }

    @Override
    public int hashCode(){
        return Objects.hash(model, year);
    }

    //Here we override the object class toString method.
    @Override
    public String toString(){
        return "Model: "+model+" and Year: "+year;
    }
}

public class ObjectClass {
    public static void main(String[] args) {

        OneCar car1 = new OneCar("GTR", 2023);
        OneCar car2 = new OneCar("GTR", 2023);

        System.out.println(car1.equals(car2));

        //Here the toString method implicitly called by object class
        System.out.println(car1);

        //Here we can get the same hashcode because we override the hashCode as model and year
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());

    }
}
