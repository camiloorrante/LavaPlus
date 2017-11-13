/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lavaplus.controllers;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 *
 * @author camil
 */
public class DocumentController {
    static final String login = "/lavaplus/views/XmlLogin.fxml";
    static final String puntoVenta = "/lavaplus/views/XmlPuntoVenta.fxml";
    static final String clientes = "/lavaplus/views/XmlClientes.fxml";
    private static DocumentController instance;
    Stage primaryStage;
    
    
    private DocumentController(){ }
    
    public static DocumentController getInstance(){
        if(instance == null){
            instance = new DocumentController();
        }
            
        return instance;
    }
    
    public void setStage(Stage primaryStage){
        this.primaryStage = primaryStage; 
    }
    
    public void mostrarLogin() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource(login));
        Scene scene = new Scene(root);
        
        primaryStage.setTitle("Lava Plus v1.0");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public void mostrarPuntoVenta()throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource(puntoVenta));
        Scene sceneAux = new Scene(root);
        
        primaryStage.hide();
        primaryStage.setScene(sceneAux);
        primaryStage.show();
    }
    
    
    
}
