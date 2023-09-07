package com.cgd.cgd;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.util.Objects;

public class Main extends Application {

    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        window = stage;
        window.setTitle("Title of window");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(8);
        grid.setHgap(10);

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("layout.fxml")));
        root.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

        window.setTitle("CGD");
        window.setScene(new Scene(root, 300, 275));
        window.show();
    }
}
