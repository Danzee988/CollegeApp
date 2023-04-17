package com.example.collegeapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private ImageView buisness;

    @FXML
    private ImageView it;

    @FXML
    private ImageView main;

    @FXML
    void buisnessbtn(ActionEvent event) {
        buisness.setVisible(true);
        it.setVisible(false);
        main.setVisible(false);
    }

    @FXML
    void itbtn(ActionEvent event) {
        buisness.setVisible(false);
        it.setVisible(true);
        main.setVisible(false);
    }

    @FXML
    void mainbtn(ActionEvent event) {
        buisness.setVisible(false);
        it.setVisible(false);
        main.setVisible(true);
    }


    @FXML
    private AnchorPane searchPn;

    @FXML
    private AnchorPane homePn;

    @FXML
    void search(ActionEvent event) {
        homePn.setVisible(false);
        searchPn.setVisible(true);
    }

    @FXML
    void home(ActionEvent event) {
        homePn.setVisible(true);
        searchPn.setVisible(false);
    }
}