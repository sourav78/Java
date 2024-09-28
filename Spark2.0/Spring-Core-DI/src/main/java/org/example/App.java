package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        Car car = new Car();
//        car.setEngine(new PetrolEngine());
//        car.drive();

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
        Car car = applicationContext.getBean(Car.class);
        car.drive();


    }
}
