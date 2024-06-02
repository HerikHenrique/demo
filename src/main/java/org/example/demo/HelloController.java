package org.example.demo;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        FXMLLoader fx = new FXMLLoader(HelloController.class.getResource("/org/example/demo/test.fxml"));
        try {
            Scene s = new Scene(fx.load());
            Stage st = new Stage();
            st.setTitle("Segunda Tela");
            st.setScene(s);
            st.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
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

    @FXML
    protected void buttonReservar() throws IOException {
        FXMLLoader fx = new FXMLLoader(ListarEquipamentosController.class.getResource("reservar.fxml"));
        try {
            Scene s = new Scene(fx.load());
            Stage st = new Stage();
            st.setTitle("Reserva de Equipamentos");
            st.setScene(s);
            st.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    protected void buttonListarReservas() throws IOException {
        FXMLLoader fx = new FXMLLoader(ListarEquipamentosController.class.getResource("listareserva.fxml"));
        try {
            Scene s = new Scene(fx.load());
            Stage st = new Stage();
            st.setTitle("Listar Equipamentos Reservados");
            st.setScene(s);
            st.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    protected void buttonZerarReservas() throws IOException {
        FXMLLoader fx = new FXMLLoader(ListarEquipamentosController.class.getResource("zerar-reservas.fxml"));
        try {
            Scene s = new Scene(fx.load());
            Stage st = new Stage();
            st.setTitle("Zerar Reservas");
            st.setScene(s);
            st.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    protected void buttonAdicionarEquipamentos() throws IOException {
        FXMLLoader fx = new FXMLLoader(ListarEquipamentosController.class.getResource("adicionar-equipamentos.fxml"));
        try {
            Scene s = new Scene(fx.load());
            Stage st = new Stage();
            st.setTitle("Zerar Reservas");
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