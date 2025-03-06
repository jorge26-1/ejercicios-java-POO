/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cine;

/**
 *
 * @author SENA
 */
import java.util.Scanner;

public class Usuario {
    private Persona persona;

    public Usuario(Persona persona) {
        this.persona = persona;
    }

    public void hacerReserva(Sala sala) {
        if (!sala.haySillasDisponibles()) {
            System.out.println("Lo siento, no hay asientos disponibles.");
        } else {
            if (!sala.hacerReserva(persona)) {
                System.out.println("No se pudo realizar la reserva.");
            }
        }
    }

    public void mostrarReserva(Sala sala) {
        sala.mostrarEstado();
    }

    public void reiniciarSala(Sala sala) {
        sala.reiniciarSala();
        System.out.println("La sala ha sido reiniciada.");
    }
}
