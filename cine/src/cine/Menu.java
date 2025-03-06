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

public class Menu {
    private Cine cine;
    private Usuario usuario;

    public Menu(Cine cine, Usuario usuario) {
        this.cine = cine;
        this.usuario = usuario;
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- Menú de Reservas ---");
            System.out.println("1. Mensaje de bienvenida");
            System.out.println("2. Hacer reserva");
            System.out.println("3. Ver estado de la sala");
            System.out.println("4. Reiniciar la sala");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    mostrarMensajeBienvenida();
                    break;
                case 2:
                    hacerReserva();
                    break;
                case 3:
                    verEstadoSala();
                    break;
                case 4:
                    reiniciarSala();
                    break;
                case 5:
                    salir = true;
                    System.out.println("Gracias por usar el sistema de reservas.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        }
    }

    private void mostrarMensajeBienvenida() {
        System.out.println("\nBienvenido al sistema de reservas de cine.");
        System.out.println("Este sistema permite hacer reservas de asientos en una sala.");
    }

    private void hacerReserva() {
        System.out.print("Ingrese su nombre: ");
        Scanner scanner = new Scanner(System.in);
        String nombre = scanner.nextLine();
        Persona persona = new Persona(nombre);
        usuario = new Usuario(persona);
        usuario.hacerReserva(cine.getSala());
    }

    private void verEstadoSala() {
        usuario.mostrarReserva(cine.getSala());
    }

    private void reiniciarSala() {
        usuario.reiniciarSala(cine.getSala());
    }
}

