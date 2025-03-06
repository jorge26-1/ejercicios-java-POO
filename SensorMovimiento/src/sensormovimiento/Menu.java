/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sensormovimiento;

/**
 *
 * @author SENA
 */
import java.util.Scanner;

public class Menu {
    private SistemaSeguridad sistemaSeguridad;

    public Menu(SistemaSeguridad sistemaSeguridad) {
        this.sistemaSeguridad = sistemaSeguridad;
    }

    
    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            
            System.out.println("\n--- Menú de Sistema de Seguridad ---");
            System.out.println("1. Mensaje de bienvenida");
            System.out.println("2. Activar/Desactivar alarma");
            System.out.println("3. Cambiar hora (día/noche)");
            System.out.println("4. Leer sensores y mostrar estado");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    mostrarMensajeBienvenida();
                    break;
                case 2:
                    activarDesactivarAlarma();
                    break;
                case 3:
                    cambiarHora();
                    break;
                case 4:
                    leerSensores();
                    break;
                case 5:
                    salir = true;
                    System.out.println("Gracias por usar el sistema de seguridad.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        }
    }

    
    private void mostrarMensajeBienvenida() {
        System.out.println("\nBienvenido al sistema de seguridad con sensores de movimiento.");
        System.out.println("El sistema activa la alarma si al menos dos sensores detectan movimiento y es de noche.");
    }

    
    private void activarDesactivarAlarma() {
        sistemaSeguridad.cambiarEstadoAlarma();
        sistemaSeguridad.mostrarEstado();
    }

    
    private void cambiarHora() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Es de noche? (s/n): ");
        String respuesta = scanner.nextLine();

        if (respuesta.equalsIgnoreCase("s")) {
            sistemaSeguridad.cambiarHora(true);
            System.out.println("La hora ha sido cambiada a noche.");
        } else {
            sistemaSeguridad.cambiarHora(false);
            System.out.println("La hora ha sido cambiada a día.");
        }
    }

    
    private void leerSensores() {
        sistemaSeguridad.leerSensores();
        sistemaSeguridad.mostrarEstado();
    }
}

