package ru.chagay.spring;

import org.springframework.stereotype.Component;

@Component("bullet")
public class BulletImpl implements Bullet {

    public void Pli() {
        System.out.println("Пли!!!");
    }
}
