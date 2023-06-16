package com.example.jokeapp;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.List;

public class JokeApp {

    private Stage primaryStage;
    private List<String> jokes;

    public JokeApp(Stage primaryStage) {
        this.primaryStage = primaryStage;
        jokes = JokeRepository.getJokes();
    }

    public void start() {
        primaryStage.setTitle("СМЕШНО");

        JokeLabel jokeLabel = new JokeLabel(jokes);
        CustomButton newJokeButton = new CustomButton("Новый анекдот", jokeLabel::showNextJoke);
        CustomButton exitButton = new CustomButton("Выход", () -> primaryStage.close());

        VBox buttonBox = new VBox(10);
        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.getChildren().addAll(newJokeButton, exitButton);

        BorderPane root = new BorderPane();
        root.setCenter(jokeLabel);
        root.setBottom(buttonBox);

        Scene scene = new Scene(root, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.setAlwaysOnTop(true);
        primaryStage.show();

    }
}
