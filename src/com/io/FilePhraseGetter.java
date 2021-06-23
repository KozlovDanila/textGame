package com.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class FilePhraseGetter implements IPhraseGetter {

    private final Map<Phrase, String> values = new HashMap<>();

    @Override
    public String get(Phrase phrase) {
        if (values.isEmpty()) {
            init();
        }
        return values.get(phrase);
    }

    private void init() {
        try {
            File file = new File("phrases.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            while (line != null) {
                String[] phrases = line.split("=");
                values.put(Phrase.valueOf(phrases[0]), phrases[1].replace("\\n", "\n"));
                line = reader.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
