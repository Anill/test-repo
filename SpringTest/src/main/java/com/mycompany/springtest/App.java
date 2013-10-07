package com.mycompany.springtest;

import com.mycompany.springtest.domain.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("application-context.xml");
        Car car = (Car) context.getBean(Car.class);
        System.out.println("Name :" + " " + car.getModelName());
    }
}
