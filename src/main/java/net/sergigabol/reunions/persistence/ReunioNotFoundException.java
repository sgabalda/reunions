/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.sergigabol.reunions.persistence;

/**
 *
 * @author gabalca
 */
public class ReunioNotFoundException extends Exception{
    private long id;

    public ReunioNotFoundException(long id, String message) {
        super(message);
        this.id = id;
    }

    public ReunioNotFoundException(long id, String message, Throwable cause) {
        super(message, cause);
        this.id = id;
    }

    public long getId() {
        return id;
    }
    
}
