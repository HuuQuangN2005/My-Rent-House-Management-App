/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhq.utils.theme;

import com.nhq.myapp.App;

/**
 *
 * @author huuqu
 */
public class DarkFactory implements ThemeFactory{

    @Override
    public String getStyleSheet() {
        return App.class.getResource("/com/nhq/myapp/css/dark-theme.css").toExternalForm();
    }
    
}
