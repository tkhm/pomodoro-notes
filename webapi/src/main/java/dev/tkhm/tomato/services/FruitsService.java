package dev.tkhm.tomato.services;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import dev.tkhm.tomato.entities.MiniTask;
import dev.tkhm.tomato.model.Fruit;

@ApplicationScoped
public class FruitsService {

    @Inject
    EntityManager em;

    public Fruit getFruit() {
        Fruit yumFruit = new Fruit();

        TypedQuery<MiniTask> query = em.createQuery("SELECT mt FROM MiniTask mt", MiniTask.class);
        MiniTask result = query.getSingleResult();
        yumFruit.setName(result.content);
        return yumFruit;
    }

}
