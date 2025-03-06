/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cine;

/**
 *
 * @author SENA
 */
public class Silla {
    

    private int numero;
    private boolean ocupada;

    public Silla(int numero) {
        this.numero = numero;
        this.ocupada = false;  
    }

    public int getNumero() {
        return numero;
    }

    public boolean estaOcupada() {
        return ocupada;
    }

    public void ocupar() {
        this.ocupada = true;
    }

    public void liberar() {
        this.ocupada = false;
    }
}


