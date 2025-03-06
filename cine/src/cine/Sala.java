/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cine;

/**
 *
 * @author SENA
 */
import java.util.ArrayList;

public class Sala {
    private String nombre;
    private ArrayList<Silla> sillas;

    public Sala(String nombre, int cantidadSillas) {
        this.nombre = nombre;
        sillas = new ArrayList<>();
        for (int i = 1; i <= cantidadSillas; i++) {
            sillas.add(new Silla(i));
        }
    }

    public String getNombre() {
        return nombre;
    }

    public boolean haySillasDisponibles() {
        for (Silla silla : sillas) {
            if (!silla.estaOcupada()) {
                return true;
            }
        }
        return false;
    }

    public boolean hacerReserva(Persona persona) {
        for (Silla silla : sillas) {
            if (!silla.estaOcupada()) {
                silla.ocupar();
                System.out.println("Reserva exitosa para " + persona.getNombre() + ". Silla número: " + silla.getNumero());
                return true;
            }
        }
        return false;
    }

    public void mostrarEstado() {
        System.out.println("Estado de la sala " + nombre + ":");
        for (Silla silla : sillas) {
            System.out.println("Silla " + silla.getNumero() + " - " + (silla.estaOcupada() ? "Ocupada" : "Disponible"));
        }
    }

    public void reiniciarSala() {
        for (Silla silla : sillas) {
            silla.liberar();
        }
    }
}


