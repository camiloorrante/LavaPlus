/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lavaplus;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lavaplus.controllers.DocumentController;

/**
 *
 * @author camilo
 */
public class LavaPlus extends Application {
    DocumentController docController;
    @Override
    public void start(Stage stage) throws Exception {
        docController = DocumentController.getInstance();
        docController.setStage(stage);
        docController.mostrarLogin();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
