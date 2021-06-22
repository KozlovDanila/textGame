package com.game;

import com.factoires.WaysGetter;
import com.io.Phrase;

import java.util.Collection;

public class SecondPhaseGamePlay extends GamePlayPhase {

	@Override
	protected void startPhaseAction() {
		dialog.out(Phrase.SECOND_WAY_START, WaysGetter.getWays());
	}

}
