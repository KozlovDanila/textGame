package com.model;

public class Skill {

    private String name;
    private String description;
    private SkillType type;
    private int value;

    public Skill(String name, String description, SkillType type, int value) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.value = value;
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

    public SkillType getType() {
        return type;
    }

    public void setType(SkillType type) {
        this.type = type;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return name + ". " + description;
    }
}
