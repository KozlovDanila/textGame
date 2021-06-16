package com.model;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;
    private int health;
    private List<Skill> skills;
    private Item hat;
    private Item boots;
    private Item sword;

    public Player(String name) {
        this.name = name;
        this.health = 100;
        this.skills = new ArrayList<>();
    }

    public Player(List<Skill> skills) {
        this.health = 100;
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

    public Item getHat() {
        return hat;
    }

    public void setHat(Item hat) {
        this.hat = hat;
    }

    public Item getBoots() {
        return boots;
    }

    public void setBoots(Item boots) {
        this.boots = boots;
    }

    public Item getSword() {
        return sword;
    }

    public void setSword(Item sword) {
        this.sword = sword;
    }
}
