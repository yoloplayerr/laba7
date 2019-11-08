package sample1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Попадание в область");
        primaryStage.setScene(new Scene(root, 534, 376));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}