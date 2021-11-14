package com.example.mainsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class EditProduct {

    @FXML
    private AnchorPane EditProduct;

    @FXML
    private Button cancel;
    Stage stage;

    @FXML
    void cancel(ActionEvent event) {
        stage = (Stage) EditProduct.getScene().getWindow();
        stage.close();
    }
}
