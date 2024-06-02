package org.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class SecondaryController implements Initializable {
    @FXML
    private Label lblMostrar;

    @FXML
    private void btnFuncionou(ActionEvent event){
        lblMostrar.setText("Funcionou");
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
