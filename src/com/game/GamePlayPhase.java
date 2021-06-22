package com.game;

import com.factoires.DialogFactory;
import com.factoires.ItemFactory;
import com.factoires.MonsterFactory;
import com.factoires.WaysGetter;
import com.io.IDialog;
import com.io.Phrase;
import com.model.Item;
import com.model.Monster;
import com.model.Player;
import com.model.Way;

import java.util.Arrays;

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
		Monster monster = getMonster(way);
		WaysGetter.removeWay(way);
		dialog.out(Phrase.BATTLE_START, way.getLocalisation(), monster);
		dialog.out(Phrase.PLAYER_INFO, player);
		dialog.out(Phrase.MONSTER_INFO, monster);
		boolean fightResult = battle.fight(player, monster);
		if (!fightResult) {
			return false;
		}

		player.resetHealth();
		Item item = ItemFactory.get();
		dialog.out(Phrase.DROP_ITEM, item.getName());
		playerHelper.addItemToPlayer(player, item);
		dialog.out(Phrase.PLAYER_INFO, player);
		return true;
	}

	protected abstract void startPhaseAction();

	protected Object[] getWays() {
		return WaysGetter.getWays();
	}

	private Way getWay() {
		startPhaseAction();
		String way = dialog.in();
		while (!Arrays.asList(getWays()).contains(way.toLowerCase())) {
			dialog.out(Phrase.REPEAT_WAY);
			way = dialog.in();
		}
		return Way.valueOfByLocalise(way);
	}

	private Monster getMonster(Way way) {
		return MonsterFactory.get(way);
	}
}