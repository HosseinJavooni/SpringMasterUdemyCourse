package com.javooni;

import com.javooni.config.ConfigClass;
import com.javooni.vehicle.Bmw;
import com.javooni.vehicle.Kia;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ConfigClass.class);
        System.out.println(context.getBean("sayHi"));
//        var bmw = context.getBean(Bmw.class); // ->return NoUniqueBeanDefinitionException exeption
        var bmw = context.getBean("bmw2",Bmw.class);
        System.out.println(bmw.getModel());
        var kia = context.getBean(Kia.class);
        System.out.printf(kia.getModel());
    }
}