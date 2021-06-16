package com.game;

import com.io.Phrase;
import com.model.Way;
import java.util.Arrays;
import java.util.List;

public class SecondPhaseGamePlay extends GamePlayPhase {

	private final String[] ways = {
			Way.GO_RIGHT.getLocalisation(),
			Way.GO_AHEAD.getLocalisation(),
			Way.EXIT.getLocalisation()
	};

	@Override
	protected void startPhaseAction() {
		dialog.out(Phrase.SECOND_WAY_START, ways);
	}

	@Override
	protected List<String> getWays() {
		return Arrays.asList(ways);
	}

}
