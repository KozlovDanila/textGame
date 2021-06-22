package com.game;

import com.factoires.DialogFactory;
import com.io.IDialog;
import com.io.Phrase;
import com.model.Player;

public class Game {

    private final PlayerHelper playerHelper = new PlayerHelper();
    private final IDialog dialog = DialogFactory.get();
    private final GamePlay gamePlay = new GamePlay();

    public void play() {
        Player player = playerHelper.createPlayer();
        greetingAction();
        String playerName = getPlayerNameAction();
        player.setName(playerName);
        startJourneyAction(playerName);
        boolean gameResult = gamePlay.start(player);
        endGameAction(gameResult);
    }

    private void greetingAction() {
        dialog.out(Phrase.GREETING);
    }

    private String getPlayerNameAction() {
        return dialog.in();
    }

    private void startJourneyAction(String playerName) {
        dialog.out(Phrase.START_JOURNEY, playerName);
    }

    private void endGameAction(boolean gameResult) {
        dialog.out(gameResult ? Phrase.WIN : Phrase.LOSE);
    }
}
