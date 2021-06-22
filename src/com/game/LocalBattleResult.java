package com.game;

public class LocalBattleResult {

	private boolean isPlay;
	private boolean isMonsterWin;

	public LocalBattleResult(boolean isPlay, boolean isMonsterWin) {
		this.isPlay = isPlay;
		this.isMonsterWin = isMonsterWin;
	}

	public boolean isPlay() {
		return isPlay;
	}

	public boolean isMonsterWin() {
		return isMonsterWin;
	}
}
