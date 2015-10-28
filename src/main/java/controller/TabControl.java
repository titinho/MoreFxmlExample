package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

/**
 * Created by Titusz Ozsváth on 2015-10-28.
 */
public class TabControl extends AnchorPane {

    public Button btn;
    public Label label;

    public TabControl(){
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/tab.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }
    protected Button getButton(){
        return btn;
    }

    protected void setLabelText(String str){
        label.setText(str);
    }

    @FXML
    protected void tabOnAction() {
        btn.setText("admkasdlmasxalskd");
    }
}
