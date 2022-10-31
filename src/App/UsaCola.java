/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package App;

import Modelo.Productor;
import Modelo.Consumidor;
import Modelo.ColaLenta;
import Modelo.Recurso;
import Modelo.Sumador;
import Vista.CanvasCola;
import Vista.ColaFrame;
import Vista.ContadoresApp;
import Vista.MiCanvas;
import java.awt.Color;

/**
 *
 * @author juald
 */
public class UsaCola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here   
        /*CanvasCola canvas = new CanvasCola(10);
        ColaLenta cola = new ColaLenta(10, canvas);
        ColaFrame ventana = new ColaFrame();
        
        ventana.setSize(1024,768);
     
        ventana.add(canvas);
        ventana.setVisible(true);
        
        
        Thread hilo1 = new Thread(new Productor(cola));
        Thread hilo4 = new Thread(new Productor(cola));
        Thread hilo5 = new Thread(new Productor(cola));
        
        Thread hilo2 = new Thread(new Consumidor(cola));
        Thread hilo3 = new Thread(new Consumidor(cola));     
    
        hilo1.start();
        hilo4.start();
        hilo5.start();
       
        
        try {
            hilo1.join();  
            hilo4.join();
            hilo5.join();
        } catch (InterruptedException ex) {
            System.out.println("Capturada execpcion de join " + ex.getMessage());
        }
        
        
        hilo2.start();
        //hilo3.start(); 
              
        try {
            hilo2.join();
            //hilo3.join();          
        } catch (InterruptedException ex) {
            System.out.println("Capturada execpcion de join " + ex.getMessage());
        }  */     
        /*
        Thread h[] = new Thread[3];
        int alto = 400;
        int ancho = 600;
        MiCanvas cv = new MiCanvas(ancho, alto);
        Recurso r = new Recurso(cv);
        ContadoresApp MiContador = new ContadoresApp();

        for (int i = 0; i < 3; i++) {

            h[i] = new Sumador(r, i);

        }
        MiContador.setTitle("Mi App");

        MiContador.add(cv);

        MiContador.setSize(ancho, alto);
        MiContador.setBackground(Color.DARK_GRAY);
        MiContador.setVisible(true);

        Sumador h1 = new Sumador(r, 0);
        Sumador h2 = new Sumador(r, 1);
        Sumador h3 = new Sumador(r, 1);

        h1.start();
        h2.start();
        h3.start();*/
    }
}
