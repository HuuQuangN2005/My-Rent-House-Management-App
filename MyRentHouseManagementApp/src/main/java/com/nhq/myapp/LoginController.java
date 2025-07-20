/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.nhq.myapp;

import com.nhq.utils.mystage.MyStage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;


/**
 * FXML Controller class
 *
 * @author huuqu
 */
public class LoginController implements Initializable {
    
    @FXML private TextField usernameText;
    @FXML private TextField passwordText;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    public void handleClose(ActionEvent event){
        Platform.exit();
    }
    
}
