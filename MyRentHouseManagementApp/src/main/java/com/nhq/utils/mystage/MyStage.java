/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhq.utils.mystage;

import java.io.IOException;
import javafx.stage.Stage;

/**
 *
 * @author huuqu
 */
public class MyStage {
    private static MyStage instance;
    private final Stage stage;
    
    private MyStage(){
        stage = new Stage();
    }
    
    public static MyStage getInstance(){
        if(instance == null)
            instance = new MyStage();
        return instance;
    }
    
    public void showStage(IStage istage) throws IOException{
        istage.decorate(stage);
        stage.show();
    }
}
