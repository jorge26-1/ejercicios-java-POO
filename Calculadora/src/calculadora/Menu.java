/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author SENA
 */
import java.util.Scanner;

public class Menu {

    private Calculadora calculadora;

    public Menu(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            
            System.out.println("\n--- Menú de Calculadora ---");
            System.out.println("1. Mensaje de bienvenida");
            System.out.println("2. Realizar operación");
            System.out.println("3. Volver a hacer otro cálculo");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    mostrarMensajeBienvenida();
                    break;
                case 2:
                    realizarOperacion();
                    break;
                case 3:
                    volverHacerOtroCalculo();
                    break;
                case 4:
                    salir = true;
                    System.out.println("Gracias por usar la calculadora.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        }
    }

    
    private void mostrarMensajeBienvenida() {
        System.out.println("\nBienvenido a la calculadora simple.");
        System.out.println("Este programa le permite realizar operaciones matemáticas simples.");
        System.out.println("Puede realizar operaciones de suma, resta, multiplicación y división.");
    }

    
    private void realizarOperacion() {
        calculadora.realizarOperacion();
    }

    
    private void volverHacerOtroCalculo() {
        System.out.print("\n¿Desea realizar otro cálculo? (s/n): ");
        Scanner scanner = new Scanner(System.in);
        String respuesta = scanner.nextLine();

        if (respuesta.equalsIgnoreCase("s")) {
            calculadora.realizarOperacion();
        } else {
            System.out.println("Gracias por usar la calculadora.");
        }
    }
}
