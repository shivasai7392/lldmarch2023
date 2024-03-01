package com.scaler.designpatterns.myfactory.abstractfactory;

public class Rainy implements Season{
    private final RainyFactory rainyFactory;

    public Rainy(RainyFactory rainyFactory) {
        this.rainyFactory = rainyFactory;
    }

    @Override
    public Bird getBird() {
        return this.rainyFactory.getBird();
    }
}
