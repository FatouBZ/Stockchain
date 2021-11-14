package com.example.mainsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AddProduct {
    @FXML
    private Button cancel;
    @FXML
    private AnchorPane AddProduct;
    Stage stage;


    public void cancel(ActionEvent actionEvent) {
        stage = (Stage) AddProduct.getScene().getWindow();
        stage.close();
    }
}