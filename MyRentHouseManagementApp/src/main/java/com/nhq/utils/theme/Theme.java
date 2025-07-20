/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.nhq.utils.theme;
import javafx.scene.Scene;

/**
 *
 * @author huuqu
 */
public enum Theme {
    DARK {
        @Override
        public void updateTheme(Scene scene) {
            ThemeManager.setThemeFactory(new DarkFactory());
            ThemeManager.applyTheme(scene);
        }
    }, LIGHT {
        @Override
        public void updateTheme(Scene scene) {
            ThemeManager.setThemeFactory(new LightFactory());
            ThemeManager.applyTheme(scene);
        }
    };
    
    public abstract void updateTheme(Scene scene);
}
