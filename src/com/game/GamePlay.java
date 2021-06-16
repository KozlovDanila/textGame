package com.game;

import com.model.Player;
import java.util.Arrays;
import java.util.List;

public class GamePlay {

	private List<GamePlayPhase> phases = Arrays.asList(
			new FirstPhaseGamePlay(),
			new SecondPhaseGamePlay(),
			new ThirdPhaseGamePlay()
	);

	public boolean start(Player player) {
		for (GamePlayPhase phase : phases) {
			boolean result = phase.play(player);
			if (!result) {
				return false;
			}
		}
		return true;
	}
}
