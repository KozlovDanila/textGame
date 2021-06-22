package com.game;

import com.io.IDialog;
import com.io.Phrase;
import com.model.IHealth;
import com.model.Monster;
import com.model.Player;

public class Battle {

	protected final IDialog dialog;
	protected final IMotion playerMotion;
	protected final IMotion monsterMotion;

	public Battle(IDialog dialog) {
		this.dialog = dialog;
		playerMotion = new PlayerMotion(dialog);
		monsterMotion = new MonsterMotion(dialog);
	}

	public Battle(IDialog dialog, IMotion playerMotion, IMotion monsterMotion) {
		this.dialog = dialog;
		this.playerMotion = playerMotion;
		this.monsterMotion = monsterMotion;
	}

	public boolean fight(Player player, Monster monster) {
		boolean monsterFirst = whoFirst();

		LocalBattleResult localBattleResult = battleCheck(player, monster);
		while (localBattleResult.isPlay()) {

			if (monsterFirst) {
				dialog.out(Phrase.MONSTER_MOTION);
				doMotion(monsterMotion.motion(monster.getSkills(), monster.getAttack()), player.getHealthProcess(), monster.getHealthProcess());
			} else {
				dialog.out(Phrase.PLAYER_MOTION);
				doMotion(playerMotion.motion(player.getSkills(), player.getAttack()), monster.getHealthProcess(), player.getHealthProcess());
			}
			monsterFirst = !monsterFirst;
			localBattleResult = battleCheck(player, monster);

			dialog.out(Phrase.PLAYER_INFO, player);
			dialog.out(Phrase.MONSTER_INFO, monster);
		}

		boolean monsterWin = localBattleResult.isMonsterWin();
		dialog.out(monsterWin ? Phrase.BATTLE_END_BAD : Phrase.BATTLE_END_GOOD);
		return !monsterWin;
	}

	private boolean whoFirst() {
		return (int) (Math.random() * 2) == 1;
	}

	private void doMotion(MotionInfo motionInfo, IHealth damage, IHealth health) {
		int value = motionInfo.value;
		switch (motionInfo.type) {
			case DAMAGE:
				dialog.out(Phrase.DAMAGE, value);
				damage.minusHealth(value);
				break;
			case HEALTH:
				dialog.out(Phrase.HEALTH, value);
				health.addHealthFull(value);
				break;
			case SHIELD:
				dialog.out(Phrase.SHIELD, value);
				health.addHealthOver(value);
				break;
		}
	}

	public LocalBattleResult battleCheck(Player player, Monster monster) {
		if (player.getCurrentHealth() <= 0) {
			return new LocalBattleResult(false, true);
		}
		if (monster.getCurrentHealth() <= 0) {
			return new LocalBattleResult(false, false);
		}
		return new LocalBattleResult(true, false);
	}
}
