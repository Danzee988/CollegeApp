package com.example.collegeapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class HelloController {

    String selectedBuilding = "";

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
    public void businessbtn() {
        buisness.setVisible(true);
        it.setVisible(false);
        main.setVisible(false);
        selectedBuilding = "Business Building";
    }

    @FXML
    void itbtn(ActionEvent event) {
        buisness.setVisible(false);
        it.setVisible(true);
        main.setVisible(false);
        selectedBuilding = "IT Building";
    }

    @FXML
    void mainbtn(ActionEvent event) {
        buisness.setVisible(false);
        it.setVisible(false);
        main.setVisible(true);
        selectedBuilding = "Main Building";
    }


    @FXML
    private AnchorPane searchPn;

    @FXML
    private AnchorPane homePn;

    @FXML
    private AnchorPane menuPn;

    @FXML
    void search(ActionEvent event) {
        homePn.setVisible(false);
        searchPn.setVisible(true);
        menuPn.setVisible(false);
    }

    @FXML
    void home(ActionEvent event) {
        homePn.setVisible(true);
        searchPn.setVisible(false);
        menuPn.setVisible(false);
    }

    @FXML
    void menubtn(ActionEvent event) {
        menuPn.setVisible(true);
        homePn.setVisible(false);
        searchPn.setVisible(false);
    }

    public String getSelectedBuilding() {
        return selectedBuilding;
    }
}