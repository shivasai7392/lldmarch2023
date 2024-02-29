package com.scaler.designpatterns.prototyperegistry;

import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry {
    private final Map<String, Prototype> prototypes = new HashMap<>();

    public void addPrototype(String key, Prototype prototype) {
        prototypes.put(key, prototype);
    }

    public Prototype getPrototype(String key) {
        return prototypes.get(key).clone();
    }
}
