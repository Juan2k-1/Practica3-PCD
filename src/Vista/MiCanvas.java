/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

/**
 *
 * @author juald
 */
public class MiCanvas extends Canvas {
    private int[] contadores = {0,0};
    
    public MiCanvas(int ancho, int alto){
        super();
        setSize(ancho, alto);
        setBackground(Color.PINK);
        repaint();
    }
    
    @Override
    public void update(Graphics g){
        paint(g);
    }
    
    @Override
    public void paint(Graphics g){
        
        Image offscreen = createImage(this.getWidth(), this.getHeight());
        Graphics bg = offscreen.getGraphics();
        
        Font f1 = new Font("Arial", Font.ITALIC, 20);
        Font f2 = new Font("Courier", Font.BOLD | Font.ITALIC,20);
        bg.setFont(f1);
        bg.setColor(Color.red);
        
        bg.drawString("Contador 1: " + contadores[0], 100, 50);
        
        bg.setFont(f2);
        bg.setColor(Color.BLUE);
        bg.drawString("Contador 2: " + contadores[1], 100, 100);
        
        bg.fillRect(50, 30, 20, 20);
        bg.fillOval(50, 80, 20, 20);
        
        g.drawImage(offscreen, 0, 0, null);      
    }

    public void actualiza(int[] contadores) {
        this.contadores = contadores;
        repaint();
    }
}
