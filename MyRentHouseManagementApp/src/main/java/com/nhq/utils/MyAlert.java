/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhq.utils;

import javafx.scene.control.Alert;

/**
 *
 * @author huuqu
 * 
 * design pattern: Singleton
 */
public class MyAlert {
    private static MyAlert instance;
    private final Alert alert;
    
    private MyAlert(){
        this.alert = new Alert(Alert.AlertType.INFORMATION);
        this.alert.setTitle("Rent House Management App");
        this.alert.setHeaderText("Rent House Management App");
    }
    
    public static MyAlert getInstance(){
        if(instance == null)
            instance = new MyAlert();
        return instance;
    }
    
    public void showMsg(String msg){
        this.alert.setContentText(msg);
        this.alert.showAndWait();
    }
    
    
}
