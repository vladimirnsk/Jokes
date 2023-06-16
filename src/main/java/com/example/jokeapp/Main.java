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
        Audio track = new Audio("track.wav", 50);
        track.play();
        launch(args);
    }
}
