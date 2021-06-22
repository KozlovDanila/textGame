package com.game;

import com.model.IHealth;
import com.model.Unit;

public class HealthProcess implements IHealth {

	private final Unit unit;

	public HealthProcess(Unit unit) {
		this.unit = unit;
	}

	@Override
	public void addHealthFull(int health) {
		int newHealth = unit.getCurrentHealth() + health;
		if (newHealth > unit.getFullHealth()) {
			unit.setCurrentHealth(unit.getFullHealth());
		} else {
			unit.setCurrentHealth(newHealth);
		}
	}

	@Override
	public void addHealthOver(int health) {
		unit.setCurrentHealth(unit.getCurrentHealth() + health);
	}

	@Override
	public void minusHealth(int health) {
		unit.setCurrentHealth(unit.getCurrentHealth() - health);
	}
}
