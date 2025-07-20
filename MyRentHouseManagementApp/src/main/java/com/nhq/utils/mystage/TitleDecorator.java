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
public class TitleDecorator extends StageDecorator{
    private final String title;
    
    public TitleDecorator(IStage decoratedStage,String title) {
        super(decoratedStage);
        this.title = title;
    }

    @Override
    public void decorate(Stage stage) throws IOException {
        super.decorate(stage); 
        stage.setTitle(title);
    }
    
    
}
