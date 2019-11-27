/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.sergigabol.reunions.persistence;

import java.util.List;
import net.sergigabol.reunions.domain.Reunio;

/**
 *
 * @author gabalca
 */
public interface ReunioDao {
    
    void crearNovaReunio(Reunio r);
    void eliminarReunio(long id) throws ReunioNotFoundException;
    Reunio buscarReunio(long id) throws ReunioNotFoundException;
    List<Reunio> consultaReunions();
    
    
}
