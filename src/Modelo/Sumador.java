/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juald
 */
public class Sumador extends Thread {
    private Recurso r;
    private int contador;

    public Sumador(Recurso r, int i) {
        
        this.r = r;
        this.contador = i;
    }
    
    @Override
    public void run(){
        
        for (int i = 0; i < 1000; i++) {      
            r.incrementa(this.contador);
            try {
                sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Sumador.class.getName()).log(Level.SEVERE, null, ex);
            }       
        }  
    }   
}
