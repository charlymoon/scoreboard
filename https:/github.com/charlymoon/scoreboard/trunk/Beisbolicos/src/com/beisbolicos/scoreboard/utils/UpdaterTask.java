/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beisbolicos.scoreboard.utils;

import com.beisbolicos.scoreboard.ScoreBoardController;
import com.delunasaenz.scoreboard.Game;
import com.delunasaenz.scoreboard.ScoreboardWS;
import com.delunasaenz.scoreboard.ScoreboardWSService;

import java.rmi.RemoteException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.rpc.ServiceException;

import javafx.beans.property.Property;
import javafx.beans.property.SimpleObjectProperty;
import javafx.concurrent.Task;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;

/**
 *
 * @author charly
 */
public class UpdaterTask extends Task<List<Game>> {

    private ScoreboardWSService service;
    public Property<List<Game>> juegos;
    private ChoiceBox leagueSelection;
    private DatePicker fechaSeleccion;

    public UpdaterTask() {
        juegos = new SimpleObjectProperty<>();
    }

    @Override
    protected List<Game> call() throws Exception {
        Thread.sleep(10000);
        List<Game> resultado = getListaActual(leagueSelection.getSelectionModel()
                .getSelectedIndex(), fechaSeleccion.getValue());
        return resultado;
    }

    @Override
    protected void succeeded() {
        try {
            juegos.setValue(this.get());
            UpdaterTask tsk = new UpdaterTask();
            tsk.setLeagueSelection(leagueSelection);
            tsk.setService(service);
            tsk.setJuegos(juegos);
            Thread thread = new Thread(tsk);
            thread.start();
            this.finalize();
        } catch (Throwable ex) {
            Logger.getLogger(ScoreBoardController.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
    }

    private List<Game> getListaActual(int indice, LocalDate fecha) {
        ScoreboardWS port=null;
		try {
			port = service.getScoreboardWSPort();
		} catch (ServiceException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
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
                liga="VWL";
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
        String mesReal = fecha.getMonthValue()<10?"0"+fecha.getMonthValue():"" +fecha.getMonthValue();
        String diaReal = fecha.getDayOfMonth()<10?"0"+fecha.getDayOfMonth():"" +fecha.getDayOfMonth();
        String fechaReal = fecha.getYear()+""+ mesReal+ "" + diaReal;
        Game[] result=new Game[0];
		try {
			result = port.byLeagueAndDate(liga, fechaReal);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        List<Game> resultList = Arrays.asList(result);
        return resultList;
    }

    public ScoreboardWSService getService() {
        return service;
    }

    public void setService(ScoreboardWSService service) {
        this.service = service;
    }

    public Property<List<Game>> getJuegos() {
        return juegos;
    }

    public void setJuegos(Property<List<Game>> juegos) {
        this.juegos = juegos;
    }

    public ChoiceBox getLeagueSelection() {
        return leagueSelection;
    }

    public void setLeagueSelection(ChoiceBox leagueSelection) {
        this.leagueSelection = leagueSelection;
    }

    public DatePicker getFechaSeleccion() {
        return fechaSeleccion;
    }

    public void setFechaSeleccion(DatePicker fechaSeleccion) {
        this.fechaSeleccion = fechaSeleccion;
    }
    
}
