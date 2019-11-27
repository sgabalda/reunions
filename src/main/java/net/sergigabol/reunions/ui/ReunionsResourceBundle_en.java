/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.sergigabol.reunions.ui;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.ResourceBundle;

/**
 *
 * @author gabalca
 */
public class ReunionsResourceBundle_en extends ResourceBundle{

    @Override
    protected Object handleGetObject(String string) {
        if("clau".equals(string)){
            return "clau EN";
        }
        return null;
    }

    @Override
    public Enumeration<String> getKeys() {
        return Collections.enumeration(Arrays.asList("clau"));
    }
    
}
