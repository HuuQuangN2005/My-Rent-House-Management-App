/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhq.utils.mystage;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import com.nhq.myapp.App;
import com.nhq.utils.theme.ThemeManager;
/**
 *
 * @author huuqu
 */
public class BaseStage implements IStage{
    private final String fxml;
    private static Scene scene;
    public BaseStage(String fxml) {
        this.fxml = fxml;
    }
    @Override
    public void decorate(Stage stage) throws IOException {
        if(!stage.isShowing()){
            if(scene == null)
                scene = new Scene(new FXMLLoader(App.class.getResource(fxml)).load());
            else
                scene.setRoot(new FXMLLoader(App.class.getResource(fxml)).load());
            
            ThemeManager.applyTheme(scene);
            stage.setScene(scene);
        }
    }  
}
