package com.model;

import com.game.HealthProcess;

import java.util.ArrayList;
import java.util.List;

public class Player implements Unit {

	private static final int HEALTH = 100;
	private static final int ATTACK = 10;

	private String name;
	private int currentHealth;
	private int fullHealth;
	private int damage;
	private List<Skill> skills;
	private Item hat = Item.EMPTY_ITEM;
	private Item boots = Item.EMPTY_ITEM;
	private Item sword = Item.EMPTY_ITEM;
	private final IHealth healthProcess;

	public Player(String name) {
		this.name = name;
		this.currentHealth = HEALTH;
		this.fullHealth = HEALTH;
		this.damage = ATTACK;
		this.skills = new ArrayList<>();
		this.healthProcess = new HealthProcess(this);
	}

	public Player(List<Skill> skills) {
		this.currentHealth = HEALTH;
		this.fullHealth = HEALTH;
		this.damage = ATTACK;
		this.skills = skills;
		this.healthProcess = new HealthProcess(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int getCurrentHealth() {
		return currentHealth;
	}

	public void setCurrentHealth(int currentHealth) {
		this.currentHealth = currentHealth;
	}

	@Override
	public int getFullHealth() {
		return fullHealth;
	}

	public void resetHealth() {
		this.currentHealth = fullHealth;
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
		addHealthAndDamage(hat);
		this.hat = hat;
	}

	public Item getBoots() {
		return boots;
	}

	public void setBoots(Item boots) {
		addHealthAndDamage(boots);
		this.boots = boots;
	}

	public Item getSword() {
		return sword;
	}

	public void setSword(Item sword) {
		addHealthAndDamage(sword);
		this.sword = sword;
	}

	public IHealth getHealthProcess() {
		return healthProcess;
	}

	public int getAttack() {
		return damage;
	}

	private void addHealthAndDamage(Item item) {
		damage += item.getDamage();
		fullHealth += item.getHealth();
		currentHealth += item.getHealth();
	}

	@Override
	public String toString() {
		return "Имя - " + name + ", " + "хп - " + currentHealth + ", атака - " + damage;
	}
}
