package com.scaler.designpatterns.prototyperegistry;

public class Client {
    public static void main(String[] args) {
        PrototypeRegistry registry = new PrototypeRegistry();
        registry.addPrototype("concrete prototype", new ConcretePrototype("value1"));
        registry.addPrototype("subclass prototype", new SubclassPrototype("value2", "value3"));

        Prototype copiedConcretePrototype = registry.getPrototype("concrete prototype");
        Prototype copiedSubclassPrototype = registry.getPrototype("subclass prototype");

    }
}
