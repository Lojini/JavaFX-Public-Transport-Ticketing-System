package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("GUI/main.fxml"));
        primaryStage.getIcons().add(new Image("assets/Logo.jpg"));
        primaryStage.setScene(new Scene(root, 960, 720));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
