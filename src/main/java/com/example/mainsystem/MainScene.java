package com.example.mainsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;


import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;



    public class MainScene implements Initializable{
        @FXML
        private Pane content;



        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {

        }

        public void inventoryBtn(ActionEvent actionEvent) throws IOException {
            Parent fxml = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("inventory.fxml")));
            content.getChildren().removeAll();
            content.getChildren().setAll(fxml);


        }

      public void userbtn(javafx.event.ActionEvent actionEvent) throws IOException {
            Parent fxml = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("user.fxml")));
            content.getChildren().removeAll();
            content.getChildren().setAll(fxml);
        }
            public void stockbtn(javafx.event.ActionEvent actionEvent) throws IOException{
            Parent fxml = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("stock.fxml")));
            content.getChildren().removeAll();
            content.getChildren().setAll(fxml);

        }
        public void customerbtn(javafx.event.ActionEvent actionEvent) throws IOException{
            Parent fxml = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("customer.fxml")));
            content.getChildren().removeAll();
            content.getChildren().setAll(fxml);

        }
        public void productbtn(javafx.event.ActionEvent actionEvent) throws IOException{
            Parent fxml = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("product.fxml")));
            content.getChildren().removeAll();
            content.getChildren().setAll(fxml);

        }
        public void supplierbtn(javafx.event.ActionEvent actionEvent) throws IOException{
            Parent fxml = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("supplier.fxml")));
            content.getChildren().removeAll();
            content.getChildren().setAll(fxml);

        }
        public void branchbtn(javafx.event.ActionEvent actionEvent) throws IOException{
            Parent fxml = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("branch.fxml")));
            content.getChildren().removeAll();
            content.getChildren().setAll(fxml);

        }
    }