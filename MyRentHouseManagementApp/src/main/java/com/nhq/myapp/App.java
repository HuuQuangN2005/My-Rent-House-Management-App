package com.nhq.myapp;

import com.nhq.utils.JdbcConnector;
import com.nhq.utils.mystage.BaseStage;
import com.nhq.utils.mystage.IStage;
import com.nhq.utils.mystage.MyStage;
import com.nhq.utils.mystage.ResizeDecorator;
import com.nhq.utils.mystage.TitleDecorator;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

        private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        
        IStage decorated = new ResizeDecorator(new TitleDecorator(new BaseStage("login.fxml"),"Login Form"),false);
        MyStage.getInstance().showStage(decorated);
    }

    @Override
    public void stop() throws Exception {
        super.stop(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        //JdbcConnector.getInstance().close();
        
    }
    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}