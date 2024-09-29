package org.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Dependency Injection using spring core
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        Car car = new Car();
//        car.setEngine(new PetrolEngine());
//        car.drive();

        //IOC -> Using Application
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
//        Car car = applicationContext.getBean(Car.class);
//        car.drive();

        //IoC -> Bean Factory -> Deprecated & removed
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("Beans.xml");
        Car car = (Car) beanFactory.getBean(Car.class);
        car.drive();
    }
}
