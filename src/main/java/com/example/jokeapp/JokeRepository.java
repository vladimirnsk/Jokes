package com.example.jokeapp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JokeRepository {
    private static final String JOKES_FILE_PATH = "jokes.txt";

    public static List<String> getJokes() {
        List<String> jokes = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(JOKES_FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                jokes.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jokes;
    }
}
