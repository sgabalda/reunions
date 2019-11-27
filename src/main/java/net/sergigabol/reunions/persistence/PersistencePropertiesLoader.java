/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.sergigabol.reunions.persistence;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gabalca
 */
public class PersistencePropertiesLoader {
    
    public Properties getProperties(String file){
        Properties result = new Properties();
        
        try(InputStream is = new FileInputStream(file)){
            result.load(is);
        }catch (FileNotFoundException ex) {
            Logger.getLogger(PersistencePropertiesLoader.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
            Logger.getLogger(PersistencePropertiesLoader.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return result;
    }
}