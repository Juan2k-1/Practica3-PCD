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
public class CanvasCola extends Canvas {

    private int head;
    private int tail;
    private final int capacidad;
    private int numElementos;
    private Object datos[];
    private String mensaje;

    public CanvasCola(int capacidad) {
        super();

        this.mensaje = "";
        this.capacidad = capacidad;
        this.datos = new Object[this.capacidad];
        this.head = 0;
        this.tail = -1;
        this.numElementos = 0;

        repaint();
    }

    @Override
    public void paint(Graphics g) {
        Image offscreen = createImage(this.getWidth(), this.getHeight());
        Graphics bg = offscreen.getGraphics();
        bg.setColor(Color.WHITE);
        int separacion = 0;

        for (int i = 0; i < 10; i++) {
            bg.setColor(Color.blue);
            bg.fillRect(this.getWidth() / 4 - 100 + separacion, 250 , 50, 40);
            bg.setColor(Color.white);

            if (datos[i] != null) {
                
                bg.drawString("" + datos[i], (this.getWidth() / 4 - 85 + separacion), 275 );
            }

            /*if (this.tail == 0) {
                bg.drawString("Tail", 400, 100);
            } else {
                bg.drawString("Tail", 400, 100 + i * 50);

            }*/
            separacion = separacion + 70;
        }

        Font f2 = new Font("Arial", Font.BOLD, 20);
        bg.setFont(f2);
        bg.setColor(Color.red);
        bg.drawString(mensaje, 50, 350);

        g.drawImage(offscreen, 0, 0, null);
    }

    @Override
    public void update(Graphics g) {
        repaint();
        paint(g);
    }

    public void avisa(String mensaje) {
        this.mensaje = mensaje;
        repaint();
    }

    public void representa(Object buffer[], int head, int tail, int numElementos) {
        for (int i = 0; i < 10; i++) {
            this.datos[i] = buffer[i];
        }
        this.head = head;
        System.out.println("Head: " + this.head);
        this.tail = tail;
        System.out.println("Tail: " + this.tail);
        this.numElementos = numElementos;

        repaint();
    }
}
