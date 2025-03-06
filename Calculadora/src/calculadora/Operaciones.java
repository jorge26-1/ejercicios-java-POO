/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author SENA
 */
public class Operaciones {

    
    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }

    
    public static double restar(double num1, double num2) {
        return num1 - num2;
    }

    
    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    
    public static double dividir(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: No se puede dividir por 0.");
            return Double.NaN; 
        }
        return num1 / num2;
    }
}
