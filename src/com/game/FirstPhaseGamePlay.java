package com.game;

import com.io.Phrase;
import com.model.Way;
import java.util.Arrays;
import java.util.List;

public class FirstPhaseGamePlay extends GamePlayPhase {

	private final String[] ways = {
			Way.GO_LEFT.getLocalisation(),
			Way.GO_RIGHT.getLocalisation(),
			Way.GO_AHEAD.getLocalisation(),
			Way.EXIT.getLocalisation()
	};

	@Override
	protected void startPhaseAction() {
		dialog.out(Phrase.FIRST_WAY_START, ways);
	}

	@Override
	protected List<String> getWays() {
		return Arrays.asList(ways);
	}
}
