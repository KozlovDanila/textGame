package com.game;

import com.io.IDialog;
import com.io.Phrase;
import com.model.Skill;
import com.model.SkillType;

import java.util.List;

public class MonsterMotion implements IMotion {

	protected final IDialog dialog;

	public MonsterMotion(IDialog dialog) {
		this.dialog = dialog;
	}

	@Override
	public MotionInfo motion(List<Skill> skills, int attack) {
		Skill skill = skills.get((int) (Math.random() * skills.size()));
		dialog.out(Phrase.MONSTER_SKILL, skill);
		return new MotionInfo(skill.getType(), skill.getType() == SkillType.DAMAGE ? skill.getValue() + attack : skill.getValue());
	}
}
