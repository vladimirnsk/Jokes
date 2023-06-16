package com.example.jokeapp;

import javafx.scene.control.Button;

public class CustomButton extends Button {

    public CustomButton(String text, Runnable action) {
        super(text);
        setOnAction(event -> action.run());
    }
}
