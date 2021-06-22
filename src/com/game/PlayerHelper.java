package com.game;

import com.factoires.SkillFactory;
import com.model.Item;
import com.model.Player;

public class PlayerHelper {

	public Player createPlayer() {
		return new Player(SkillFactory.getAll());
	}

	public void addItemToPlayer(Player player, Item item) {
		switch (item.getType()) {
			case HAT:
				player.setHat(item);
				break;
			case BOOTS:
				player.setBoots(item);
				break;
			case SWORD:
				player.setSword(item);
				break;
		}
	}

}
