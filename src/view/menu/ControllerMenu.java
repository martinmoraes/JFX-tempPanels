package view.menu;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import view.visitante.ControllerVisitante;

public class ControllerMenu extends Application implements Initializable {

	@FXML
	private BorderPane borderpane;

	@FXML
	private Button btnMenus;

	@FXML
	private Button btnSettings;

	@FXML
	private JFXButton btnVisitante;

	@FXML
	private Button btnSignout;

	private Map<Object, String> mapPanels = new HashMap<Object, String>();

	@FXML
	void Exit(ActionEvent event) {
		System.exit(1);
	}

	@FXML
	public void trataMenu(ActionEvent actionEvent) {
		Object objeto = actionEvent.getSource();
//		Pane pane = carregaFXML(mapPanels.get(objeto));
		String fxml = mapPanels.get(objeto);
		FXMLLoader loaderFXML = new FXMLLoader(getClass().getResource(fxml));
		ControllerVisitante controllerVisitante = new ControllerVisitante(this);
		loaderFXML.setController(controllerVisitante);
		try {
			Pane pane = (Pane) loaderFXML.load();
			borderpane.setCenter(pane);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	// @FXML
	// private void handlePaisagemCalor(ActionEvent event) throws IOException{
	// Perfil perfil= new Perfil();
	//
	// perfil.setClima(1);
	// perfil.setPaisagem(0);
	//
	// FXMLLoader fxmlloader = new
	// FXMLLoader(getClass().getResource("/lisp/view/PaisagemCalor.fxml"));
	// // Definindo quem � o controller desse 'fxml':
	// fxmlloader.setController(new PaisagemCalorController(perfil));
	//
	// Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
	//
	// // Carregando o fxml na scene:
	// stage.setScene(new Scene(fxmlloader.load()));
	// stage.show();
	// }

	private Pane carregaFXML(String fxml) {
		try {
			return FXMLLoader.load(getClass().getResource(fxml));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		mapPanels.put(btnVisitante, "/view/visitante/VisitTela.fxml");
		mapPanels.put(btnMenus, "");
		mapPanels.put(btnSettings, "/view/visitante/VisitTela.fxml");

	}

	public void execute() {
		launch();
	}

	@Override
	public void start(Stage stage) {

		try {
			Pane pane = FXMLLoader.load(getClass().getResource("TelaMenu.fxml"));
			Scene sc = new Scene(pane);
			stage.setScene(sc);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
