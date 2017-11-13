/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lavaplus.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import lavaplus.controllers.DocumentController;

/**
 *
 * @author camilo
 */
public class LoginController implements Initializable {
    DocumentController docController;
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        System.out.println("You clicked me!");
        docController.mostrarPuntoVenta();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        docController = DocumentController.getInstance();
    }    
    
}
