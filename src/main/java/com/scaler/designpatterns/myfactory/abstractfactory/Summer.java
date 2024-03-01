package com.scaler.designpatterns.myfactory.abstractfactory;

public class Summer implements Season{
    private final SummerFactory summerFactory;
    public Summer(SummerFactory summerFactory) {
        this.summerFactory = summerFactory;
    }

    @Override
    public Bird getBird() {
        return this.summerFactory.getBird();
    }
}
