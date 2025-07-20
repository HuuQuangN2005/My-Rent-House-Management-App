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
public abstract class StageDecorator implements IStage{

    protected final IStage decoratedStage;
    
    public StageDecorator(IStage decoratedStage) {
        this.decoratedStage = decoratedStage;
    }
    @Override
    public void decorate(Stage stage) throws IOException {
         decoratedStage.decorate(stage);
    }
    
}
