/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.sergigabol.reunions;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import net.sergigabol.reunions.domain.Reunio;
import net.sergigabol.reunions.negoci.ReunioBusiness;
import net.sergigabol.reunions.negoci.ReunioColisionaException;
import net.sergigabol.reunions.negoci.ReunioNoExisteixException;
import net.sergigabol.reunions.negoci.ReunioPassadaException;
import net.sergigabol.reunions.ui.CLI;

/**
 *
 * @author gabalca
 */
public class Application {
    
    public static void main(String ... args){
        
        //Locale.setDefault(Locale.ENGLISH);
        
        CLI cli = new CLI(new ReunioBusiness() {
            @Override
            public void novaReunio(Reunio r) throws ReunioColisionaException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public List<Reunio> veureReunions() {
                Reunio r1 = new Reunio();
                r1.setId(1L);
                r1.setNom("Pres");
                r1.setData(LocalDate.now());
                r1.setInici(LocalTime.of(18, 0));
                r1.setFi(LocalTime.of(19,30));
                r1.setLloc("Sala 1");
                r1.setCost(new BigDecimal(1500));
                
               return Arrays.asList(r1);
            }

            @Override
            public void cancelaReunio(Reunio r) throws ReunioNoExisteixException, ReunioPassadaException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        cli.run();
    }
    
}

