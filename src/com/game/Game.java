package com.game;

import com.factoires.ItemFactory;
import com.factoires.SkillFactory;
import com.model.Item;
import com.model.Player;
import com.process.Battle;
import com.process.BattleResult;
import java.util.Scanner;

//TODO Полный рефакторинг всего. (Ввод/вывод информации; Систему шмоток)
public class Game {

    private final Battle battle = new Battle();

    public void play() {
        System.out.println("Привет, герой, как тебя зовут?");
        Scanner scanner = new Scanner(System.in); // А можнно и из другого места вводить, к примеру
        String playerName = scanner.next();
        System.out.println(String.format("Круто, %s. Я очень рад тебя видеть", playerName));
        System.out.println("Я твой попутчик и помощник, Колезей");
        System.out.println("Да начнётся же наше путешествие");
        // И ещё какой-то текст о том, что бла бла бла, го уже иди куда-нибудь
        Player player = new Player(playerName);
        player.getSkills().addAll(SkillFactory.getAll());

        System.out.println("Ты можешь пойти прямо, налево и направо");
        System.out.println("Для этого введи 'вперед', 'влево', 'вправо'");
        System.out.println("Или 'выйти', если тебе эта игра не интересна");

        boolean gameResult = false;
        String way;
        way = scanner.next();
        while (!"выйти".equals(way)) {
            boolean checkResult = checkWay();
            if (checkResult) {
                System.out.println("Ты ввел ерунду, введи занова");
            } else {
                System.out.println("Ты решил пойти " + way + ", благородно. Тебя ожидает битва");
                BattleResult fightResult = battle.fight();
                if (!fightResult.isResult()) {
                    break;
                }
                System.out.println("Битва была славной " + fightResult.getMessage());
                Item item = ItemFactory.get();
                System.out.println("Тебе выпала " + item.getName());
                addItemToPlayer(player, item);
                generateNextBattleMessage();
            }
            way = scanner.next();
        }

        System.out.println(gameResult ? "Ты победил" : "Ты проиграл");

    }

    private boolean checkWay() {
        // Проверка, что туда можн
        return false;
    }

    // Очень плохая реализация. Полностью переделать item-систему
    private void addItemToPlayer(Player player, Item item) {
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

    private void generateNextBattleMessage() {
        System.out.println("След битва, ты можешь пойти туда или туда");
    }
}
