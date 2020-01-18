package dev.tkhm.tomato.resources;

import javax.inject.Inject;
import javax.validation.Valid;

import dev.tkhm.tomato.api.FruitsApi;
import dev.tkhm.tomato.model.Fruit;
import dev.tkhm.tomato.services.FruitsService;

public class FruitsResource implements FruitsApi {
    @Inject
    FruitsService service;

    @Override
    public void fruitsDelete(@Valid Fruit fruit) {
        // TODO Auto-generated method stub
    }

    @Override
    public Fruit fruitsGet() {
        Fruit yumFruit = service.getFruit();
        return yumFruit;
    }

    @Override
    public void fruitsPost(@Valid Fruit fruit) {
        // TODO Auto-generated method stub
    }
}
