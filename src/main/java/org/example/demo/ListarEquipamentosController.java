package org.example.demo;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ListarEquipamentosController implements Initializable {

    protected void buttonListarEquipament() throws IOException {
        FXMLLoader fx = new FXMLLoader(ListarEquipamentosController.class.getResource("listarEquipamentos.fxml"));
        try {
            Scene s = new Scene(fx.load());
            Stage st = new Stage();
            st.setTitle("Lista de Equipamentos");
            st.setScene(s);
            st.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
