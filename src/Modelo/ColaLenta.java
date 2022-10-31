/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Vista.CanvasCola;

/**
 *
 * @author juald
 */
public class ColaLenta implements ICola {

    private int head;
    private int tail;
    private final int capacidad;
    private int numelementos;
    private Object Datos[];
    private CanvasCola canvas;

    /**
     * Constructor parametrizado que inicializa los atributos de la clase
     *
     * @param capacidad Capacidad máxima de la cola
     * @param canvas
     */
    public ColaLenta(int capacidad, CanvasCola canvas) {
        this.head = 0;
        this.tail = -1;
        this.capacidad = capacidad;
        this.numelementos = 0;
        this.Datos = new Object[this.capacidad];
        this.canvas = canvas;
    }

    /**
     * Este método nos devuelve el número de elementos que tiene la cola
     * actualmente
     *
     * @return El número de elementos que tiene la cola
     */
    @Override
    public int getNum() {

        return this.numelementos;
    }

    /**
     * Este método añade nuevos elementos a la cola Para ello, si la cola no
     * está llena, se coloca en la posición a la que apunta tail e incrementamos
     * su posición
     *
     * @param elemento El elemento que queremos insertar
     * @throws java.lang.Exception Si la cola no esta llena
     */
    @Override
    public synchronized void acola(Object elemento) throws java.lang.Exception {
        if (!this.colaLlena()) {
            this.tail++;
            Thread.sleep(100);
            if (this.tail == this.capacidad) {
                this.tail = 0;
                this.canvas.avisa("Cola Llena");
            }
            this.Datos[this.tail] = elemento;
            Thread.sleep(100);
            this.numelementos++;
            this.canvas.representa(this.Datos, this.head, this.tail, this.numelementos);
        }
    }

    /**
     * Este método elimina elementos de la cola Para ello cuando extraemos un
     * elemento, si la cola no está vacía, Se toma el de la posición a la que
     * apunta head e incrementamos su posición
     *
     * @return El elemento que extraemos
     * @throws java.lang.Exception Si la cola no está vacía
     */
    @Override
    public synchronized Object desacola() throws java.lang.Exception {

        if (!this.colaVacia()) {
            this.head++;
            Thread.sleep(100);
            if (this.head == this.capacidad) {
                this.head = 0;
                this.canvas.avisa("Cola Vacía");
            }
        } else {
            this.head = 0;
            this.tail = -1;
        }
        Thread.sleep(100);
        this.numelementos--;
        this.canvas.representa(this.Datos, this.head, this.tail, this.numelementos);
        return this.Datos[this.head];
    }

    /**
     * Este método nos devuelve el primer elemento de la cola
     *
     * @return El primer elemento de la cola
     * @throws java.lang.Exception SI la no está vacía
     */
    @Override
    public Object primero() throws java.lang.Exception {
        if (!this.colaVacia()) {
            return this.Datos[this.head];
        } else {
            throw new java.lang.Exception("La cola esta vacia");
        }
    }

    /**
     * Este método nos indica si la cola está vacía Si devuelve true está vacía,
     * sino, devolverá false
     *
     * @return Verdadero si la cola es vacía
     */
    public boolean colaVacia() {
        return this.numelementos == 0;           
    }

    /**
     * Este método nos indica si la cola está llena Si devuelve true estará
     * llena, sino, devolverá false
     *
     * @return Verdadero si la cola está llena
     */
    public boolean colaLlena() {
        return this.numelementos == this.capacidad;       
    }
}
