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

public class AdminPanelController implements Initializable {

    @FXML
    private Button dashboard;
    @FXML
    private Button userReg;
    @FXML
    private Button userAcc;
    @FXML
    private Button requests;
    @FXML
    private Button logout;
    @FXML
    private Label status;
    @FXML
    private Pane titlePane;
    @FXML
    private GridPane dashboardPane;
    @FXML
    private GridPane userAccPane;
    @FXML
    private GridPane userRegPane;
    @FXML
    private GridPane userReqPane;
    @FXML
    private BorderPane mainPane;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }



    public void buttonClicks(ActionEvent event){
        if(event.getSource()==dashboard){
            status.setText("Dashboard");
            dashboardPane.toFront();
            titlePane.toFront();

        }
        else if(event.getSource()==userReg){
            status.setText("User Registration");
            userRegPane.toFront();
            titlePane.toFront();
        }
        else if(event.getSource()==userAcc){
            FxmlLoader obj=new FxmlLoader();
            Pane view= obj.getPage("userAccounts");
            mainPane.setCenter(view);
        }
        else if(event.getSource()==requests){
            status.setText("Requests");
            userReqPane.toFront();
            titlePane.toFront();
        }
        else if(event.getSource()==logout){
            FxmlLoader obj=new FxmlLoader();
            Pane view = obj.getPage("Trips");
            mainPane.setCenter(view);

        }

    }
}
