package com.scaler.designpatterns.myfactory.abstractfactory;

public class WinterFactory implements SeasonFactory{
    @Override
    public Bird getBird() {
        return new Penguin();
    }
}
