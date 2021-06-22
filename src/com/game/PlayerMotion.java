package com.game;

import com.io.IDialog;
import com.io.Phrase;
import com.model.Skill;
import com.model.SkillType;

import java.util.List;

public class PlayerMotion implements IMotion {

	protected final IDialog dialog;

	public PlayerMotion(IDialog dialog) {
		this.dialog = dialog;
	}

	@Override
	public MotionInfo motion(List<Skill> skills, int attack) {
		printSkillsDescription(skills);
		Skill skill = getSelectedSkill(skills);
		dialog.out(Phrase.SELECTED_SKILL, skill);
		return new MotionInfo(skill.getType(), skill.getType() == SkillType.DAMAGE ? skill.getValue() + attack : skill.getValue());
	}

	private Skill getSelectedSkill(List<Skill> skills) {
		String skill = dialog.in();
		while (true) {
			try {
				return skills.get(Integer.parseInt(skill) - 1);
			} catch (Exception e) {
				dialog.out(Phrase.BAD_SKILL_SELECT);
				skill = dialog.in();
			}
		}
	}

	private void printSkillsDescription(List<Skill> skills) {
		dialog.out(Phrase.SKILL_SELECT);
		for (int i = 0; i < skills.size(); i++) {
			dialog.out(Phrase.SKILL_DESCRIPTION, i + 1, skills.get(i).toString());
		}
	}
}
