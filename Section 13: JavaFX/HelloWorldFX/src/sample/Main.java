package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;


import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{//abstract method in Application class
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

////        below code to use without fxml file
//        GridPane root= new GridPane();
//        root.setAlignment(Pos.CENTER);
//        root.setVgap(10);
//        root.setHgap(10);
//
//        Label greeting = new Label("Welcome to JavaFX!");
//        greeting.setTextFill(Color.GREEN);
//        greeting.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 60));
//        root.getChildren().add(greeting);//returns a list of the children and add a label control to the list

        primaryStage.setTitle("Hello JavaFX");
        primaryStage.setScene(new Scene(root, 700, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
