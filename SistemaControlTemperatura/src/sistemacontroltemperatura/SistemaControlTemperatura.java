/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemacontroltemperatura;

/**
 *
 * @author SENA
 */
public class SistemaControlTemperatura {

    
    public void controlarTemperatura(double temperatura) {
        if (temperatura < 10) {
            System.out.println("La temperatura es " + temperatura + "°C. Activando calefactor...");
        } else if (temperatura >= 10 && temperatura <= 25) {
            System.out.println("La temperatura es " + temperatura + "°C. Sistema inactivo.");
        } else {
            System.out.println("La temperatura es " + temperatura + "°C. Activando ventilador...");
        }
    }
}

