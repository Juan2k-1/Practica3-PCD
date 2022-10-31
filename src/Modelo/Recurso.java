/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Vista.MiCanvas;

/**
 *
 * @author juald
 */
public class Recurso {
    private int[] contadores = {0,0};
    private MiCanvas cv;
    
    
    public Recurso(MiCanvas cv){
        this.cv = cv;
    }
    
    /**
     * 
     * @param contador
     * @throws IndexOutOfBoundsException 
     */
    public synchronized void incrementa(int contador) throws IndexOutOfBoundsException {
        contadores[contador]++;
        System.out.println("Contador 0: " + contadores[0] + "Contador 1: " + contadores[1]);
        cv.actualiza(contadores);
    }
}
