package com.example.mainsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class DeleteProduct {

    @FXML
    private AnchorPane DeleteProduct;
    Stage stage;

    @FXML
    private Button cancel;

    @FXML
    void cancel(ActionEvent event) {
        stage = (Stage) DeleteProduct.getScene().getWindow();
        stage.close();
    }
    }

