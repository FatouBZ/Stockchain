package com.example.mainsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class DeleteBranch {

    @FXML
    private AnchorPane DeleteBranch;

    @FXML
    private Button cancel;
    Stage stage;


    @FXML
    void cancel(ActionEvent event) {
        stage = (Stage) DeleteBranch.getScene().getWindow();
        stage.close();
    }

}