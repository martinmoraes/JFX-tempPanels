package view.visitante;

import com.jfoenix.controls.JFXButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import view.menu.ControllerMenu;

public class ControllerVisitante {

    @FXML
    private Pane paneList;

    @FXML
    private Label numVisitantes;

    @FXML
    private Label lastVisit;

    @FXML
    private JFXButton btnCadastrar;

    @FXML
    private JFXButton btnEditar;

    @FXML
    private JFXButton btnApagar;

    @FXML
    private TableView<?> TableView;

    @FXML
    private TableColumn<?, ?> tcNome;

    @FXML
    private TableColumn<?, ?> tcCpf;

    @FXML
    private TableColumn<?, ?> tcRg;

    @FXML
    private TableColumn<?, ?> tcTelefone;

    @FXML
    private TableColumn<?, ?> tcEmail;

    @FXML
    private TableColumn<?, ?> tcData;

    @FXML
    private TextField txtBuscar;

    @FXML
    private Label Fechar;

    @FXML
    void Excluir(ActionEvent event) {
//    	ControllerMenu.borderpane.setCenter(arg0);
    }

    @FXML
    void Exit(MouseEvent event) {

    }

    @FXML
    void findByName(MouseEvent event) {

    }

    @FXML
    void handleClicks(ActionEvent event) {

    }

}
