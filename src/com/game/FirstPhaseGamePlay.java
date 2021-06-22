package com.game;

import com.factoires.WaysGetter;
import com.io.Phrase;
import com.model.Way;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FirstPhaseGamePlay extends GamePlayPhase {

	@Override
	protected void startPhaseAction() {
		dialog.out(Phrase.FIRST_WAY_START, WaysGetter.getWays());
	}
}
