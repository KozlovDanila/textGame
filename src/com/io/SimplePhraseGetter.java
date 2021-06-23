package com.io;

import java.util.HashMap;
import java.util.Map;

public class SimplePhraseGetter implements IPhraseGetter {

    private final Map<Phrase, String> values = new HashMap<Phrase, String>() {{
        put(Phrase.PLAYER_INFO, "Информация о тебе: %s");
        put(Phrase.MONSTER_INFO, "Информация о монстре: %s");

        put(Phrase.GREETING, "Привет, герой, как тебя зовут?");
        put(Phrase.START_JOURNEY, "Круто, %s. Я очень рад тебя видеть\nЯ твой попутчик и помощник, Колезей\nДа начнётся же наше путешествие");
        put(Phrase.REPEAT_WAY, "Вы ввели не неверное значение, введите новое!");

        put(Phrase.FIRST_WAY_START, "Ты можешь пойти: '%s', '%s', '%s' или '%s'");
        put(Phrase.SECOND_WAY_START, "Ты можешь пойти: '%s', '%s' или '%s'");
        put(Phrase.THIRD_WAY_START, "Ты можешь пойти теперь только '%s' или '%s'");

        put(Phrase.BATTLE_START, "Ты пошёл %s, удачного боя! Ты будешь сражаться с %s");
        put(Phrase.BATTLE_END_GOOD, "Битва кончилась! Ты победил!!!");
        put(Phrase.BATTLE_END_BAD, "Эх, ты проиграл, извини");

        put(Phrase.SKILL_SELECT, "Выбери скилл");
        put(Phrase.SELECTED_SKILL, "Вы выбрали %s");
        put(Phrase.BAD_SKILL_SELECT, "Вы выбрали плохой скилл. Введите занова");
        put(Phrase.SKILL_DESCRIPTION, "%d - %s");

        put(Phrase.MONSTER_SKILL, "Монстер использует - %s");
        put(Phrase.MONSTER_MOTION, "Ход монстра");
        put(Phrase.PLAYER_MOTION, "Ваш ход");

        put(Phrase.SHIELD, "Щит на %d");
        put(Phrase.DAMAGE, "Атака на %d");
        put(Phrase.HEALTH, "Хилка на %d");

        put(Phrase.DROP_ITEM, "Тебе выпала вещь - %s");
        put(Phrase.WIN, "Поздравляю, ты могучий воин и победил");
        put(Phrase.LOSE, "Соре, но ты проиграл :( ");
    }};

    @Override
    public String get(Phrase phrase) {
        return values.get(phrase);
    }
}
