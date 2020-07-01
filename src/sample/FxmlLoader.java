package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.FileNotFoundException;
import java.net.URL;

public class FxmlLoader {

    private Pane view;

    public Pane getPage(String pageName){

        try {
            URL fileURl = Main.class.getResource("GUI/" + pageName + ".fxml");
            if (fileURl == null) {
                throw new FileNotFoundException("FXML file does not found");
            }
            view = new FXMLLoader().load(fileURl);
        }
        catch (Exception e){
            System.out.println("No page"+pageName);
        }
        return view;
    }


}
