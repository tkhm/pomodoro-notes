package dev.tkhm.tomato.services;

import javax.enterprise.context.ApplicationScoped;

import dev.tkhm.tomato.model.Fruit;

@ApplicationScoped
public class FruitsService {

    public Fruit getFruit() {
        Fruit yumFruit = new Fruit();
        yumFruit.setName("Mango");
        return yumFruit;
    }

}
