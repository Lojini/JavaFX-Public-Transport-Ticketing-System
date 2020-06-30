package sample.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginController {
    @FXML
    private void backBtnClick(ActionEvent event) throws Exception{
        final Node source = (Node) event.getSource();
        Scene mainScene= (Scene)((Node)event.getSource()).getScene();

        Parent newParent = FXMLLoader.load(getClass().getResource("../GUI/main.fxml"));
        Scene newScene = new Scene(newParent,mainScene.getWidth(),mainScene.getHeight());


        Stage window = (Stage) mainScene.getWindow();
        window.setScene(newScene);
        window.show();

    }
}
