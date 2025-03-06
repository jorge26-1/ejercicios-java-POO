/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaluces;

/**
 *
 * @author SENA
 */
import java.util.Scanner;

public class Menu {
    private SistemaLuces sistemaLuces;

    public Menu(SistemaLuces sistemaLuces) {
        this.sistemaLuces = sistemaLuces;
    }

    
    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- Menú de Control de Luces Automático ---");
            System.out.println("1. Mensaje de bienvenida");
            System.out.println("2. Cambiar hora (día/noche)");
            System.out.println("3. Verificar el estado de las luces");
            System.out.println("4. Simular control de luces");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mostrarMensajeBienvenida();
                    break;
                case 2:
                    cambiarHora();
                    break;
                case 3:
                    mostrarEstadoLuces();
                    break;
                case 4:
                    simularControlLuces();
                    break;
                case 5:
                    salir = true;
                    System.out.println("Gracias por usar el sistema de control de luces.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }

    
    private void mostrarMensajeBienvenida() {
        System.out.println("\nBienvenido al sistema de control de luces automático.");
        System.out.println("El sistema enciende las luces si es de noche y hay movimiento.");
        System.out.println("Si no, apaga las luces.");
    }

    
    private void cambiarHora() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Es de noche? (s/n): ");
        String respuesta = scanner.nextLine();

        if (respuesta.equalsIgnoreCase("s")) {
            sistemaLuces.cambiarHora(true);
            System.out.println("La hora ha sido cambiada a noche.");
        } else {
            sistemaLuces.cambiarHora(false);
            System.out.println("La hora ha sido cambiada a día.");
        }
    }

    
    private void mostrarEstadoLuces() {
        sistemaLuces.mostrarEstado();
    }

    
    private void simularControlLuces() {
        System.out.println("Simulando el control de luces...");
        for (int i = 0; i < 10; i++) { 
        
            sistemaLuces.controlarLuces();
            sistemaLuces.mostrarEstado();
            try {
                Thread.sleep(10000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
