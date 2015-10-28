package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.awt.*;
import java.io.IOException;

/**
 * Created by Titusz Ozsváth on 2015-10-28.
 */
public class TabControl extends AnchorPane {
    @FXML private TextField textField;

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

    @FXML
    protected void doSomething() {
        System.out.println("The button was clicked!");
    }
}
