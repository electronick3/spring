package ru.chagay.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        GunImpl gun = context.getBean("gun", GunImpl.class);
        gun.Shot();
    }
}
