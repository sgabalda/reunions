/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.sergigabol.reunions.negoci;

import net.sergigabol.reunions.domain.Reunio;

/**
 *
 * @author gabalca
 */
public class ReunioColisionaException extends Exception {
    
    private Reunio altre;

    public ReunioColisionaException(Reunio altre, String message) {
        super(message);
        this.altre = altre;
    }

    public ReunioColisionaException(Reunio altre, String message, Throwable cause) {
        super(message, cause);
        this.altre = altre;
    }
    
    public Reunio getAltre() {
        return altre;
    }
    
    
    
}
