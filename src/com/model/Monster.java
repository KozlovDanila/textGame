package com.model;

import com.game.HealthProcess;

import java.util.List;

public class Monster implements Unit {

	private String name;
	private int currentHealth;
	private int fullHealth;
	private List<Skill> skills;
	private IHealth healthProcess;

	public Monster(String name, int currentHealth, List<Skill> skills) {
		this.name = name;
		this.currentHealth = currentHealth;
		this.fullHealth = currentHealth;
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

	@Override
	public void setCurrentHealth(int currentHealth) {
		this.currentHealth = currentHealth;
	}

	@Override
	public int getFullHealth() {
		return fullHealth;
	}

	@Override
	public int getAttack() {
		return 0;
	}

	public void setFullHealth(int fullHealth) {
		this.fullHealth = fullHealth;
	}

	public List<Skill> getSkills() {
		return skills;
	}

	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}

	public IHealth getHealthProcess() {
		return healthProcess;
	}

	@Override
	public String toString() {
		return name + " " + currentHealth + " хп";
	}
}
