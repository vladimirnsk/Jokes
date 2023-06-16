package com.example.jokeapp;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

public class JokeLabel extends Label {

    private String[] jokes;
    private int currentIndex;

    public JokeLabel(String[] jokes) {
        this.jokes = jokes;
        currentIndex = 0;
        setWrapText(true);
        setAlignment(Pos.CENTER);
        setFont(Font.font(16));
        showNextJoke();
    }

    public void showNextJoke() {
        if (currentIndex >= jokes.length) {
            setText("Анекдоты кончились");
        } else {
            setText(jokes[currentIndex]);
            currentIndex++;
        }
    }
}
