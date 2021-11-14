package com.example.mainsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class EditCustomer {

    @FXML
    private AnchorPane EditCustomer;

    @FXML
    private Button cancel;
    Stage stage;


    @FXML
    void cancel(ActionEvent event) {
        stage = (Stage) EditCustomer.getScene().getWindow();
        stage.close();
    }

}
