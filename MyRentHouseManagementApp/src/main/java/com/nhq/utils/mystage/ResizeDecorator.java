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
public class ResizeDecorator extends StageDecorator{
    private final boolean resizable;
    public ResizeDecorator(IStage decoratedStage,boolean resizable) {
        super(decoratedStage);
        this.resizable = resizable;
    }
    @Override
    public void decorate(Stage stage) throws IOException {
        super.decorate(stage); 
        stage.setResizable(resizable);
    }
}
