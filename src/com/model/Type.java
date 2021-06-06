package com.model;

public enum Type {
    HEALTH(5),
    DAMAGE(15),
    SHIELD(5);

    private final int properties;

    Type(int properties) {
        this.properties = properties;
    }

    public int getProperties() {
        return properties;
    }
}
