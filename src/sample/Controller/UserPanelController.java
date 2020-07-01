package sample.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import sample.FxmlLoader;

import java.net.URL;
import java.util.ResourceBundle;

public class UserPanelController implements Initializable {

    @FXML
    private Button profile;
    @FXML
    private Button trips;
    @FXML
    private Button payment;
    @FXML
    private Button request;
    @FXML
    private Button logout;
    @FXML
    private Label status;
    @FXML
    private Pane titlePane;
    @FXML
    private GridPane profilePane;
    @FXML
    private GridPane tripsPane;
    @FXML
    private GridPane paymentPane;
    @FXML
    private GridPane requestPane;
    @FXML
    private BorderPane mainPane;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void buttonClicks(ActionEvent event){
        if(event.getSource()==profile){
            FxmlLoader obj=new FxmlLoader();
            Pane view = obj.getPage("userProfile");
            mainPane.setCenter(view);

        }
        else if(event.getSource()==trips){
            FxmlLoader obj=new FxmlLoader();
            Pane view = obj.getPage("yourTrips");
            mainPane.setCenter(view);
        }
        else if(event.getSource()==payment){
            FxmlLoader obj=new FxmlLoader();
            Pane view = obj.getPage("payment");
            mainPane.setCenter(view);
        }
        else if(event.getSource()==request){
            FxmlLoader obj=new FxmlLoader();
            Pane view = obj.getPage("request");
            mainPane.setCenter(view);
        }
        else if(event.getSource()==logout){


        }

    }
}
