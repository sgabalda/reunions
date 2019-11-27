/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.sergigabol.reunions.negoci;

import java.util.List;
import net.sergigabol.reunions.domain.Reunio;

/**
 *
 * @author gabalca
 */
public interface ReunioBusiness {
    
    void novaReunio(Reunio r) throws ReunioColisionaException;
    List<Reunio> veureReunions();
    void cancelaReunio(Reunio r) throws ReunioNoExisteixException,ReunioPassadaException;
    
}
