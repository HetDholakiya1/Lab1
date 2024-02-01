package com.example.lab1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BookApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Book GUI");

        // Create components
        TextField titleTextField = new TextField();
        TextField authorTextField = new TextField();
        Button submitButton = new Button("Submit");
        Label resultLabel = new Label();

        // Set action for the submit button
        submitButton.setOnAction(e -> {
            // Get data from text fields
            String title = titleTextField.getText();
            String author = authorTextField.getText();

            // Instantiate the Book class
            Book book = new Book(title, author);

            // Display the result
            resultLabel.setText("Book created: " + book.toString());
        });

        // Create layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10));
        layout.getChildren().addAll(
                new Label("Title:"),
                titleTextField,
                new Label("Author:"),
                authorTextField,
                submitButton,
                resultLabel
        );

        // Set up the scene
        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }

    // Simple Book class for demonstration purposes
    private static class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        @Override
        public String toString() {
            return "Title: " + title + ", Author: " + author;
        }
    }
}

