package com.factoires;

import com.model.Monster;
import com.model.Skill;
import com.model.SkillType;
import com.model.Way;

import java.util.ArrayList;
import java.util.Arrays;

public class MonsterFactory {

	private static final Skill SIMPLE_ATTACK = new Skill("Aтака", "простая на 7 урока", SkillType.DAMAGE, 7);
	private static final Skill SIMPLE_HEALTH = new Skill("Лечилка", "простая на 4 хп", SkillType.HEALTH, 4);
	private static final Skill SIMPLE_SHIELD = new Skill("Щит", "простой на 2 хп", SkillType.SHIELD, 2);
	private static final Skill TENTACLE_WHIP = new Skill("Удар щюпальцы", "бьёт на 4", SkillType.DAMAGE, 4);
	private static final Skill SCRATCH = new Skill("Царап", "бьёт на 20", SkillType.DAMAGE, 20);
	private static final Skill DESTROY = new Skill("КРУШИТЬ", "бьёт на 30", SkillType.DAMAGE, 30);

	public static Monster get(Way way) {
		switch (way) {
			case GO_LEFT:
				return new Monster("Рогатый малюск", 25, Arrays.asList(SIMPLE_ATTACK, TENTACLE_WHIP, SIMPLE_SHIELD));
			case GO_RIGHT:
				return new Monster("Могучий кошак", 50, Arrays.asList(SIMPLE_HEALTH, SCRATCH, SIMPLE_ATTACK));
			case GO_AHEAD:
				return new Monster("БОЛЬШОЙ ОГР", 100, Arrays.asList(SIMPLE_HEALTH, SIMPLE_ATTACK, SIMPLE_SHIELD, DESTROY, SIMPLE_ATTACK, SIMPLE_ATTACK, SIMPLE_ATTACK, SIMPLE_ATTACK));
			default:
				return new Monster("4", 1, new ArrayList<>());
		}
	}
}
