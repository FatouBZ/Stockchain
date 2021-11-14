package com.example.mainsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class EditSupplier {

    @FXML
    private AnchorPane EditSupplier;

    @FXML
    private Button cancel;
    Stage stage;


    @FXML
    void cancel(ActionEvent event) {
        stage = (Stage) EditSupplier.getScene().getWindow();
        stage.close();
    }

}