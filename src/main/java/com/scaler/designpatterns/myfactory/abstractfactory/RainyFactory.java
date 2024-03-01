package com.scaler.designpatterns.myfactory.abstractfactory;

public class RainyFactory implements SeasonFactory{
    @Override
    public Bird getBird() {
        return new Parrot();
    }
}
