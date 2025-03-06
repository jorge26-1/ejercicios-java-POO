/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaaireacondicionado;

/**
 *
 * @author SENA
 */

    
import java.util.Scanner;

public class Menu {
    private SistemaAireAcondicionado sistemaAireAcondicionado;

    public Menu(SistemaAireAcondicionado sistemaAireAcondicionado) {
        this.sistemaAireAcondicionado = sistemaAireAcondicionado;
    }

   
    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- Menú de Control de Aire Acondicionado ---");
            System.out.println("1. Mensaje de bienvenida");
            System.out.println("2. Verificar el estado del aire acondicionado");
            System.out.println("3. Simular control del aire acondicionado");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mostrarMensajeBienvenida();
                    break;
                case 2:
                    mostrarEstadoAireAcondicionado();
                    break;
                case 3:
                    simularControlAireAcondicionado();
                    break;
                case 4:
                    salir = true;
                    System.out.println("Gracias por usar el sistema de control de aire acondicionado.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }

    
    private void mostrarMensajeBienvenida() {
        System.out.println("\nBienvenido al sistema de control de aire acondicionado.");
        System.out.println("Este sistema enciende el aire acondicionado si:");
        System.out.println("1. La temperatura es mayor a 28°C y la humedad es mayor al 60%.");
        System.out.println("2. La temperatura es mayor a 30°C, independientemente de la humedad.");
    }

    
    private void mostrarEstadoAireAcondicionado() {
        sistemaAireAcondicionado.mostrarEstado();
    }

    
    private void simularControlAireAcondicionado() {
        System.out.println("Simulando el control del aire acondicionado...");

        for (int i = 0; i < 10; i++) { 
            sistemaAireAcondicionado.controlarAireAcondicionado();
            sistemaAireAcondicionado.mostrarEstado();

            try {
                Thread.sleep(5000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

