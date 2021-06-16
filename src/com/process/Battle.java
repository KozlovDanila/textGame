package com.process;

import com.model.Monster;

public class Battle {

	public BattleResult fight(Monster monster) {
		// System.out.println("Ты решил пойти " + way + ", благородно. Тебя ожидает битва"); Это можно вынести в бой
		return new BattleResult(true, "Ты победил");
//		System.out.println("Битва была славной " + fightResult.getMessage()); Это можно вынести в бой
	}
}
