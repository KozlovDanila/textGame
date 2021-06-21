package com.io.console;

import com.io.IPhraseGetter;
import com.io.Phrase;

import java.util.HashMap;
import java.util.Map;

public class ConsolePhraseGetter implements IPhraseGetter {

    private final Map<Phrase, String> values = new HashMap<Phrase, String>() {{
        put(Phrase.GREETING, "Привет, герой, как тебя зовут?");
        put(Phrase.START_JOURNEY, "Круто, %s. Я очень рад тебя видеть\nЯ твой попутчик и помощник, Колезей\nДа начнётся же наше путешествие");
        put(Phrase.REPEAT_WAY, "Вы ввели не неверное значение, введите новое!");

        put(Phrase.FIRST_WAY_START, "Ты можешь пойти прямо, налево и направо\nДля этого введи '%s', '%s', '%s'\nИли '%s', если тебе эта игра не интересна");
        put(Phrase.SECOND_WAY_START, "Ты можешь пойти прямо и направо\nДля этого введи '%s', '%s'\nИли '%s', если тебе эта игра не интересна");
        put(Phrase.THIRD_WAY_START, "Ты можешь пойти теперь только прямо\nДля этого введи '%s'\nИли '%s', если тебе эта игра не интересна");

        put(Phrase.BATTLE_START, "Ты пошёл %s, удачного боя!");
        put(Phrase.BATTLE_END_GOOD, "Битва кончилась! Ты победил!!!");
        put(Phrase.BATTLE_END_BAD, "Эх, ты проиграл, извини");

        put(Phrase.DROP_ITEM, "Тебе выпала вещь - %s");
        put(Phrase.WIN, "Поздравляю, ты могучий воин и победил");
        put(Phrase.LOSE, "Соре, но ты проиграл, ЛОХ!");
    }};

    @Override
    public String get(Phrase phrase) {
        return values.get(phrase);
    }
}
