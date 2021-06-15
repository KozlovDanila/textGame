package com.factoires;

import com.model.Skill;
import com.model.SkillType;
import java.util.Arrays;
import java.util.List;

public class SkillFactory {

	private final static List<Skill> skills = Arrays.asList(
			new Skill("Щит", "Блокирует 5 урона при след атаке противника", SkillType.SHIELD, 3),
			new Skill("ФаирБолл", "Наносит 15 урона", SkillType.DAMAGE, 3),
			new Skill("Восстановление здоровья", "Восстанавливает 5 здоровья", SkillType.HEALTH, 3)
	);

	public static List<Skill> getAll() {
		return skills;
	}
}
