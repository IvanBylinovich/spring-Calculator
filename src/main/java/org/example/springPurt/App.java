package org.example.springPurt;

import org.example.entity.Calculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//java base
//annotation base
//xml

//constructor
//setter
//field

public class App {
    public static void main( String[] args ) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(RootConfiguration.class);
        Calculator calculator = (Calculator) applicationContext.getBean("calculator");
        calculator.run();

    }
}
