/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.sergigabol.reunions.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author gabalca
 */
public class Reunio {
    
    private Long id;
    private String nom;
    private LocalDate data;
    private LocalTime inici;
    private LocalTime fi;
    private String lloc;
    private BigDecimal cost;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getInici() {
        return inici;
    }

    public void setInici(LocalTime inici) {
        this.inici = inici;
    }

    public LocalTime getFi() {
        return fi;
    }

    public void setFi(LocalTime fi) {
        this.fi = fi;
    }

    public String getLloc() {
        return lloc;
    }

    public void setLloc(String lloc) {
        this.lloc = lloc;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }
    
    
}
