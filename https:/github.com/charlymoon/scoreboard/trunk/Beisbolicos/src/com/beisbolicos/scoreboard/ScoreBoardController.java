/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beisbolicos.scoreboard;

import com.beisbolicos.scoreboard.utils.UpdaterTask;
import com.delunasaenz.scoreboard.Game;
import com.delunasaenz.scoreboard.ScoreboardWS;
import com.delunasaenz.scoreboard.ScoreboardWSService;
import com.delunasaenz.scoreboard.ScoreboardWSServiceLocator;

import java.awt.Desktop;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.rmi.RemoteException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;

/**
 *
 * @author charly
 */
public class ScoreBoardController implements Initializable {

	private final static String URLLocation = "http://www.beisbolicos.com:8081/ScoreboardApp/ScoreboardWSService";

	public ScoreboardWSService service;
	@FXML
	private ChoiceBox leagueSelection;
	@FXML
	private VBox vbScores;
	@FXML
	private DatePicker fechaSeleccion;
	@FXML
	private ImageView logo;

	@FXML
	private void handleButtonAction(ActionEvent event) {
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		String wsdlLocation = null;
		fechaSeleccion.setValue(LocalDate.now());

		wsdlLocation = URLLocation + "?wsdl";
		try {
			service = new ScoreboardWSServiceLocator(wsdlLocation,
					new QName("http://scoreboard.delunasaenz.com/", "ScoreboardWSService"));
		} catch (ServiceException ex) {
			Logger.getLogger(ScoreBoardController.class.getName()).log(Level.SEVERE, null, ex);
		}
		leagueSelection.getSelectionModel().select(0);
		leagueSelection.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> ov, Number t, Number t1) {
				actualizaLista(t1, fechaSeleccion.getValue());
			}
		});
		logo.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				if (event.getClickCount() == 1) {
					try {
						URL url = new URL("http://www.beisbolicos.com");
						Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
						desktop.browse(url.toURI());
					} catch (MalformedURLException ex) {
						Logger.getLogger(GameResultController.class.getName()).log(Level.SEVERE, null, ex);
					} catch (URISyntaxException | IOException ex) {
						Logger.getLogger(GameResultController.class.getName()).log(Level.SEVERE, null, ex);
					}
				}
			}
		});
		fechaSeleccion.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				int t1 = leagueSelection.getSelectionModel().getSelectedIndex();
				actualizaLista(t1, fechaSeleccion.getValue()); // To change body
																// of generated
																// methods,
																// choose Tools
																// | Templates.
			}
		});
		actualizaLista(leagueSelection.getSelectionModel().getSelectedIndex(), fechaSeleccion.getValue());
		UpdaterTask actualizador = new UpdaterTask();
		actualizador.setLeagueSelection(leagueSelection);
		actualizador.setFechaSeleccion(fechaSeleccion);
		actualizador.setService(service);
		actualizador.juegos.addListener(new ChangeListener<List<Game>>() {

			@Override
			public void changed(ObservableValue<? extends List<Game>> ov, List<Game> t, List<Game> t1) {
				actualizaJuegos(t1);
			}
		});
		Thread thread = new Thread(actualizador);
		thread.start();
	}

	private void actualizaLista(Number t1, LocalDate fecha) {
		List<Game> result = getListaActual(t1.intValue(), fecha);
		actualizaJuegos(result);
	}

	private List<Game> getListaActual(int indice, LocalDate fecha) {
		ScoreboardWS port=null;
		try {
			port = service.getScoreboardWSPort();
		} catch (ServiceException e1) {
			Logger.getLogger(ScoreBoardController.class.getName()).log(Level.SEVERE, null, e1);
			return null;
		}
		String liga;
		switch (indice) {
		case 0:
			liga = "MEX";
			break;
		case 1:
			liga = "LMP";
			break;
		case 2:
			liga = "VWL";
			break;
		case 3:
			liga = "DWL";
			break;
		case 4:
			liga = "PWL";
			break;
		case 5:
			liga = "MLB";
			break;
		case 6:
			liga = "SC";
			break;
		default:
			liga = "LMP";
			break;
		}
		String mesReal = fecha.getMonthValue() < 10 ? "0" + fecha.getMonthValue() : "" + fecha.getMonthValue();
		String diaReal = fecha.getDayOfMonth() < 10 ? "0" + fecha.getDayOfMonth() : "" + fecha.getDayOfMonth();
		String fechaReal = fecha.getYear() + "" + mesReal + "" + diaReal;
		List<Game> result = null;
		try {
			result = Arrays.asList(port.byLeagueAndDate(liga, fechaReal));
		} catch (RemoteException e) {
			Logger.getLogger(ScoreBoardController.class.getName()).log(Level.SEVERE, null, e);
		}
		return result;
	}

	private void actualizaJuegos(List<Game> result) {
		vbScores.getChildren().clear();

		result.stream().forEach((item) -> {
			FXMLLoader fxml = new FXMLLoader(
					getClass().getResource("/com/beisbolicos/" + "scoreboard/GameResult.fxml"));
			try {
				fxml.load();
				GameResultController grc = fxml.getController();
				vbScores.getChildren().add((Node) fxml.getRoot());
				grc.setGame(item);

			} catch (IOException ex) {
				Logger.getLogger(ScoreBoardController.class.getName()).log(Level.SEVERE, null, ex);
			}
		});
	}
}
