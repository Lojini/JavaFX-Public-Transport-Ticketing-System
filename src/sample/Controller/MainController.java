package sample.Controller;

import com.jfoenix.controls.JFXButton;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MainController {
    @FXML
    private Label dateTime;
    @FXML
    private JFXButton login;
    @FXML
    private JFXButton scanCard;
    @FXML
    private JFXButton ticket;
    @FXML
    private JFXButton button;

    public MainController(){

    }

    @FXML
    private void initialize() {
        initClock();
    }

    private void initClock() {

        Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm:ss a");
            dateTime.setText(LocalDateTime.now().format(formatter));
        }), new KeyFrame(Duration.seconds(1)));
        clock.setCycleCount(Animation.INDEFINITE);
        clock.play();
    }
    @FXML
    private void optBtnClick(ActionEvent event) throws Exception{
        final Node source = (Node) event.getSource();
        String resource="";
       if(source.getId().equals("login")){
            resource="../GUI/loginUI.fxml";
        }
       else if (source.getId().equals("scanCard")){
           resource="../GUI/scanCard.fxml";
       }
       else if (source.getId().equals("ticket")){
           resource="../GUI/ticket.fxml";
       }

        Scene mainScene= (Scene)((Node)event.getSource()).getScene();

        Parent newParent = FXMLLoader.load(getClass().getResource(resource));
        Scene newScene = new Scene(newParent,mainScene.getWidth(),mainScene.getHeight());


        Stage window = (Stage) mainScene.getWindow();
        window.setScene(newScene);
        window.show();

    }

}
