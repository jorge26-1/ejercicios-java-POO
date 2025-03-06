/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

/**
 *
 * @author SENA
 */

import java.util.Scanner;

public class Calculadora {

    private Scanner scanner;

    public Calculadora() {
        scanner = new Scanner(System.in);
    }

    public void realizarOperacion() {
        double num1, num2;
        String operacion;

        
        System.out.print("Ingrese el primer número: ");
        num1 = scanner.nextDouble();

        
        System.out.print("Ingrese el segundo número: ");
        num2 = scanner.nextDouble();

        
        System.out.print("Ingrese la operación (suma, resta, multiplicacion, division): ");
        operacion = scanner.next().toLowerCase();

        
        double resultado = 0;
        switch (operacion) {
            case "suma":
                resultado = Operaciones.sumar(num1, num2);
                break;
            case "resta":
                resultado = Operaciones.restar(num1, num2);
                break;
            case "multiplicacion":
                resultado = Operaciones.multiplicar(num1, num2);
                break;
            case "division":
                resultado = Operaciones.dividir(num1, num2);
                break;
            default:
                System.out.println("Operación no válida.");
                return;
        }

        
        System.out.println("El resultado de la " + operacion + " es: " + resultado);
    }
}

