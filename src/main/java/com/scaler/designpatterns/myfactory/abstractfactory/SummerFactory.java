package com.scaler.designpatterns.myfactory.abstractfactory;

public class SummerFactory implements SeasonFactory{
    @Override
    public Bird getBird() {
        return new Peacock();
    }
}
