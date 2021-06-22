package com.factoires;

import com.model.Skill;
import com.model.SkillType;

import java.util.Arrays;
import java.util.List;

public class SkillFactory {

	private final static List<Skill> skills = Arrays.asList(
			new Skill("Щит", "Блокирует 5 урона при след атаке противника", SkillType.SHIELD, 5),
			new Skill("Атака", "Обычная атака 5 дамага", SkillType.DAMAGE, 5),
			new Skill("ФаирБолл", "Наносит 15 урона", SkillType.DAMAGE, 15),
			new Skill("Восстановление здоровья", "Восстанавливает 5 здоровья", SkillType.HEALTH, 5)
	);

	public static List<Skill> getAll() {
		return skills;
	}
}
