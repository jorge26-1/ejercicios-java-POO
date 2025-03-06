/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sensormovimiento;

/**
 *
 * @author SENA
 */
public class MainSensorMovimiento {

    public static void main(String[] args) {
        
        SistemaSeguridad sistemaSeguridad = new SistemaSeguridad();
        Menu menu = new Menu(sistemaSeguridad);

        
        menu.mostrarMenu();
    }
}
