/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.sergigabol.reunions.ui;

import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;
import net.sergigabol.reunions.domain.Reunio;
import net.sergigabol.reunions.negoci.ReunioBusiness;

/**
 *
 * @author gabalca
 */
public class CLI {

    private ReunioBusiness reunioBusiness;

    private Scanner in;
    private ResourceBundle messages;
    private Locale loc;

    public CLI(ReunioBusiness reunioBusiness) {
        this.reunioBusiness = reunioBusiness;
        in = new Scanner(System.in);
        messages = ResourceBundle.getBundle("missatges");
        loc = Locale.getDefault();
    }

    /**
     * Comença a executar la UI en un entorn de CLI
     */
    public void run() {
        boolean quit = false;

        do {
            //mostrem el menu
            String opcio = mostraMenu();
            //obtenim lopcio pitjada

            System.out.println("Opcio " + opcio);
            
            switch(opcio){
                case "l":
                    canviaIdioma();
                    break;
                case "q":
                    quit=true;
                    break;
                case "2":
                    showReunions();
                    break; 
            }

        } while (!quit);
        //tornar al principi
    }
    
    protected void showReunions(){
        /*
        System.out.println(messages.getString("reunio.introdueixId"));
        long id = 0;
        try{
            id = Long.parseLong(in.nextLine());
        }catch(NumberFormatException e){
            System.out.println(messages.getString("reunio.errorId"));
            return;
        }
        */
        List<Reunio> reunions = reunioBusiness.veureReunions();
        
        if(reunions!=null && !reunions.isEmpty()){
            System.out.println("id\tnom\tdata\t\tinici\tfi\tcost\tlloc");
            
            NumberFormat nf = NumberFormat.getCurrencyInstance(loc);
            
            DateTimeFormatter df = DateTimeFormatter.ofPattern("dd MMMM", loc);
            
            reunions.forEach(r -> {
                StringBuilder sb = new StringBuilder();
                sb
                        .append(r.getId()).append("\t")
                        .append(r.getNom()).append("\t")
                        .append(df.format(r.getData())).append("\t")
                        .append(r.getInici()).append("\t")
                        .append(r.getFi()).append("\t")
                        .append(nf.format(r.getCost())).append("\t")
                        .append(r.getLloc()).append("\t")
                        ;
                System.out.println(sb.toString());
            });
            
        }else{
            System.out.println("No hi ha reunions");
        }
        
        
        
    }

    protected void canviaIdioma() {
        System.out.println("1- " + messages.getString("idiomes.angles"));
        System.out.println("2- " + messages.getString("idiomes.frances"));
        System.out.println("3- " + messages.getString("idiomes.catala"));

        String option = in.nextLine();
        
        switch (option) {
            case "1":
                loc = Locale.UK;
                break;
            case "2":
                loc = Locale.FRENCH;
                break;
            case "3":
                //loc = new Locale("ca","ES");
                loc = new Locale.Builder()
                        .setLanguage("ca")
                        .setRegion("ES")
                        .build();
                break;
            default:
                System.out.println(messages.getString("idiomes.novalid"));
                return;
        }
        System.out.println(loc);
        messages = ResourceBundle.getBundle("missatges", loc);
        System.out.println("Messages en "+messages.getLocale());
    }

    protected String mostraMenu() {
        System.out.println("Menu en "+messages.getLocale());
        System.out.println("1- " + messages.getString("menu.opcio1"));
        System.out.println("2- " + messages.getString("menu.opcio2"));
        System.out.println("3- " + messages.getString("menu.opcio3"));
        System.out.println("l- " + messages.getString("menu.language"));
        System.out.println("q- " + messages.getString("menu.quit"));

        return in.nextLine();
    }

}
