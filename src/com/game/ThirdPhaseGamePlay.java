package com.game;

import com.factoires.WaysGetter;
import com.io.Phrase;

public class ThirdPhaseGamePlay extends GamePlayPhase {

	@Override
	protected void startPhaseAction() {
		dialog.out(Phrase.THIRD_WAY_START, WaysGetter.getWays());
	}
}
