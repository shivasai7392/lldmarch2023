package com.scaler.designpatterns.prototyperegistry;

public class ConcretePrototype implements Prototype{

    private String field1;
    public ConcretePrototype(String field1) {
        this.field1 = field1;
    }

    public ConcretePrototype(ConcretePrototype prototype) {
        this.field1 = prototype.field1;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(this);
    }
}
