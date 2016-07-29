/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beisbolicos.scoreboard;

import com.delunasaenz.scoreboard.Game;
import com.delunasaenz.scoreboard.ScoreboardWSService;
import java.awt.Desktop;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javax.annotation.Resource;
import javax.xml.ws.WebServiceContext;

/**
 * FXML Controller class
 *
 * @author charly
 */
public class GameResultController implements Initializable {

    private Game game;
    @FXML
    private Label eVisitante;
    @FXML
    private Label eLocal;
    @FXML
    private Label lInning;
    @FXML
    private Label cLocal;
    @FXML
    private Label cVisitante;
    @FXML
    private Label lStatus;
    @FXML
    private ImageView imgCorredores;
    @FXML
    private AnchorPane juego;
    
    public ScoreboardWSService service;
    
    @Resource
    protected WebServiceContext context;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    void setGame(Game item) {
        this.game=item;
        eVisitante.setText(this.game.getAway_team_name());
        cVisitante.setText(this.game.getAway_team_runs());
        eLocal.setText(this.game.getHome_team_name());
        cLocal.setText(this.game.getHome_team_runs());
        if(!item.getInning().equals("0")){
               lInning.setText(this.game.getInning());
        }else{
            lInning.setText("");
        }
        lStatus.setText(this.game.getStatus());
        juego.setOnMouseClicked(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                if(event.getClickCount()==1){
                    try {
                        URL url = new URL(game.getGameday_link());
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
    }
}
