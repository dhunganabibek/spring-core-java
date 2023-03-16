package com.bibekdhungana;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("--------------started-----------------");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("car.xml");
        Car car = applicationContext.getBean("car", Car.class);

        System.out.println(car);
        System.out.println("--------------ended-----------------");
    }
}
