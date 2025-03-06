/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fizzbuzz;

/**
 *
 * @author SENA
 */
import java.util.Scanner;

public class Menu {
    private FizzBuzz fizzBuzz;

    public Menu(FizzBuzz fizzBuzz) {
        this.fizzBuzz = fizzBuzz;
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- Menú de FizzBuzz ---");
            System.out.println("1. Mensaje de bienvenida");
            System.out.println("2. Resolver el ejercicio FizzBuzz");
            System.out.println("3. Volver a hacer otro ejercicio");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea

            switch (opcion) {
                case 1:
                    mostrarMensajeBienvenida();
                    break;
                case 2:
                    resolverFizzBuzz();
                    break;
                case 3:
                    volverHacerOtroEjercicio();
                    break;
                case 4:
                    salir = true;
                    System.out.println("Gracias por usar el programa de FizzBuzz.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        }
    }

    private void mostrarMensajeBienvenida() {
        System.out.println("\nBienvenido al juego FizzBuzz.");
        System.out.println("Este programa recorre los números del 1 al 100 y para cada número:");
        System.out.println("- Si es divisible por 3, imprime 'Fizz'");
        System.out.println("- Si es divisible por 5, imprime 'Buzz'");
        System.out.println("- Si es divisible por ambos, imprime 'FizzBuzz'");
        System.out.println("- Si no es divisible por ninguno, imprime el número.");
    }

    private void resolverFizzBuzz() {
        fizzBuzz.jugar();
    }

    private void volverHacerOtroEjercicio() {
        System.out.print("\n¿Desea volver a hacer el ejercicio? (s/n): ");
        Scanner scanner = new Scanner(System.in);
        String respuesta = scanner.nextLine();

        if (respuesta.equalsIgnoreCase("s")) {
            fizzBuzz.jugar();
        } else {
            System.out.println("Gracias por usar el programa de FizzBuzz.");
        }
    }
}
