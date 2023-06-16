package com.example.jokeapp;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

public class JokeLabel extends Label {

    private String[] jokes;
    private int currentJokeIndex;

    public JokeLabel(String[] jokes) {
        this.jokes = jokes;
        currentJokeIndex = -1;

        setWrapText(true);
        setAlignment(Pos.CENTER);
        setFont(Font.font(16));
        showNextJoke();
    }

    public void showNextJoke() {
        currentJokeIndex++;
        if (currentJokeIndex >= jokes.length) {
            setText("Анекдоты кончились");
        } else {
            setText(jokes[currentJokeIndex]);
        }
    }
}
