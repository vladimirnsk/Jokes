package com.example.jokeapp;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

import java.util.List;

public class JokeLabel extends Label {

    private List<String> jokes;
    private int currentIndex;

    public JokeLabel(List<String> jokes) {
        this.jokes = jokes;
        currentIndex = 0;
        setWrapText(true);
        setAlignment(Pos.CENTER);
        setFont(Font.font(16));
        showNextJoke();
    }

    public void showNextJoke() {
        if (currentIndex >= jokes.size()) {
            setText("Анекдоты кончились");
        } else {
            setText(jokes.get(currentIndex));
            currentIndex++;
        }
    }
}
