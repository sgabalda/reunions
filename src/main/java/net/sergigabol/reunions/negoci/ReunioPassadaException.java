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
public class ReunioPassadaException extends Exception {

    private Reunio reunio;

    public ReunioPassadaException(Reunio reunio, String message) {
        super(message);
        this.reunio = reunio;
    }

    public ReunioPassadaException(Reunio reunio, String message, Throwable cause) {
        super(message, cause);
        this.reunio = reunio;
    }

    public Reunio getReunio() {
        return reunio;
    }

}
