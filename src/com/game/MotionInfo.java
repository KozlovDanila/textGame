package com.game;

import com.model.SkillType;

public class MotionInfo {

	public SkillType type;
	public int value;

	public MotionInfo(SkillType type, int value) {
		this.type = type;
		this.value = value;
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
}
