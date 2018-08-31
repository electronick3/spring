package ru.chagay.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component ("gun")
public class GunImpl implements Gun {
    @Autowired
    private Bullet bullet;

    public Bullet getBullet() {
        return bullet;
    }

    public void setBullet(Bullet bullet) {
        this.bullet = bullet;
    }

    public void Shot() {
        System.out.println("Огонь!");

        bullet.Pli();
    }
}
