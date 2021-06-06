package com.game;

import com.model.Player;
import com.model.Skill;
import com.model.Type;

import java.util.Scanner;

public class Game {

    public void play() {
        System.out.println("Привет, герой, как тебя зовут?");
        Scanner scanner = new Scanner(System.in); // А можнно и из другого места вводить, к примеру
        String playerName = scanner.next();
        System.out.println(String.format("Круто, %s. Я очень рад тебя видеть", playerName));
        System.out.println("Я твой попутчик и помощник, Колезей");
        System.out.println("Да начнётся же наше путешествие");
        // И ещё какой-то текст о том, что бла бла бла, го уже иди куда-нибудь
        Player player = new Player(playerName);

        // У тебя есть 3 скилла - щит, атака или хил
        Skill shield = new Skill("Щит", "Блокирует 5 урона при след атаке противника", Type.SHIELD, 3);
        Skill fireAttack = new Skill("ФаирБолл", "Наносит 15 урона", Type.DAMAGE, 3);
        Skill health = new Skill("Восстановление здоровья", "Восстанавливает 5 здоровья", Type.HEALTH, 3);

        player.getSkills().add(shield);
        player.getSkills().add(fireAttack);
        player.getSkills().add(health);

        // И пока нет шмоток

        System.out.println("Ты можешь пойти прямо, налево и направо");
        System.out.println("Для этого введи 'вперед', 'лево', 'право'");
        System.out.println("Или 'выйти', если тебе эта игра не интересна");

        boolean gameResult = false;
        String way;
        way = scanner.next();
        while (!"выйти".equals(way)) {
            System.out.println("Ты решил пойти " + way + ", благородно. Тебя ожидает битва");
            // Битва и результат
            // И что-то дальше
        }

        System.out.println(gameResult ? "Ты победил" : "Ты проиграл");

    }
}
