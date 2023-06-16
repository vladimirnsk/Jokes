package com.example.jokeapp;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        JokeApp jokeApp = new JokeApp(primaryStage);
        jokeApp.start();
    }

    public static void main(String[] args) {
        Audio track = new Audio("sound.wav", 0);
        track.play();
        launch(args);
    }
}
