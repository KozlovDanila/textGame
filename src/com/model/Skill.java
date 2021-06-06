package com.model;

public class Skill {

    private String name;
    private String description;
    private Type type;
    private int castCount;

    public Skill(String name, String description, Type type, int castCount) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.castCount = castCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getCastCount() {
        return castCount;
    }

    public void setCastCount(int castCount) {
        this.castCount = castCount;
    }
}
