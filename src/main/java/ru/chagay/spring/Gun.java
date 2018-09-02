package ru.chagay.spring;

public interface Gun {

    Bullet getBullet();
    void setBullet(Bullet bullet);
    void shot();
}
