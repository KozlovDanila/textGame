package com.model;

public class Item {

    private int name;
    private int health;
    private int damage;

    public Item(int name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
