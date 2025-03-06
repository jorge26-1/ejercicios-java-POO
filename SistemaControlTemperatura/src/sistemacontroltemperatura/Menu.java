/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemacontroltemperatura;

/**
 *
 * @author SENA
 */
import java.util.Scanner;

public class Menu {

    private Sensor sensor;
    private SistemaControlTemperatura sistemaControl;

    public Menu(Sensor sensor, SistemaControlTemperatura sistemaControl) {
        this.sensor = sensor;
        this.sistemaControl = sistemaControl;
    }

    
    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
           
            System.out.println("\n--- Menú de Control de Temperatura ---");
            System.out.println("1. Mensaje de bienvenida");
            System.out.println("2. Simular lectura de temperatura y control");
            System.out.println("3. Volver a hacer otro ejercicio");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    mostrarMensajeBienvenida();
                    break;
                case 2:
                    simularLecturaTemperatura();
                    break;
                case 3:
                    volverHacerOtroEjercicio();
                    break;
                case 4:
                    salir = true;
                    System.out.println("Gracias por usar el control de temperatura.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        }
    }

    // Método para mostrar el mensaje de bienvenida
    private void mostrarMensajeBienvenida() {
        System.out.println("\nBienvenido al sistema de control de temperatura en un invernadero.");
        System.out.println("Este programa simula un sensor de temperatura y activa un calefactor o ventilador dependiendo de la temperatura.");
        System.out.println("Si la temperatura es menor a 10°C, se activa el calefactor.");
        System.out.println("Si la temperatura está entre 10°C y 25°C, no se hace nada.");
        System.out.println("Si la temperatura es mayor a 25°C, se activa el ventilador.");
    }

   
    private void simularLecturaTemperatura() {
        System.out.println("\nSimulando lectura de temperatura...");
        for (int i = 0; i < 5; i++) { 
            double temperatura = sensor.leerTemperatura(); 
            sistemaControl.controlarTemperatura(temperatura); 
            try {
                Thread.sleep(5000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    
    private void volverHacerOtroEjercicio() {
        System.out.print("\n¿Desea volver a hacer el ejercicio? (s/n): ");
        Scanner scanner = new Scanner(System.in);
        String respuesta = scanner.nextLine();

        if (respuesta.equalsIgnoreCase("s")) {
            simularLecturaTemperatura();
        } else {
            System.out.println("Gracias por usar el control de temperatura.");
        }
    }
}

