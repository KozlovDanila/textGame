package com.model;

import java.util.List;

public class Monster {

    private String name;
    private int health;
    private List<Skill> skills;

    public Monster(String name, int health, List<Skill> skills) {
        this.name = name;
        this.health = health;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}
