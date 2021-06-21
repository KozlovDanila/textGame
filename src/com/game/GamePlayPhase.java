package com.game;

import com.factoires.DialogFactory;
import com.factoires.ItemFactory;
import com.factoires.MonsterFactory;
import com.io.IDialog;
import com.io.Phrase;
import com.model.Item;
import com.model.Monster;
import com.model.Player;
import com.model.Way;
import com.process.Battle;
import com.process.PlayerHelper;

import java.util.List;

public abstract class GamePlayPhase {

	protected final PlayerHelper playerHelper = new PlayerHelper();
	protected final IDialog dialog = DialogFactory.get();

	private final Battle battle = new Battle(dialog);

	public GamePlayPhase() {
	}

	public boolean play(Player player) {
		Way way = getWay();
		if (Way.EXIT == way) {
			return false;
		}

		boolean fightResult = battle.fight(player, getMonster(way), way);
		if (!fightResult) {
			return false;
		}

		Item item = ItemFactory.get();
		dialog.out(Phrase.DROP_ITEM, item.getName());
		playerHelper.addItemToPlayer(player, item);
		return true;
	}

	protected abstract void startPhaseAction();

	protected abstract List<String> getWays();

	private Way getWay() {
		startPhaseAction();
		String way = dialog.in();
		while (!getWays().contains(way.toLowerCase())) {
			dialog.out(Phrase.REPEAT_WAY);
			way = dialog.in();
		}
		return Way.valueOfByLocalise(way);
	}

	private Monster getMonster(Way way) {
		return MonsterFactory.get(way);
	}
}