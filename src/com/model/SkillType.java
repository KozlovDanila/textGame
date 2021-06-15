package com.model;

public enum SkillType {
    HEALTH(5),
    DAMAGE(15),
    SHIELD(5);

    private final int properties;

    SkillType(int properties) {
        this.properties = properties;
    }

    public int getProperties() {
        return properties;
    }
}
