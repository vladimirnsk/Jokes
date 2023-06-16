package com.example.jokeapp;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JokeApp {

    private Stage primaryStage;
    private String[] jokes;

    public JokeApp(Stage primaryStage) {
        this.primaryStage = primaryStage;
        jokes = new String[]{
                "1. Why don't scientists trust atoms? Because they make up everything!",
                "2. I'm reading a book about anti-gravity. It's impossible to put down!",
                "3. Why don't skeletons fight each other? They don't have the guts!",
                "4. Why did the scarecrow win an award? Because he was outstanding in his field!",
                "5. What do you call a fish wearing a crown? King mackerel!"
        };
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
        primaryStage.show();
    }
}
