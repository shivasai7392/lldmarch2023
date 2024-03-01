package com.scaler.designpatterns.myfactory.abstractfactory;

public class Winter implements Season{
    private final WinterFactory winterFactory;

    public Winter(WinterFactory winterFactory) {
        this.winterFactory = winterFactory;
    }

    @Override
    public Bird getBird() {
        return this.winterFactory.getBird();
    }
}
