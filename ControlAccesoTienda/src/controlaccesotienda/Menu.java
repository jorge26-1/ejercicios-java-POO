/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlaccesotienda;

/**
 *
 * @author SENA
 */
import java.util.Scanner;

public class Menu {
    private Scanner scanner;

    public Menu() {
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion;

        do {
            
            System.out.println("Bienvenido al sistema de control de acceso a la tienda.");
            System.out.println("1. Resolver ejercicio");
            System.out.println("2. Volver a hacer otro ejercicio");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    resolverEjercicio();
                    break;
                case 2:
                    
                    break;
                case 3:
                    System.out.println("Gracias por usar el sistema. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    break;
            }
        } while (opcion != 3);
    }

    
    private void resolverEjercicio() {
        
        System.out.print("¿El cliente tiene membresía? (true/false): ");
        boolean tieneMembresia = scanner.nextBoolean();

        System.out.print("¿El cliente es empleado? (true/false): ");
        boolean esEmpleado = scanner.nextBoolean();

        System.out.print("¿Qué hora es? (Ingrese la hora en formato 24 horas): ");
        int horaAcceso = scanner.nextInt();

        
        Cliente cliente = new Cliente(tieneMembresia, esEmpleado, horaAcceso);

        
        if (cliente.puedeAcceder()) {
            System.out.println("Acceso permitido a la tienda.");
        } else {
            System.out.println("Acceso denegado. No cumple con los requisitos.");
        }
    }
}
