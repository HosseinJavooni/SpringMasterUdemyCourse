package com.javooni.config;

import com.javooni.vehicle.Bmw;
import com.javooni.vehicle.Kia;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass {
    @Bean
    String sayHi(){
        return "HiSpring";
    }
    @Bean
    public Bmw bmw(){
        var bmw = new Bmw();
        bmw.setModel("2008");
        return bmw;
    }
    @Bean
    public Bmw bmw2(){
        var bmw = new Bmw();
        bmw.setModel("2010");
        return bmw;
    }
    @Bean
    public Kia kia(){
        var kia = new Kia();
        kia.setModel("Optima");
        return kia;
    }
}
