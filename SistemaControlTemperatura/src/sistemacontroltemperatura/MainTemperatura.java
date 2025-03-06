/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemacontroltemperatura;

/**
 *
 * @author SENA
 */
public class MainTemperatura {

    public static void main(String[] args) {
        
        Sensor sensor = new Sensor();
        SistemaControlTemperatura sistemaControl = new SistemaControlTemperatura();
        Menu menu = new Menu(sensor, sistemaControl);

        
        menu.mostrarMenu();
    }
}
