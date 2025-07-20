/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhq.utils.theme;

import javafx.scene.Scene;

/**
 *
 * @author huuqu
 */
public class ThemeManager {
    private static ThemeFactory themeFactory = new LightFactory();
    
    public static void setThemeFactory(ThemeFactory aThemeFactory){
        themeFactory = aThemeFactory;
    }
    
    public static void applyTheme(Scene scene){
        scene.getRoot().getStylesheets().removeIf((css)-> css.matches(".*-theme\\.css$"));
        scene.getRoot().getStylesheets().add(themeFactory.getStyleSheet());
    }
}
