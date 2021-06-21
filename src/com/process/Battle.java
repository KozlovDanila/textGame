package com.process;

import com.io.IDialog;
import com.io.Phrase;
import com.model.Monster;
import com.model.Player;
import com.model.Way;

public class Battle {

	protected final IDialog dialog;

	public Battle(IDialog dialog) {
		this.dialog = dialog;
	}

	public boolean fight(Player player, Monster monster, Way way) {
		dialog.out(Phrase.BATTLE_START, way.getLocalisation());

		boolean fightResult = true;


		dialog.out(fightResult ? Phrase.BATTLE_END_GOOD : Phrase.BATTLE_END_BAD);
		return fightResult;
	}
}
